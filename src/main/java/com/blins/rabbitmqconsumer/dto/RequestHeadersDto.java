package com.blins.rabbitmqconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHeadersDto {
    private  String requestRefID;
    private  String sourceChannel;
    private LocalDateTime timeStamp;
}
