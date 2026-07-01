package errors;

import person.Person;

public class ForbiddenAccessException extends HotelExeption {
    public ForbiddenAccessException(Person culprit, Object target, String message, String description) {
        super(culprit, target, message, description);
    }
}