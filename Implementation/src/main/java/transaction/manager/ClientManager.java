package transaction.manager;

import person.Client;
import person.Person;
import transaction.History;
import lombok.Getter;
import java.util.ArrayList;
import static enums.TargetType.PERSON;

public class ClientManager extends TransactionManager {
    @Getter private final ArrayList<Client> clients = new ArrayList<>();

    public ClientManager(History history) {
        super(history);
    }

    public Client createClient(String id, String lastName, String firstName, String phone, String email, Person actor) {

        var client = Client.builder()
                .lastName(lastName)
                .firstName(firstName)
                .phoneNumber(phone)
                .email(email)
                .id(id)
                .build();

        this.clients.add(client);

        // Journalisation propre
        addLog(
                actor.getLastName(),
                PERSON,
                "createClient",
                "Enregistrement du client physique: %s %s (ID: %s)".formatted(firstName, lastName, id)
        );

        return client;
    }
}