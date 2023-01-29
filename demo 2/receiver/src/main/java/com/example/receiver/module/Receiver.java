package com.example.receiver.module;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "dept", type = ExchangeTypes.TOPIC),
            value = @Queue(name = "dept-second"),
            key = "dept-first"
    ))
    @SendTo("dept/dept-third")
    public Dept receiver(Dept dept) {
        System.out.println("<=" + dept);

        Dept dept1 = new Dept(20,"new", "new", "");

        return dept1;
    }
}
