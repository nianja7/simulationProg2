package person;

import enums.Post;
import enums.Function;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@SuperBuilder
public class Employee extends Person{
    protected String idEmployee;
    protected Post post;
    protected double salary;
    protected Function function;
}
