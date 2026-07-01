package errors;

import java.time.LocalDateTime;
import person.Person;
import lombok.Getter;

@Getter
public abstract class HotelExeption extends RuntimeException {
    private final Person culript;
    private final Object target;
    private final LocalDateTime time;
    private final String description; // Décrit ce qu'il faut modifier

    public HotelExeption(Person culript, Object target, String message, String description) {
        super(message);
        this.culript = culript;
        this.target = target;
        this.time = LocalDateTime.now();
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("[%s] ERROR: %s | Culprit: %s | Target: %s | Fix action: %s",
                time, getMessage(), (culript != null ? culript.getLastName() : "System"), target, description);
    }
}