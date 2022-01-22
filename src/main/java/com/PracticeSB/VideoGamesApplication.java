package com.PracticeSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.PracticeSB.Controllers", "com.PracticeSB.Service", "com.PracticeSB.Domain", "com.PracticeSB.Repository"})

public class VideoGamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGamesApplication.class, args);
	}
}
