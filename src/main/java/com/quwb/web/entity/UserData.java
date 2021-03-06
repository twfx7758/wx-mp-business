package com.quwb.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by quwb on 2017/12/5.
 */
public class UserData {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserAccount.UserID
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserAccount.UserName
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserAccount.OpenID
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserAccount.Password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserAccount.Mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserAccount.LastLoginTime
     *
     * @mbg.generated
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastlogintime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserAccount.UserID
     *
     * @return the value of UserAccount.UserID
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserAccount.UserID
     *
     * @param userid the value for UserAccount.UserID
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserAccount.UserName
     *
     * @return the value of UserAccount.UserName
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserAccount.UserName
     *
     * @param username the value for UserAccount.UserName
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserAccount.OpenID
     *
     * @return the value of UserAccount.OpenID
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserAccount.OpenID
     *
     * @param openid the value for UserAccount.OpenID
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserAccount.Password
     *
     * @return the value of UserAccount.Password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserAccount.Password
     *
     * @param password the value for UserAccount.Password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserAccount.Mobile
     *
     * @return the value of UserAccount.Mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserAccount.Mobile
     *
     * @param mobile the value for UserAccount.Mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserAccount.LastLoginTime
     *
     * @return the value of UserAccount.LastLoginTime
     *
     * @mbg.generated
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserAccount.LastLoginTime
     *
     * @param lastlogintime the value for UserAccount.LastLoginTime
     *
     * @mbg.generated
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    private List<UserShopRela> userShopRela;

    public List<UserShopRela> getUserShopRela(){return this.userShopRela;}
    public void setUserShopRela(List<UserShopRela> userShopRela){this.userShopRela=userShopRela;}

    private List<Customization> customizations;
    public List<Customization> getCustomizations(){return this.customizations;}
    public void setCustomizations(List<Customization> customizations){this.customizations=customizations;}
}
