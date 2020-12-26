package ru.iworking.personnel.reserve.exeption;

import lombok.Data;

@Data
public class FeignError extends RuntimeException {

    private Integer status;
    private String message;
    private Object details;

    public FeignError(Integer status, String message, Object details) {
        this.message = message;
        this.status = status;
        this.details = details;
    }

    public FeignError(Integer status, String message) {
        this.message = message;
        this.status = status;
    }


}
