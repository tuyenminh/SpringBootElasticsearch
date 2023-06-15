package com.example.DocumentaryProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
@RestControllerAdvice

public class DocsExceptionHandler {
 @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handler(NotFoundException ex, WebRequest req) {
     return new ErrorResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
 }
}