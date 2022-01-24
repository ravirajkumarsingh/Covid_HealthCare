package io.fikiCoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SideProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SideProjectApplication.class, args);
	}

}
