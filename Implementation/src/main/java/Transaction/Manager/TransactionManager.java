package Transaction.Manager;

import Person.Employee;
import Person.Client;
import Person.Person;
import Space.Hotel;
import Transaction.History;
import Enum.Post;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransactionManager {
    private final History history;

    // Création traquée du Directeur de l'hôtel
    public Employee createDirector(String idEmployee, String lastName, String firstName, double salary) {
        Employee director = new Employee(idEmployee, Post.RECEPTIONIST, salary);
        director.setLastName(lastName);
        director.setFirstName(firstName);

        history.addLog("SYSTEM", "Employee", "createDirector", "Création du directeur: " + firstName + " " + lastName);
        return director;
    }

    // Création traquée de l'Hôtel physique
    public Hotel createHotel(String name, String address, String phone, Employee director) {
        Hotel hotel = new Hotel();
        hotel.setName(name);
        hotel.setAddress(address);
        hotel.setPhone(phone);
        hotel.setDirector(director);

        history.addLog(director.getLastName(), "Hotel", "createHotel", "Création physique de l'hôtel: " + name);
        return hotel;
    }
}