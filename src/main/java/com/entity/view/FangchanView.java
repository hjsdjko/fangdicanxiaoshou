package com.entity.view;

import com.entity.FangchanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 房产信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangchan")
public class FangchanView extends FangchanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 房产户型的值
		*/
		private String fangchanValue;



	public FangchanView() {

	}

	public FangchanView(FangchanEntity fangchanEntity) {
		try {
			BeanUtils.copyProperties(this, fangchanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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













}
