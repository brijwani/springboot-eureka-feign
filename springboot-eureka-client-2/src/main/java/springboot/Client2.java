package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import springboot.controller.Client1Service;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = { Client1Service.class })
public class Client2 {

	public static void main(String[] args) {
		SpringApplication.run(Client2.class, args);
	}
}