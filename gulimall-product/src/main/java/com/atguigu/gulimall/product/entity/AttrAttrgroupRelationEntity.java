package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ????&???Է???????
 * 
 * @author bikakaso
 * @email bikakaso@gmail.com
 * @date 2023-06-26 13:20:09
 */
@Data
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ????id
	 */
	private Long attrId;
	/**
	 * ???Է???id
	 */
	private Long attrGroupId;
	/**
	 * ???????????
	 */
	private Integer attrSort;

}
