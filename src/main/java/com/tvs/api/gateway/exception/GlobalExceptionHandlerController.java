package com.tvs.api.gateway.exception;


import com.tvs.api.gateway.model.Resopnse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandlerController {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> resourceNotFound(ResourceNotFoundException ex,
                                                   HttpServletRequest request) {
    /*    Error error = new Error();
        error.setMessage(ex.getMessage());
        error.setTimestamp(new Date().getTime());
        error.setStatus(HttpStatus.NOT_FOUND.value());*/
        Resopnse resopnse =new Resopnse(
                ex.getMessage(),
                System.currentTimeMillis() + "",
                "400",
                "FAIL",
                "ewogICAgdXNlcm5hbWUgOiJhc2ppZCIsCiAgICBwYXNzd29yZCA6ICJ6YWluY2FzaCIKfQ"
        );
        return new ResponseEntity<>(resopnse, null, HttpStatus.OK);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> badRequest(MethodArgumentNotValidException ex,
                                             HttpServletRequest request) {
        Resopnse resopnse =new Resopnse(
                ex.getMessage(),
                System.currentTimeMillis() + "",
                "400",
                "FAIL",
                "ewogICAgdXNlcm5hbWUgOiJhc2ppZCIsCiAgICBwYXNzd29yZCA6ICJ6YWluY2FzaCIKfQ"
        );
        return new ResponseEntity<>(resopnse, null, HttpStatus.OK);
    }
}