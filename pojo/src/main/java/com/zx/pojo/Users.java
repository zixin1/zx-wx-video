package com.zx.pojo;

import javax.persistence.Column;

public class Users {

    private String id;

    private String username;

    private String password;

    @Column(name = "face_image")
    private String faceImage;

    private String nickname;

    @Column(name = "fans_counts")
    private int fansCounts;

    @Column(name = "follow_counts")
    private int followCounts;

    @Column(name = "receive_like_counts")
    private int receiveLikeCounts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getFansCounts() {
        return fansCounts;
    }

    public void setFansCounts(int fansCounts) {
        this.fansCounts = fansCounts;
    }

    public int getFollowCounts() {
        return followCounts;
    }

    public void setFollowCounts(int followCounts) {
        this.followCounts = followCounts;
    }

    public int getReceiveLikeCounts() {
        return receiveLikeCounts;
    }

    public void setReceiveLikeCounts(int receiveLikeCounts) {
        this.receiveLikeCounts = receiveLikeCounts;
    }
}