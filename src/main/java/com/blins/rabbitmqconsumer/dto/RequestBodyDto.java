package com.blins.rabbitmqconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestBodyDto {
    private  String transactionType;
    private  String phoneNumber;
}
