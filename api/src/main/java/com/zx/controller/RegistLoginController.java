package com.zx.controller;

import com.zx.pojo.Users;
import com.zx.service.UsersService;
import com.zx.utils.ZxFnull;
import com.zx.utils.ZxJSONResult;
import com.zx.utils.ZxMD5Utils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.*;

/**
 * 注册登录类
 */
@RestController
public class RegistLoginController {

    @Autowired
    UsersService usersService;

    /**
     * 注册用户
     * @return
     */
    @RequestMapping("/regist")
    public ZxJSONResult RegistUser(@RequestBody Users users){
        //1.判断用户名和密码必须不为空
        if(!ZxFnull.Fnull(users.getUsername())||!ZxFnull.Fnull(users.getPassword())){
            return ZxJSONResult.errorMsg("用户名和密码不能为空");
        }
        //2.判断用户名是否存在
        boolean usernameIsExist=usersService.selectUsername(users.getUsername());
        //3.保存用户
        if(!usernameIsExist){
            /*用户名称默认为用户账号*/
            users.setNickname(users.getUsername());
            //对密码进行md5加密
            users.setPassword(ZxMD5Utils.getMD5Str(users.getPassword()));
            //默认信息设置
            users.setFansCounts(0);
            users.setReceiveLikeCounts(0);
            users.setFollowCounts(0);
            //保存用户
            boolean temp= usersService.saveUsers(users);
            if (!temp)return ZxJSONResult.errorMsg("注册失败请稍后重试");
        }else {
            return ZxJSONResult.errorMsg("用户已存在");
        }
        users.setPassword("");
        return ZxJSONResult.ok(users);
    }

    /**
     * 用户登录
     * @param users
     * @return
     */
    @PostMapping("/login")
    public ZxJSONResult Login(@RequestBody Users users){
        //对密码加密
        users.setPassword(ZxMD5Utils.getMD5Str(users.getPassword()));
        //验证是否正确
        boolean temp=usersService.selectUsers(users);
        if (temp){
            return ZxJSONResult.ok();
        }
        return ZxJSONResult.errorMsg("用户名或密码不正确");
    }

    @PostMapping("/uploadFace")
    public ZxJSONResult uploadFace(@RequestParam String usersId, @RequestParam("file") MultipartFile[] files) {
        //文件保存的命名空间
        String fileSpace="C:\\Users\\1911711878\\Desktop\\zx-wx-face";
        //保存到数据库中的相对路径
        String uploadPathDB="/"+usersId+"/face";
        FileOutputStream fileOutputStream=null;
        InputStream inputStream=null;
        try {
            if(files!=null && files.length>0){
                //图片名称
                String fileName=files[0].getOriginalFilename();
                if(StringUtils.isNotBlank(fileName)){
                    //文件上传的最终保存路径
                    String finalFacePath = fileSpace + uploadPathDB + "/" +fileName;
                    //设置数据库保存的路径
                    uploadPathDB+=("/"+fileName);

                    File outFile=new File(finalFacePath);
                    //判断是否存在该文件夹
                    if (outFile.getParentFile()!=null||!outFile.getParentFile().isDirectory()){
                        //创建父文件夹
                        outFile.getParentFile().mkdir();
                    }
                    fileOutputStream = new FileOutputStream(outFile);
                    inputStream = files[0].getInputStream();
                    IOUtils.copy(inputStream,fileOutputStream);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭流
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }

        return ZxJSONResult.errorMsg("用户名或密码不正确");
    }


}
