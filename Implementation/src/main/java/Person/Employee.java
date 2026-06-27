package Person;

import Enum.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee extends Person{
    private String idEmployee;
    private Post post;
    private double salary;
}
