package com.zx.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Videos {
    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "audio_id")
    private String audioId;

    @Column(name = "video_desc")
    private String videoDesc;

    @Column(name = "video_path")
    private String videoPath;

    @Column(name = "video_secounds")
    private Float videoSecounds;

    @Column(name = "video_width")
    private Integer videoWidth;

    @Column(name = "video_height")
    private Integer videoHeight;

    @Column(name = "cover_path")
    private String coverPath;

    @Column(name = "like_counts")
    private Long likeCounts;

    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return audio_id
     */
    public String getAudioId() {
        return audioId;
    }

    /**
     * @param audioId
     */
    public void setAudioId(String audioId) {
        this.audioId = audioId == null ? null : audioId.trim();
    }

    /**
     * @return video_desc
     */
    public String getVideoDesc() {
        return videoDesc;
    }

    /**
     * @param videoDesc
     */
    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc == null ? null : videoDesc.trim();
    }

    /**
     * @return video_path
     */
    public String getVideoPath() {
        return videoPath;
    }

    /**
     * @param videoPath
     */
    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }

    /**
     * @return video_secounds
     */
    public Float getVideoSecounds() {
        return videoSecounds;
    }

    /**
     * @param videoSecounds
     */
    public void setVideoSecounds(Float videoSecounds) {
        this.videoSecounds = videoSecounds;
    }

    /**
     * @return video_width
     */
    public Integer getVideoWidth() {
        return videoWidth;
    }

    /**
     * @param videoWidth
     */
    public void setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
    }

    /**
     * @return video_height
     */
    public Integer getVideoHeight() {
        return videoHeight;
    }

    /**
     * @param videoHeight
     */
    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }

    /**
     * @return cover_path
     */
    public String getCoverPath() {
        return coverPath;
    }

    /**
     * @param coverPath
     */
    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath == null ? null : coverPath.trim();
    }

    /**
     * @return like_counts
     */
    public Long getLikeCounts() {
        return likeCounts;
    }

    /**
     * @param likeCounts
     */
    public void setLikeCounts(Long likeCounts) {
        this.likeCounts = likeCounts;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}