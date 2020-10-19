package com.demo.springbootmybatisannotation.model;

import lombok.Data;

import java.io.Serializable;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/16 20:25
 */
@Data
public class User implements Serializable {

	private Integer id;
	private String name;
	private String address;
	private Integer age;
	private String password;
}
