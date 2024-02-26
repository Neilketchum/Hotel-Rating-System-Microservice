package com.hotelmanagment.user.service.payload;


import org.springframework.http.HttpStatus;

public class ApiResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public ApiResponse(String message, boolean success,HttpStatus status) {
        this.message = message;
        this.success = success;
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    private boolean success;

    private HttpStatus status;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
