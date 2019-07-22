package com.niu.controller;

import com.niu.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

/**
 * Created by ami on 2019/7/22.
 */
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    public Message greeting(Message message)throws Exception{
        return message;
    }
}
