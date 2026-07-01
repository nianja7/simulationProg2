package errors;

import person.Person;

public class UnauthorizedPostException extends HotelExeption {
    public UnauthorizedPostException(Person culprit, Object target, String message, String description) {
        super(culprit, target, message, description);
    }
}