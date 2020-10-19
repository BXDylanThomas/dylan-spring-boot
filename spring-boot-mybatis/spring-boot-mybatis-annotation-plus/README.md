#集成mybatis-plus 
实现单表无需写一行sql

> 也可以利用mybatis-generator自动生成xml，里面包含单表的动态sql
> 在线生成器 `https://www.cartoonai.com/`


##引入依赖
~~~~xml
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.3.2</version>
</dependency>
~~~~

**后续一些通用的依赖，及配置忽略，不再单独列出**


### 1.添加`@MapperScan()`
### 2.创建`com.demo.springbootmybatisannotationplus.dao.UserMapper`
实现接口BaseMapper

### 3.创建`com.demo.springbootmybatisannotationplus.service.UserService`
继承接口Iservice
创建其实现类`UserServiceImpl` 继承 `ServiceImpl` 实现`UserService`

### 4.编写controller层
详见`com.demo.springbootmybatisannotationplus.controller.UserController`

至此已实现，未编写1行sql，实现对数据库的查询功能

### 5. 启动项目，调用接口查询效果
