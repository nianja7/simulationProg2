package Space;

import Person.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

import static Enum.RoomStatus.FREE;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Hotel extends Space{
    private String name;
    private String address;
    private String phone;
    private Employee director;

    public void showHotelInformations(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Phone : "+phone);
        System.out.println("Director : "+director.name);
    }

}
