package com.socialmedia.chat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import java.time.LocalDateTime;

@Entity(name = "CHAT")
public class ChatModel {


    @Id
    @GeneratedValue
    private Long id;


    private Long fromUser;


    private Long toUser;

    public ChatModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromUser() {
        return fromUser;
    }

    public void setFromUser(Long fromUser) {
        this.fromUser = fromUser;
    }

    public Long getToUser() {
        return toUser;
    }

    public void setToUser(Long toUser) {
        this.toUser = toUser;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private LocalDateTime time;

    private String text;
    //hello
}
