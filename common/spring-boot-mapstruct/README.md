#实体类相互间转换

##引入依赖
~~~~xml
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct-jdk8</artifactId>
    <version>1.3.0.Final</version>
</dependency>
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct-processor</artifactId>
    <version>1.3.0.Final</version>
</dependency>
~~~~

## 编写convert
~~~~java
@Mapper(componentModel = "spring")
public interface UserDTOConvert {

	@Mappings({
			@Mapping(source = "age",target = "myAge"),
			@Mapping(source = "grade",target = "myGrade")
	})
	UserDTO convertDO(UserDO userDO);

	List<UserDTO> convertDO(List<UserDO> userDO);
}
~~~~

## 测试

~~~~java
UserDO userDO = new UserDO("name","address","age","grade");
UserDTO userDTO = userDTOConvert.convertDO(userDO);

System.out.println(userDTO.toString());
~~~~


~~~java
UserDO userDO = new UserDO("name","address","age","grade");
List<UserDTO> userDTO = userDTOConvert.convertDO(Arrays.asList(userDO));

System.out.println(userDTO);

~~~~
