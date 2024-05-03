package com.entity.view;

import com.entity.FangchanYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 预约看房
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangchan_yuyue")
public class FangchanYuyueView extends FangchanYuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 fangchan
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
				* 房产户型的值
				*/
				private String fangchanValue;
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

		//级联表 yonghu
			/**
			* 客户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 客户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public FangchanYuyueView() {

	}

	public FangchanYuyueView(FangchanYuyueEntity fangchanYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, fangchanYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set fangchan

					/**
					* 获取： 房产编号
					*/
					public String getFangchanUuidNumber() {
						return fangchanUuidNumber;
					}
					/**
					* 设置： 房产编号
					*/
					public void setFangchanUuidNumber(String fangchanUuidNumber) {
						this.fangchanUuidNumber = fangchanUuidNumber;
					}

					/**
					* 获取： 房产名
					*/
					public String getFangchanName() {
						return fangchanName;
					}
					/**
					* 设置： 房产名
					*/
					public void setFangchanName(String fangchanName) {
						this.fangchanName = fangchanName;
					}

					/**
					* 获取： 房产户型
					*/
					public Integer getFangchanTypes() {
						return fangchanTypes;
					}
					/**
					* 设置： 房产户型
					*/
					public void setFangchanTypes(Integer fangchanTypes) {
						this.fangchanTypes = fangchanTypes;
					}


						/**
						* 获取： 房产户型的值
						*/
						public String getFangchanValue() {
							return fangchanValue;
						}
						/**
						* 设置： 房产户型的值
						*/
						public void setFangchanValue(String fangchanValue) {
							this.fangchanValue = fangchanValue;
						}

					/**
					* 获取： 房产图片
					*/
					public String getFangchanPhoto() {
						return fangchanPhoto;
					}
					/**
					* 设置： 房产图片
					*/
					public void setFangchanPhoto(String fangchanPhoto) {
						this.fangchanPhoto = fangchanPhoto;
					}

					/**
					* 获取： 房产价格
					*/
					public Double getFangchanMoney() {
						return fangchanMoney;
					}
					/**
					* 设置： 房产价格
					*/
					public void setFangchanMoney(Double fangchanMoney) {
						this.fangchanMoney = fangchanMoney;
					}

					/**
					* 获取： 房产地址
					*/
					public String getFangchanAddress() {
						return fangchanAddress;
					}
					/**
					* 设置： 房产地址
					*/
					public void setFangchanAddress(String fangchanAddress) {
						this.fangchanAddress = fangchanAddress;
					}

					/**
					* 获取： 房屋面积
					*/
					public Integer getFangchanMianjis() {
						return fangchanMianjis;
					}
					/**
					* 设置： 房屋面积
					*/
					public void setFangchanMianjis(Integer fangchanMianjis) {
						this.fangchanMianjis = fangchanMianjis;
					}

					/**
					* 获取： 所在区域
					*/
					public String getFangchanQuyu() {
						return fangchanQuyu;
					}
					/**
					* 设置： 所在区域
					*/
					public void setFangchanQuyu(String fangchanQuyu) {
						this.fangchanQuyu = fangchanQuyu;
					}

					/**
					* 获取： 房产详情
					*/
					public String getFangchanContent() {
						return fangchanContent;
					}
					/**
					* 设置： 房产详情
					*/
					public void setFangchanContent(String fangchanContent) {
						this.fangchanContent = fangchanContent;
					}






















				//级联表的get和set yonghu

					/**
					* 获取： 客户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 客户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 客户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 客户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
