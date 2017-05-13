package com.aijiao.core.model;

public class User {
    private Long userId;

    private String userNickname;

    private String userName;

    private String userPwd;

    private String userPhone;

    private String userIdCard;

    private String userQqKey;

    private String userWeixinKey;

    private Integer userAge;

    private String userSex;

    private Boolean userFlag;

    private String userAddress;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard == null ? null : userIdCard.trim();
    }

    public String getUserQqKey() {
        return userQqKey;
    }

    public void setUserQqKey(String userQqKey) {
        this.userQqKey = userQqKey == null ? null : userQqKey.trim();
    }

    public String getUserWeixinKey() {
        return userWeixinKey;
    }

    public void setUserWeixinKey(String userWeixinKey) {
        this.userWeixinKey = userWeixinKey == null ? null : userWeixinKey.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Boolean getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Boolean userFlag) {
        this.userFlag = userFlag;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }
}