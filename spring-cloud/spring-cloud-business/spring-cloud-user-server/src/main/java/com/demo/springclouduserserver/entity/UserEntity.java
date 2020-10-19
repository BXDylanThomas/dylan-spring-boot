package com.demo.springclouduserserver.entity;

import lombok.Builder;
import lombok.Data;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/18 22:34
 */
@Data
@Builder
public class UserEntity {
	private Integer id;
	private String name;
	private String address;
}
