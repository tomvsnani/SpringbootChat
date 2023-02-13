package com.socialmedia.chat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/chats")
public class ChatController {

    Logger logger= LoggerFactory.getLogger(ChatController.class);

    @Autowired
    ChatRepository chatRepository;



    @GetMapping("/get/{user1}/{user2}")
    public ResponseEntity<Object> get(@PathVariable Long user1,@PathVariable Long user2){

        logger.info("in get chat");



        List<ChatModel> chatModelList= chatRepository.findByFromUserAndToUserOrToUserAndFromUserOrderById(user1,user2,user1,user2);

        return ResponseEntity.ok(chatModelList);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody ChatModel chatModel){

        logger.info("in Chat create");

      ChatModel chatModel1= chatRepository.save(chatModel);

        return ResponseEntity.ok(chatModel1);
    }

}
