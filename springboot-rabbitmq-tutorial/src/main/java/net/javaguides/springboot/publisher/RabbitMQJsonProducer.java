package net.javaguides.springboot.publisher;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.springboot.dto.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RabbitMQJsonProducer {

    private final RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.json.key.name}")
    private String routingJsonKey;

    public void sendJsonMessage(User user) {
        log.info("Json message sent -> {}", user.toString());
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, user);
    }
}
