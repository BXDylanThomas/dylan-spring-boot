# 基于注解集成mybatis

主要实现方式与xml基本一样，无需再resources下配置各自对应的mapper.xml文件
所有的sql写在方法上面，参考  `com.demo.springbootmybatisannotation.dao.UserMapper`

~~~~java
@Repository
public interface UserMapper {

	@Select("select * from user")
	List<User> queryUser();
}
~~~~
