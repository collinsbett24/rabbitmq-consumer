package com.blins.rabbitmqconsumer.dto;


public class AccountBalanceRequest {
    private String requestHeader;
    private  String getRequestBody;
    private String message;

    public AccountBalanceRequest() {
        this.requestHeader = requestHeader;
        this.getRequestBody = getRequestBody;
        this.message = message;
    }

    public String getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
    }

    public String getGetRequestBody() {
        return getRequestBody;
    }

    public void setGetRequestBody(String getRequestBody) {
        this.getRequestBody = getRequestBody;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AccountBalanceRequest{" +
                "requestHeader='" + requestHeader + '\'' +
                ", getRequestBody='" + getRequestBody + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
