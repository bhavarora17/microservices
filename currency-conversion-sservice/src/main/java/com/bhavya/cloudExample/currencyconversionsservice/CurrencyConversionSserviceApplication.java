package com.bhavya.cloudExample.currencyconversionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.bhavya.cloudExample.currencyconversionsservice")
public class CurrencyConversionSserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionSserviceApplication.class, args);
	}
}
