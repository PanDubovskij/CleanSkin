package com.jo.clean_skin_service.exception;

import java.sql.Timestamp;

public class ErrorMessage {
    private final int statusCode;
    private final Timestamp timestamp;
    private final String message;
    private final String description;

    public ErrorMessage(int statusCode, Timestamp timestamp, String message, String description) {
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}