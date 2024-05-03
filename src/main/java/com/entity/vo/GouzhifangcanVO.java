package com.entity.vo;

import com.entity.GouzhifangcanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 购置房产
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gouzhifangcan")
public class GouzhifangcanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 房产名
     */

    @TableField(value = "gouzhifangcan_name")
    private String gouzhifangcanName;


    /**
     * 房产户型
     */

    @TableField(value = "fangchan_types")
    private Integer fangchanTypes;


    /**
     * 房产图片
     */

    @TableField(value = "gouzhifangcan_photo")
    private String gouzhifangcanPhoto;


    /**
     * 房产地址
     */

    @TableField(value = "gouzhifangcan_address")
    private String gouzhifangcanAddress;


    /**
     * 房屋面积
     */

    @TableField(value = "gouzhifangcan_mianjis")
    private Integer gouzhifangcanMianjis;


    /**
     * 房产购价
     */

    @TableField(value = "gouzhifangcan_jiage")
    private Integer gouzhifangcanJiage;


    /**
     * 所在区域
     */

    @TableField(value = "gouzhifangcan_quyu")
    private String gouzhifangcanQuyu;


    /**
     * 客户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 销售经理
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：房产名
	 */
    public String getGouzhifangcanName() {
        return gouzhifangcanName;
    }


    /**
	 * 获取：房产名
	 */

    public void setGouzhifangcanName(String gouzhifangcanName) {
        this.gouzhifangcanName = gouzhifangcanName;
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
    public String getGouzhifangcanPhoto() {
        return gouzhifangcanPhoto;
    }


    /**
	 * 获取：房产图片
	 */

    public void setGouzhifangcanPhoto(String gouzhifangcanPhoto) {
        this.gouzhifangcanPhoto = gouzhifangcanPhoto;
    }
    /**
	 * 设置：房产地址
	 */
    public String getGouzhifangcanAddress() {
        return gouzhifangcanAddress;
    }


    /**
	 * 获取：房产地址
	 */

    public void setGouzhifangcanAddress(String gouzhifangcanAddress) {
        this.gouzhifangcanAddress = gouzhifangcanAddress;
    }
    /**
	 * 设置：房屋面积
	 */
    public Integer getGouzhifangcanMianjis() {
        return gouzhifangcanMianjis;
    }


    /**
	 * 获取：房屋面积
	 */

    public void setGouzhifangcanMianjis(Integer gouzhifangcanMianjis) {
        this.gouzhifangcanMianjis = gouzhifangcanMianjis;
    }
    /**
	 * 设置：房产购价
	 */
    public Integer getGouzhifangcanJiage() {
        return gouzhifangcanJiage;
    }


    /**
	 * 获取：房产购价
	 */

    public void setGouzhifangcanJiage(Integer gouzhifangcanJiage) {
        this.gouzhifangcanJiage = gouzhifangcanJiage;
    }
    /**
	 * 设置：所在区域
	 */
    public String getGouzhifangcanQuyu() {
        return gouzhifangcanQuyu;
    }


    /**
	 * 获取：所在区域
	 */

    public void setGouzhifangcanQuyu(String gouzhifangcanQuyu) {
        this.gouzhifangcanQuyu = gouzhifangcanQuyu;
    }
    /**
	 * 设置：客户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：客户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：销售经理
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：销售经理
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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

}
