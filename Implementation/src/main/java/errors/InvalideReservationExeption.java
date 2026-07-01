package errors;

import person.Person;
import lombok.Getter;

@Getter
public class InvalideReservationExeption extends HotelExeption {
    public InvalideReservationExeption(Person culprit, Object target, String message, String description) {
        super(culprit, target, message, description);
    }
}