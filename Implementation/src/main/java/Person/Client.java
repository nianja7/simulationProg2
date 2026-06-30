package Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Client extends Person{
    private String id;

    public void showInformation(Client c){
        System.out.println("Name : "+ name);
        System.out.println("Address : "+ address);
        System.out.println("Phone : "+ phone);
        System.out.println("Director : "+ director.name);
    }
}
