package com.practice.cloudgateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}
	
	/*@Bean
	RouteLocator routeLocator(RouteLocatorBuilder builder){
		return builder.routes()
	            .route((r) -> r.path("/users/**").uri("http://localhost:9002/users"))
	            .route((r) -> r.path("/departments/**").uri("http://localhost:9001/departments/"))
	            .build();
	}*/

}