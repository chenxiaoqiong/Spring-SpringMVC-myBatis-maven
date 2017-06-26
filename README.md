# Spring-SpringMVC-myBatis-maven
SSM+maven简单例子：

模块简单介绍：

candy-common
其他所有模块都依赖这个模块，下面放着一些公用的东西，比如一些工具类

candy-dao
数据库到层，实现数据库连接，mybatis的Mapper实现。下面可包含多个数据库模块，我这里写了mysql和redis

candy-model
实体层，表实体或其他实体

candy-service
业务逻辑层

candy-web
web层，这个模块为可运行模块，下面主要是Controller和页面。

如果项目提供接口可以在写一个类似web的api模块来提供接口并且可以单独运行服务。



