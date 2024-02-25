package com.blins.rabbitmqconsumer.controller;

import com.blins.rabbitmqconsumer.config.RabbitConfig;
import com.blins.rabbitmqconsumer.model.AccountBalanceRequestModel;
import com.blins.rabbitmqconsumer.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class MessageConsumer {
    @Autowired
    private ConsumerService service;
    @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    private void receive(AccountBalanceRequestModel message){
        service.saveToDb(message);
        log.info("Message received from queue ->{}",message);
    }
}
