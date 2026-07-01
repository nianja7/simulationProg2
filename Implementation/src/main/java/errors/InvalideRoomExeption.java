package errors;

import person.Person;
import lombok.Getter;

@Getter
public class InvalideRoomExeption extends HotelExeption {
    public InvalideRoomExeption(Person culprit, Object target, String message, String description) {
        super(culprit, target, message, description);
    }
}