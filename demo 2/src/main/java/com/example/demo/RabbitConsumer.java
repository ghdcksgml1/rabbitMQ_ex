//package com.example.demo;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//
//@Slf4j
//@Service
//public class RabbitConsumer {
//
//    @RabbitListener(queues = "hello")
//    public void receiveMessage(final String message) {
//        log.info("<{}>", message);
//    }
//}
