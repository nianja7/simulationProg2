package space;

import person.Employee;
import transaction.History;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
public class Hotel extends Space{
    private String name;
    private String address;
    private String phone;
    private Employee director;
    private History history;
    private ArrayList<Room> rooms;

    public void showHotelInformations(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Phone : "+phone);
        System.out.println("Director : "+director.getName());
    }

}
