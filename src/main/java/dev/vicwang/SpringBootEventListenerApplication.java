package dev.vicwang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootEventListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventListenerApplication.class, args);
	}

}
