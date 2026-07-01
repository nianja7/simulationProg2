package transaction;

import person.Person;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Transaction {
    protected LocalDate dateExecution;
    protected Person actor;
    protected Object target;
}