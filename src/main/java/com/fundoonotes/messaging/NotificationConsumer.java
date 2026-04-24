package com.fundoonotes.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receiveNotification(String message) {
        System.out.println("Notification received: " + message);
    }
}
