package Transaction.Manager;

import Transaction.Stay;
import Transaction.History;
import Enum.StayStatus;
import Person.Person;
import Space.Room;
import lombok.RequiredArgsConstructor;
import lombok.Getter;
import java.time.LocalDate;
import java.util.ArrayList;

@RequiredArgsConstructor
public class StayManager {
    @Getter private final ArrayList<Stay> stays = new ArrayList<>();
    private final History history;

    // Enregistrement et traçabilité d'un séjour physique actif
    public Stay createStay(String idTransaction, int companionNumber, LocalDate arrivalDate, Room targetedRoom, Person actor) {
        Stay stay = new Stay(companionNumber, arrivalDate, null, StayStatus.RUNNING);
        stay.setIdTransaction(idTransaction);
        stay.setAct(actor);
        stay.setTarget(targetedRoom);
        stay.setDateExecution(LocalDate.now());

        this.stays.add(stay);

        // Traçabilité de l'occupation d'une chambre
        history.addLog(
                actor.getLastName(),
                "Stay",
                "createStay",
                "Début de séjour enregistré pour la chambre #" + targetedRoom.getNumbre() + " avec " + companionNumber + " accompagnant(s)."
        );

        return stay;
    }
}