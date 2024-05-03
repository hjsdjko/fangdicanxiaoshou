package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 房产信息
 *
 * @author 
 * @email
 */
@TableName("fangchan")
public class FangchanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangchanEntity() {

	}

	public FangchanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 房产编号
     */
    @TableField(value = "fangchan_uuid_number")

    private String fangchanUuidNumber;


    /**
     * 房产名
     */
    @TableField(value = "fangchan_name")

    private String fangchanName;


    /**
     * 房产户型
     */
    @TableField(value = "fangchan_types")

    private Integer fangchanTypes;


    /**
     * 房产图片
     */
    @TableField(value = "fangchan_photo")

    private String fangchanPhoto;


    /**
     * 房产价格
     */
    @TableField(value = "fangchan_money")

    private Double fangchanMoney;


    /**
     * 房产地址
     */
    @TableField(value = "fangchan_address")

    private String fangchanAddress;


    /**
     * 房屋面积
     */
    @TableField(value = "fangchan_mianjis")

    private Integer fangchanMianjis;


    /**
     * 所在区域
     */
    @TableField(value = "fangchan_quyu")

    private String fangchanQuyu;


    /**
     * 房产详情
     */
    @TableField(value = "fangchan_content")

    private String fangchanContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：房产编号
	 */
    public String getFangchanUuidNumber() {
        return fangchanUuidNumber;
    }
    /**
	 * 获取：房产编号
	 */

    public void setFangchanUuidNumber(String fangchanUuidNumber) {
        this.fangchanUuidNumber = fangchanUuidNumber;
    }
    /**
	 * 设置：房产名
	 */
    public String getFangchanName() {
        return fangchanName;
    }
    /**
	 * 获取：房产名
	 */

    public void setFangchanName(String fangchanName) {
        this.fangchanName = fangchanName;
    }
    /**
	 * 设置：房产户型
	 */
    public Integer getFangchanTypes() {
        return fangchanTypes;
    }
    /**
	 * 获取：房产户型
	 */

    public void setFangchanTypes(Integer fangchanTypes) {
        this.fangchanTypes = fangchanTypes;
    }
    /**
	 * 设置：房产图片
	 */
    public String getFangchanPhoto() {
        return fangchanPhoto;
    }
    /**
	 * 获取：房产图片
	 */

    public void setFangchanPhoto(String fangchanPhoto) {
        this.fangchanPhoto = fangchanPhoto;
    }
    /**
	 * 设置：房产价格
	 */
    public Double getFangchanMoney() {
        return fangchanMoney;
    }
    /**
	 * 获取：房产价格
	 */

    public void setFangchanMoney(Double fangchanMoney) {
        this.fangchanMoney = fangchanMoney;
    }
    /**
	 * 设置：房产地址
	 */
    public String getFangchanAddress() {
        return fangchanAddress;
    }
    /**
	 * 获取：房产地址
	 */

    public void setFangchanAddress(String fangchanAddress) {
        this.fangchanAddress = fangchanAddress;
    }
    /**
	 * 设置：房屋面积
	 */
    public Integer getFangchanMianjis() {
        return fangchanMianjis;
    }
    /**
	 * 获取：房屋面积
	 */

    public void setFangchanMianjis(Integer fangchanMianjis) {
        this.fangchanMianjis = fangchanMianjis;
    }
    /**
	 * 设置：所在区域
	 */
    public String getFangchanQuyu() {
        return fangchanQuyu;
    }
    /**
	 * 获取：所在区域
	 */

    public void setFangchanQuyu(String fangchanQuyu) {
        this.fangchanQuyu = fangchanQuyu;
    }
    /**
	 * 设置：房产详情
	 */
    public String getFangchanContent() {
        return fangchanContent;
    }
    /**
	 * 获取：房产详情
	 */

    public void setFangchanContent(String fangchanContent) {
        this.fangchanContent = fangchanContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fangchan{" +
            "id=" + id +
            ", fangchanUuidNumber=" + fangchanUuidNumber +
            ", fangchanName=" + fangchanName +
            ", fangchanTypes=" + fangchanTypes +
            ", fangchanPhoto=" + fangchanPhoto +
            ", fangchanMoney=" + fangchanMoney +
            ", fangchanAddress=" + fangchanAddress +
            ", fangchanMianjis=" + fangchanMianjis +
            ", fangchanQuyu=" + fangchanQuyu +
            ", fangchanContent=" + fangchanContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
