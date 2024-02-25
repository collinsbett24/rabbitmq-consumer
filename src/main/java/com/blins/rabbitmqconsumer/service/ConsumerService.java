package com.blins.rabbitmqconsumer.service;

import com.blins.rabbitmqconsumer.model.AccountBalanceRequestModel;
import com.blins.rabbitmqconsumer.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository repository;
    public void saveToDb(AccountBalanceRequestModel message) {

    }
}
