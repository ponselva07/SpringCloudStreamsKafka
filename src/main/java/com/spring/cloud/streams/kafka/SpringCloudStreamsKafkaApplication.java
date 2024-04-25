package com.spring.cloud.streams.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.security.SecureRandom;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
@Slf4j
public class SpringCloudStreamsKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamsKafkaApplication.class, args);
	}


	@Bean
	public Supplier<String> stringProducer() {
		return () -> "ponselva";
	}
	@Bean
	public Consumer<String> stringConsumer() {
		return uppercase -> log.info("Uppercase : {}", uppercase);
	}
}
