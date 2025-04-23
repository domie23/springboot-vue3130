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
 * 药品信息
 *
 * @author 
 * @email
 */
@TableName("yaopin")
public class YaopinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YaopinEntity() {

	}

	public YaopinEntity(T t) {
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
     * 药品名称
     */
    @TableField(value = "yaopin_name")

    private String yaopinName;


    /**
     * 药品类型
     */
    @TableField(value = "yaopin_types")

    private Integer yaopinTypes;


    /**
     * 药品库存
     */
    @TableField(value = "yaopin_kucun_number")

    private Integer yaopinKucunNumber;


    /**
     * 主要药效
     */
    @TableField(value = "yaopin_zuoyong")

    private String yaopinZuoyong;


    /**
     * 副作用
     */
    @TableField(value = "fuzuoyong")

    private String fuzuoyong;


    /**
     * 现价
     */
    @TableField(value = "yaopin_new_money")

    private Double yaopinNewMoney;


    /**
     * 药品详情
     */
    @TableField(value = "yaopin_content")

    private String yaopinContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "yaopin_delete")

    private Integer yaopinDelete;


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
	 * 设置：药品名称
	 */
    public String getYaopinName() {
        return yaopinName;
    }
    /**
	 * 获取：药品名称
	 */

    public void setYaopinName(String yaopinName) {
        this.yaopinName = yaopinName;
    }
    /**
	 * 设置：药品类型
	 */
    public Integer getYaopinTypes() {
        return yaopinTypes;
    }
    /**
	 * 获取：药品类型
	 */

    public void setYaopinTypes(Integer yaopinTypes) {
        this.yaopinTypes = yaopinTypes;
    }
    /**
	 * 设置：药品库存
	 */
    public Integer getYaopinKucunNumber() {
        return yaopinKucunNumber;
    }
    /**
	 * 获取：药品库存
	 */

    public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
        this.yaopinKucunNumber = yaopinKucunNumber;
    }
    /**
	 * 设置：主要药效
	 */
    public String getYaopinZuoyong() {
        return yaopinZuoyong;
    }
    /**
	 * 获取：主要药效
	 */

    public void setYaopinZuoyong(String yaopinZuoyong) {
        this.yaopinZuoyong = yaopinZuoyong;
    }
    /**
	 * 设置：副作用
	 */
    public String getFuzuoyong() {
        return fuzuoyong;
    }
    /**
	 * 获取：副作用
	 */

    public void setFuzuoyong(String fuzuoyong) {
        this.fuzuoyong = fuzuoyong;
    }
    /**
	 * 设置：现价
	 */
    public Double getYaopinNewMoney() {
        return yaopinNewMoney;
    }
    /**
	 * 获取：现价
	 */

    public void setYaopinNewMoney(Double yaopinNewMoney) {
        this.yaopinNewMoney = yaopinNewMoney;
    }
    /**
	 * 设置：药品详情
	 */
    public String getYaopinContent() {
        return yaopinContent;
    }
    /**
	 * 获取：药品详情
	 */

    public void setYaopinContent(String yaopinContent) {
        this.yaopinContent = yaopinContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getYaopinDelete() {
        return yaopinDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setYaopinDelete(Integer yaopinDelete) {
        this.yaopinDelete = yaopinDelete;
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
        return "Yaopin{" +
            "id=" + id +
            ", yaopinName=" + yaopinName +
            ", yaopinTypes=" + yaopinTypes +
            ", yaopinKucunNumber=" + yaopinKucunNumber +
            ", yaopinZuoyong=" + yaopinZuoyong +
            ", fuzuoyong=" + fuzuoyong +
            ", yaopinNewMoney=" + yaopinNewMoney +
            ", yaopinContent=" + yaopinContent +
            ", yaopinDelete=" + yaopinDelete +
            ", createTime=" + createTime +
        "}";
    }
}
