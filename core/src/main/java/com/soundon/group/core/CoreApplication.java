package com.soundon.group.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CoreApplication.class, args);
		new SpringApplicationBuilder(CoreApplication.class)
        .web(false) //非web
        .run(args);
	}
}
