package com.tvs.api.gateway.exception;


import com.tvs.api.gateway.model.Resopnse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandlerController {
    DateFormat df = new SimpleDateFormat("YYYYMMDDHHMMS");

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> resourceNotFound(ResourceNotFoundException ex,
                                                   HttpServletRequest request) {
    /* Error error = new Error();
        error.setMessage(ex.getMessage());
        error.setTimestamp(new Date().getTime());
        error.setStatus(HttpStatus.NOT_FOUND.value());*/

        Resopnse resopnse =new Resopnse(
                ex.getMessage(),
                df.format(new Date()).toString(),
                "400",
                "FAIL",
                "ZXJyb3IgcmVxdWVzdCA="

        );
        return new ResponseEntity<>(resopnse, null, HttpStatus.OK);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> badRequest(ResourceNotFoundException ex,
                                             HttpServletRequest request) {
        Resopnse resopnse =new Resopnse(
                ex.getMessage(),
                df.format(new Date()).toString(),
                "400",
                "FAIL",
                "ZXJyb3IgcmVxdWVzdCA="
        );
        return new ResponseEntity<>(resopnse, null, HttpStatus.OK);
    }


}