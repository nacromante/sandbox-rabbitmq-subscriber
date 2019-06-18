package com.fred.sandboxrabbitmq.order;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class OrderQueueListener {
    
    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void receiver(String msg){
        System.out.println("MSG >>> "+msg);
    }

}