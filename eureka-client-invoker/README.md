# spring cloud config client 
## eureka+config+acutor

## project list
* eureka-client-config-client (cluster for eureka client ,config client)


> EUREKA
>> EUREKA CLIENT + CONFIG CLIENT
***
1.`eureka-client,config-client`
This is a eureka client for config client 
* `spring.application.name=` **name of properties**
* add dependency for project
```ruby
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-config</artifactId>
  </dependency>
```
* you must creat `bootstrap.properties` for project .add param see `bootstrap.properties`
* see the actuator you must with path `/actuator` like `/actuator/info`




