package com.entity.model;

import com.entity.FangchanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房产信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangchanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 房产编号
     */
    private String fangchanUuidNumber;


    /**
     * 房产名
     */
    private String fangchanName;


    /**
     * 房产户型
     */
    private Integer fangchanTypes;


    /**
     * 房产图片
     */
    private String fangchanPhoto;


    /**
     * 房产价格
     */
    private Double fangchanMoney;


    /**
     * 房产地址
     */
    private String fangchanAddress;


    /**
     * 房屋面积
     */
    private Integer fangchanMianjis;


    /**
     * 所在区域
     */
    private String fangchanQuyu;


    /**
     * 房产详情
     */
    private String fangchanContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：房产编号
	 */
    public String getFangchanUuidNumber() {
        return fangchanUuidNumber;
    }


    /**
	 * 设置：房产编号
	 */
    public void setFangchanUuidNumber(String fangchanUuidNumber) {
        this.fangchanUuidNumber = fangchanUuidNumber;
    }
    /**
	 * 获取：房产名
	 */
    public String getFangchanName() {
        return fangchanName;
    }


    /**
	 * 设置：房产名
	 */
    public void setFangchanName(String fangchanName) {
        this.fangchanName = fangchanName;
    }
    /**
	 * 获取：房产户型
	 */
    public Integer getFangchanTypes() {
        return fangchanTypes;
    }


    /**
	 * 设置：房产户型
	 */
    public void setFangchanTypes(Integer fangchanTypes) {
        this.fangchanTypes = fangchanTypes;
    }
    /**
	 * 获取：房产图片
	 */
    public String getFangchanPhoto() {
        return fangchanPhoto;
    }


    /**
	 * 设置：房产图片
	 */
    public void setFangchanPhoto(String fangchanPhoto) {
        this.fangchanPhoto = fangchanPhoto;
    }
    /**
	 * 获取：房产价格
	 */
    public Double getFangchanMoney() {
        return fangchanMoney;
    }


    /**
	 * 设置：房产价格
	 */
    public void setFangchanMoney(Double fangchanMoney) {
        this.fangchanMoney = fangchanMoney;
    }
    /**
	 * 获取：房产地址
	 */
    public String getFangchanAddress() {
        return fangchanAddress;
    }


    /**
	 * 设置：房产地址
	 */
    public void setFangchanAddress(String fangchanAddress) {
        this.fangchanAddress = fangchanAddress;
    }
    /**
	 * 获取：房屋面积
	 */
    public Integer getFangchanMianjis() {
        return fangchanMianjis;
    }


    /**
	 * 设置：房屋面积
	 */
    public void setFangchanMianjis(Integer fangchanMianjis) {
        this.fangchanMianjis = fangchanMianjis;
    }
    /**
	 * 获取：所在区域
	 */
    public String getFangchanQuyu() {
        return fangchanQuyu;
    }


    /**
	 * 设置：所在区域
	 */
    public void setFangchanQuyu(String fangchanQuyu) {
        this.fangchanQuyu = fangchanQuyu;
    }
    /**
	 * 获取：房产详情
	 */
    public String getFangchanContent() {
        return fangchanContent;
    }


    /**
	 * 设置：房产详情
	 */
    public void setFangchanContent(String fangchanContent) {
        this.fangchanContent = fangchanContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
