package com.practice.hystrixdashborad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import com.netflix.ribbon.proxy.annotation.Hystrix;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDashboradApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboradApplication.class, args);
	}

}
