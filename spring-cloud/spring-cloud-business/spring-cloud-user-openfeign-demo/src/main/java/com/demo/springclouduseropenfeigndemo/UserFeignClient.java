package com.demo.springclouduseropenfeigndemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/18 22:51
 */
@FeignClient(name = "user-server")
public interface UserFeignClient {

	@GetMapping("/query/user")
	Object queryUser();
}
