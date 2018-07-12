# spring cloud zipkin server (WARNING :DEPRECATED spring boot 2.0 not surport,you can run with docker or jar)
## eureka+config+zipkin server

## project list
* eureka-client-zipkin-server (cluster for eureka client ,zipkin server)


> EUREKA
>> EUREKA CLIENT + ZIPKIN-SERVER
***
1.`zipkin-server`
This is a eureka client for zipkin server 
* you should add the dependence for project
```ruby
    <dependency>
        <groupId>io.zipkin.java</groupId>
        <artifactId>zipkin-autoconfigure-ui</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.zipkin.java</groupId>
        <artifactId>zipkin-server</artifactId>
    </dependency>
```




