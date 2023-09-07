package com.andhikap.rest.webservices.demo.helloworld;

public class HelloDhikaBean {
    private String message;

    public HelloDhikaBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloDhikaBean [message=" + message + "]";
    }

    
}
