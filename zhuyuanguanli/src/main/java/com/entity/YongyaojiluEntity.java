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
 * 用药记录
 *
 * @author 
 * @email
 */
@TableName("yongyaojilu")
public class YongyaojiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YongyaojiluEntity() {

	}

	public YongyaojiluEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 药品
     */
    @TableField(value = "yaopin_id")

    private Integer yaopinId;


    /**
     * 数量
     */
    @TableField(value = "yongyaojilu_number")

    private Integer yongyaojiluNumber;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "yongyaojilu_time")

    private Date yongyaojiluTime;


    /**
     * 医生
     */
    @TableField(value = "yisheng_id")

    private Integer yishengId;


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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：药品
	 */
    public Integer getYaopinId() {
        return yaopinId;
    }
    /**
	 * 获取：药品
	 */

    public void setYaopinId(Integer yaopinId) {
        this.yaopinId = yaopinId;
    }
    /**
	 * 设置：数量
	 */
    public Integer getYongyaojiluNumber() {
        return yongyaojiluNumber;
    }
    /**
	 * 获取：数量
	 */

    public void setYongyaojiluNumber(Integer yongyaojiluNumber) {
        this.yongyaojiluNumber = yongyaojiluNumber;
    }
    /**
	 * 设置：日期
	 */
    public Date getYongyaojiluTime() {
        return yongyaojiluTime;
    }
    /**
	 * 获取：日期
	 */

    public void setYongyaojiluTime(Date yongyaojiluTime) {
        this.yongyaojiluTime = yongyaojiluTime;
    }
    /**
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }
    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
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
        return "Yongyaojilu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", yaopinId=" + yaopinId +
            ", yongyaojiluNumber=" + yongyaojiluNumber +
            ", yongyaojiluTime=" + yongyaojiluTime +
            ", yishengId=" + yishengId +
            ", createTime=" + createTime +
        "}";
    }
}
