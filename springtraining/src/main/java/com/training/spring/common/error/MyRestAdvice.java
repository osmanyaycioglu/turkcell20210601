package com.training.spring.common.error;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyRestAdvice {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleError(final IllegalArgumentException exceptionParam) {
        return "Error oluştu " + exceptionParam.getMessage();
    }

    @ExceptionHandler(IllegalStateException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public String handleError(final IllegalStateException exceptionParam) {
        return "State Error oluştu " + exceptionParam.getMessage();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleError(final MethodArgumentNotValidException exceptionParam) {
        StringBuilder builderLoc = new StringBuilder(400);
        List<ObjectError> allErrorsLoc = exceptionParam.getAllErrors();
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            builderLoc.append(objectErrorLoc.toString());
            builderLoc.append("\n");
        }
        return "Validasyon errorü oluştu : " + builderLoc.toString();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public String handleError(final Exception exceptionParam) {
        return "State Error oluştu " + exceptionParam.getMessage();
    }

}
