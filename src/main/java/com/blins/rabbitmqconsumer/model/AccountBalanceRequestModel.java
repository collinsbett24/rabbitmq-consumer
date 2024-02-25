package com.blins.rabbitmqconsumer.model;


import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="balance_request_table")
public class AccountBalanceRequestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String requestRefID;
    private  String sourceChannel;
    private LocalDateTime timeStamp;
    private String transactionType;
    private String phoneNumber;
}
