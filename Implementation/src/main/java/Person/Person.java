package Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    protected String lastName;
    protected String firstName;
    protected String phoneNumber;
    protected String email;

}
