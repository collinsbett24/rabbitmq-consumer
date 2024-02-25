package com.blins.rabbitmqconsumer.controller;

import com.blins.rabbitmqconsumer.config.RabbitConfig;
import com.blins.rabbitmqconsumer.dto.AccountBalanceRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class MessageConsumer {
    @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    private void receive(AccountBalanceRequest message){
        log.info("Message received from queue ->{}",message);
    }
}
