package com.emd.consumo.api.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumoApiExternaConFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiExternaConFeignApplication.class, args);
	}
	

}
