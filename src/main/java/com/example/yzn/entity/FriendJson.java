package com.example.yzn.entity;

public class FriendJson {
    private String id;
    private String friendid;
    private String nickname;
    private String remark;
    private String time;

    public FriendJson(String id, String friendid, String nickname, String remark, String time) {
        this.id = id;
        this.friendid = friendid;
        this.nickname = nickname;
        this.remark = remark;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFriendid() {
        return friendid;
    }

    public void setFriendid(String friendid) {
        this.friendid = friendid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}