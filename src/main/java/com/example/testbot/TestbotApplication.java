package com.example.testbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class TestbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestbotApplication.class, args);
	}

}
