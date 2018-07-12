# Spring cloud + sprnig boot2.0.3 ([MY BLOG](https://torgor.github.io)!)
## eureka+ribbon+feign+hystrix+zuul

## project list
* eureka-server-slave1 (cluster for eureka server)
* eureka-server-slave2 (cluster for eureka server)
* eureka-client-provider1 (cluster for eureka client provider)
* eureka-client-provider2 (cluster for eureka client provider)
* eureka-client-invoker (cluster for eureka client invoker /config client)
* eureka-client-zuul (cluster for eureka client gateway)
* hystrix-dashboard (hystrix dashboard)
* eureka-client-config-server (cluster for eureka client config server)


> EUREKA
>> EUREKA SERVER + EUREKA CLIENT
***
1.`eureka-server-slave1`
This is a eureka server
![console](https://torgor.github.io/assets/images/springcloud/eureka-console-8761.png)
* first you should add the dependence for project
```ruby
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
  </dependency>
```
* add `@EnableEurekaServer` for the `Application`
* add param see `application.properties`


