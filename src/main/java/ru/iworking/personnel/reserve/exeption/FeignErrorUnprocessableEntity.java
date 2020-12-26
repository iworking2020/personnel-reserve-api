package ru.iworking.personnel.reserve.exeption;

public class FeignErrorUnprocessableEntity extends FeignError {

    public FeignErrorUnprocessableEntity(String message) {
        super(422, message);
    }

}
