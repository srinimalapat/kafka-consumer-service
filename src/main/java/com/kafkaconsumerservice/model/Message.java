package com.kafkaconsumerservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    private String id;
    private String content;
}
