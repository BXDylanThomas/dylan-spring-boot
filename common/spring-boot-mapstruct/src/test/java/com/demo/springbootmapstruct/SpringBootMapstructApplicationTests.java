package com.demo.springbootmapstruct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.annotation.UserConfigurations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringBootMapstructApplicationTests {

	@Autowired
	UserDTOConvert userDTOConvert;
	@Test
	void contextLoads() {

		UserDO userDO = new UserDO("name","address","age","grade");
		UserDTO userDTO = userDTOConvert.convertDO(userDO);

		System.out.println(userDO.toString());
		System.out.println(userDTO.toString());
	}


	@Test
	void contextLoads2() {

		UserDO userDO = new UserDO("name","address","age","grade");
		List<UserDTO> userDTO = userDTOConvert.convertDO(Arrays.asList(userDO));

		System.out.println(userDTO);
	}
}
