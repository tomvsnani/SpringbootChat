package com.socialmedia.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ChatApplication implements CommandLineRunner {

	@Autowired
	ChatRepository chatRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ChatModel chatModel=new ChatModel();

		chatModel.setText("hello");

		chatRepository.save(chatModel);
	}
}
