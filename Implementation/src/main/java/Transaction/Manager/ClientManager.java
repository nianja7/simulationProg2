package Transaction.Manager;

import Person.Client;
import Person.Person;
import Transaction.History;
import lombok.RequiredArgsConstructor;
import lombok.Getter;
import java.util.ArrayList;

@RequiredArgsConstructor
public class ClientManager {
    @Getter private final ArrayList<Client> clients = new ArrayList<>();
    private final History history;

    public Client createClient(String id, String lastName, String firstName, String phone, String email, Person actor) {
        Client client = new Client();
        client.setId(id);
        client.setLastName(lastName);
        client.setFirstName(firstName);
        client.setPhoneNumber(phone);
        client.setEmail(email);

        this.clients.add(client);

        history.addLog(actor.getLastName(), "Client", "createClient",
                "Enregistrement du client physique: " + firstName + " " + lastName + " (ID: " + id + ")");
        return client;
    }
}