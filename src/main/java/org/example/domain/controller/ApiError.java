package org.example.domain.controller;


import lombok.Setter;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ApiError {

    private HttpStatus status;
    private String message;
    private String error;

    public ApiError(HttpStatus status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        this.error = error;
    }
}
