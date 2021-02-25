package com.yc.xk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.yc.xk")
@EnableEurekaClient
public class MovieApp {
	
	public static void main(String[] args) {
		SpringApplication.run(MovieApp.class, args);
	}

}
