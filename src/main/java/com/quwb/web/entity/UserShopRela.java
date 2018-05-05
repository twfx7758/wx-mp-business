package com.quwb.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserShopRela {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserShopRela.RelaID
     *
     * @mbg.generated
     */
    private Integer relaid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserShopRela.UserID
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserShopRela.ShopID
     *
     * @mbg.generated
     */
    private Integer shopid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserShopRela.CreateTime
     *
     * @mbg.generated
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserShopRela.IsActive
     *
     * @mbg.generated
     */
    private Short isactive;

    private ShopInfo shopInfo;

    public ShopInfo getShopInfo(){return this.shopInfo;}
    public void setShopInfo(ShopInfo shopInfo){this.shopInfo = shopInfo;}

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserShopRela.RelaID
     *
     * @return the value of UserShopRela.RelaID
     *
     * @mbg.generated
     */
    public Integer getRelaid() {
        return relaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserShopRela.RelaID
     *
     * @param relaid the value for UserShopRela.RelaID
     *
     * @mbg.generated
     */
    public void setRelaid(Integer relaid) {
        this.relaid = relaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserShopRela.UserID
     *
     * @return the value of UserShopRela.UserID
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserShopRela.UserID
     *
     * @param userid the value for UserShopRela.UserID
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserShopRela.ShopID
     *
     * @return the value of UserShopRela.ShopID
     *
     * @mbg.generated
     */
    public Integer getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserShopRela.ShopID
     *
     * @param shopid the value for UserShopRela.ShopID
     *
     * @mbg.generated
     */
    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserShopRela.CreateTime
     *
     * @return the value of UserShopRela.CreateTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserShopRela.CreateTime
     *
     * @param createtime the value for UserShopRela.CreateTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserShopRela.IsActive
     *
     * @return the value of UserShopRela.IsActive
     *
     * @mbg.generated
     */
    public Short getIsactive() {
        return isactive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserShopRela.IsActive
     *
     * @param isactive the value for UserShopRela.IsActive
     *
     * @mbg.generated
     */
    public void setIsactive(Short isactive) {
        this.isactive = isactive;
    }
}