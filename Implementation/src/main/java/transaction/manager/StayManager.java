package transaction.manager;

import transaction.Stay;
import transaction.History;
import person.Person;
import space.Room;
import lombok.Getter;
import java.time.LocalDate;
import java.util.ArrayList;
import static enums.TargetType.TRANSACTION;

public class StayManager extends AbstractManager {
    @Getter private final ArrayList<Stay> stays = new ArrayList<>();

    public StayManager(History history) {
        super(history);
    }

    public Stay createStay(String idTransaction, int companionNumber, LocalDate arrivalDate, Room targetedRoom, Person actor) {
        var stay = Stay.builder()
                .compagnionNumber(companionNumber)
                .arrivalDate(arrivalDate)
                .target(targetedRoom)
                .actor(actor)
                .dateExecution(LocalDate.now())
                .build();

        this.stays.add(stay);

        addLog(
                actor.getLastName(),
                TRANSACTION,
                "createStay",
                "Début de séjour enregistré pour la chambre #%d avec %d accompagnant(s).".formatted(targetedRoom.getNumbre(), companionNumber)
        );

        return stay;
    }
}