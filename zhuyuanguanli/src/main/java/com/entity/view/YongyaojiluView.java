package com.entity.view;

import com.entity.YongyaojiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 用药记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yongyaojilu")
public class YongyaojiluView extends YongyaojiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yaopin
			/**
			* 药品名称
			*/
			private String yaopinName;
			/**
			* 药品类型
			*/
			private Integer yaopinTypes;
				/**
				* 药品类型的值
				*/
				private String yaopinValue;
			/**
			* 药品库存
			*/
			private Integer yaopinKucunNumber;
			/**
			* 主要药效
			*/
			private String yaopinZuoyong;
			/**
			* 副作用
			*/
			private String fuzuoyong;
			/**
			* 现价
			*/
			private Double yaopinNewMoney;
			/**
			* 药品详情
			*/
			private String yaopinContent;
			/**
			* 逻辑删除
			*/
			private Integer yaopinDelete;

		//级联表 yisheng
			/**
			* 医生姓名
			*/
			private String yishengName;
			/**
			* 头像
			*/
			private String yishengPhoto;
			/**
			* 联系方式
			*/
			private String yishengPhone;
			/**
			* 医生身份证号
			*/
			private String yishengIdNumber;
			/**
			* 邮箱
			*/
			private String yishengEmail;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public YongyaojiluView() {

	}

	public YongyaojiluView(YongyaojiluEntity yongyaojiluEntity) {
		try {
			BeanUtils.copyProperties(this, yongyaojiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




















				//级联表的get和set yaopin

					/**
					* 获取： 药品名称
					*/
					public String getYaopinName() {
						return yaopinName;
					}
					/**
					* 设置： 药品名称
					*/
					public void setYaopinName(String yaopinName) {
						this.yaopinName = yaopinName;
					}

					/**
					* 获取： 药品类型
					*/
					public Integer getYaopinTypes() {
						return yaopinTypes;
					}
					/**
					* 设置： 药品类型
					*/
					public void setYaopinTypes(Integer yaopinTypes) {
						this.yaopinTypes = yaopinTypes;
					}


						/**
						* 获取： 药品类型的值
						*/
						public String getYaopinValue() {
							return yaopinValue;
						}
						/**
						* 设置： 药品类型的值
						*/
						public void setYaopinValue(String yaopinValue) {
							this.yaopinValue = yaopinValue;
						}

					/**
					* 获取： 药品库存
					*/
					public Integer getYaopinKucunNumber() {
						return yaopinKucunNumber;
					}
					/**
					* 设置： 药品库存
					*/
					public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
						this.yaopinKucunNumber = yaopinKucunNumber;
					}

					/**
					* 获取： 主要药效
					*/
					public String getYaopinZuoyong() {
						return yaopinZuoyong;
					}
					/**
					* 设置： 主要药效
					*/
					public void setYaopinZuoyong(String yaopinZuoyong) {
						this.yaopinZuoyong = yaopinZuoyong;
					}

					/**
					* 获取： 副作用
					*/
					public String getFuzuoyong() {
						return fuzuoyong;
					}
					/**
					* 设置： 副作用
					*/
					public void setFuzuoyong(String fuzuoyong) {
						this.fuzuoyong = fuzuoyong;
					}

					/**
					* 获取： 现价
					*/
					public Double getYaopinNewMoney() {
						return yaopinNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setYaopinNewMoney(Double yaopinNewMoney) {
						this.yaopinNewMoney = yaopinNewMoney;
					}

					/**
					* 获取： 药品详情
					*/
					public String getYaopinContent() {
						return yaopinContent;
					}
					/**
					* 设置： 药品详情
					*/
					public void setYaopinContent(String yaopinContent) {
						this.yaopinContent = yaopinContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getYaopinDelete() {
						return yaopinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYaopinDelete(Integer yaopinDelete) {
						this.yaopinDelete = yaopinDelete;
					}





				//级联表的get和set yisheng

					/**
					* 获取： 医生姓名
					*/
					public String getYishengName() {
						return yishengName;
					}
					/**
					* 设置： 医生姓名
					*/
					public void setYishengName(String yishengName) {
						this.yishengName = yishengName;
					}

					/**
					* 获取： 头像
					*/
					public String getYishengPhoto() {
						return yishengPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYishengPhoto(String yishengPhoto) {
						this.yishengPhoto = yishengPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYishengPhone() {
						return yishengPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYishengPhone(String yishengPhone) {
						this.yishengPhone = yishengPhone;
					}

					/**
					* 获取： 医生身份证号
					*/
					public String getYishengIdNumber() {
						return yishengIdNumber;
					}
					/**
					* 设置： 医生身份证号
					*/
					public void setYishengIdNumber(String yishengIdNumber) {
						this.yishengIdNumber = yishengIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYishengEmail() {
						return yishengEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYishengEmail(String yishengEmail) {
						this.yishengEmail = yishengEmail;
					}


				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
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
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
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
