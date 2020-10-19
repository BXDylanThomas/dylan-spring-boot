package com.demo.springbootmapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/19 21:20
 */
@Mapper(componentModel = "spring")
public interface UserDTOConvert {

	@Mappings({
			@Mapping(source = "age",target = "myAge"),
			@Mapping(source = "grade",target = "myGrade")
	})
	UserDTO convertDO(UserDO userDO);

	List<UserDTO> convertDO(List<UserDO> userDO);
}
