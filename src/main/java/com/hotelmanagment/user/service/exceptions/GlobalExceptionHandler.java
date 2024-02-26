package com.hotelmanagment.user.service.exceptions;

import com.hotelmanagment.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourseNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourseNotFoundException ex){
        String message = ex.getMessage();
        ApiResponse apiResponse = new ApiResponse(message,true, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);

    }


}
