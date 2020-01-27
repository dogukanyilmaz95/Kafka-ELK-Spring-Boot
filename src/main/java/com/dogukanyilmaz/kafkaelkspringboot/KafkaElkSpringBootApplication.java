package com.dogukanyilmaz.kafkaelkspringboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;

@SpringBootApplication
public class KafkaElkSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaElkSpringBootApplication.class, args);
	}

}
