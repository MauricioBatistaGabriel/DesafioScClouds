package org.example.domain.controller;

import org.example.domain.exception.RegraNegocioException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestResponseExceptionHandler {

    @ExceptionHandler(value = {RegraNegocioException.class})
    protected ResponseEntity<Object> handleRegraNegocioException(RegraNegocioException ex) {
        ApiError apiError =
                new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(),
                        "Impossivel realizar a operação com o valor informado!");
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}
