package com.socialmedia.chat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<ChatModel,Long> {


    List<ChatModel> findByFromUserAndToUserOrToUserAndFromUserOrderById(Long user1, Long user2, Long user11, Long user21);
}
