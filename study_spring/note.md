## 常用配置文件
pom.xml
```xml
<dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.9.RELEASE</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.12</version>
            <scope>provided</scope>
        </dependency>
```
beans.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        https://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

</beans>
```

常用注解：
@Autowired:通过类型自动装配【byType】，如果Autowired不能唯一自动装配上属性，则需要通过AQualifier(value="")来唯一指定

@Resource:自动装配通过名字和类型，【认通过byName的方式实现，如果找不到名字，则通过ByType实现！】如果两个都找不到就报错！

@Nullable；字段标记了这个注解，说明这个字段可以为null

@Component: 组件，放在类上，说明这个类被spring管理了，就是bean
    @Component 有几个衍生注解，我们在web开发中，会按照mvc三层架构分层！
    (1)dao【@Repository】
    (2)service【@Service】
    (3)controller【@Controller】
    这四个注解的功能都是一样的，都是 代表将某个类注册到Spring中，装配bean
    
@Scope("") 作用域
