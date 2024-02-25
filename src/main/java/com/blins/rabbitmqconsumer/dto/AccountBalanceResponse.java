package com.blins.rabbitmqconsumer.dto;

public record AccountBalanceResponse (String message,String phoneNumber){
    public  AccountBalanceResponse(String message, String phoneNumber){
        this.message=message;
        this.phoneNumber=phoneNumber;
    }
}
