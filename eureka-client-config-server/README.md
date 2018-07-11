# spring cloud config server 
## eureka+config+acutor

## project list
* eureka-client-config-server (cluster for eureka client ,config server)


> EUREKA
>> EUREKA CLIENT + Config server
***
1.`eureka-client-config-server`
This is a eureka client for config server 
* first you should add the git respository for server you can see main 
[Git respository config](https://github.com/TorGor/config-center.git)
* you should add the dependence for project
```ruby
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-config-server</artifactId>
  </dependency>
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
  </dependency>
```
* add `@EnableConfigServer` for the `Application`
* add param see `application.properties`
* see the actuator you must with path `/actuator` like `/actuator/info`




