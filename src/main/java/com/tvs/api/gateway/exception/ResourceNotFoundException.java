package com.tvs.api.gateway.exception;


public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String requestID;
    public ResourceNotFoundException(String requestID) {
        super(requestID);
    }
}