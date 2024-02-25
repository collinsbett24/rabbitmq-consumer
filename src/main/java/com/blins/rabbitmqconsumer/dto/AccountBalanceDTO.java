package com.blins.rabbitmqconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountBalanceDTO {
    private RequestHeadersDto requestHeaders;
    private RequestBodyDto requestBody;
}
