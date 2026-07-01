package person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class Person {
    protected String lastName;
    protected String firstName;
    protected String phoneNumber;
    protected String email;
    protected String name;

    private String getName(Person p){
        return " "+firstName+" "+lastName;
    }
}
