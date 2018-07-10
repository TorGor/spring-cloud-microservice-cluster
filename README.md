# Spring cloud + sprnig boot2.0.3 
## eureka+ribbon+feign+hystrix+zuul

## project list
* eureka-server-slave1 (cluster for eureka server)
* eureka-server-slave2 (cluster for eureka server)
* eureka-client-provider1 (cluster for eureka client provider)
* eureka-client-provider2 (cluster for eureka client provider)


![图片名称](http://gitcafe.com/image.png)

[链接名称](http://gitcafe.com)

> EUREKA
>> EUREKA SERVER + EUREKA SERVER
***
1.`eureka-server-slave1`
This is a eureka server
* first you should add the dependence for project
```ruby
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
  </dependency>
```
* add `@EnableEurekaServer` for the `Application`
* add param see `application.properties`


