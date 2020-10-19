package com.demo.springbootmapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/19 21:20
 */
@Data
@AllArgsConstructor
public class UserDO {

	String name;
	String address;

	String age;
	String grade;
}
