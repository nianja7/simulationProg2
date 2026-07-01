package transaction.manager;

import person.Employee;
import space.Hotel;
import transaction.History;
import enums.TargetType;
import transaction.Transaction;
import transaction.TransactionLog;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;
import static enums.TargetType.HOTEL;

@RequiredArgsConstructor
public class TransactionManager {
    protected final History history;

    private TransactionLog createLog(String actor, TargetType targetType, String action, String description){
        return TransactionLog.builder()
                .actorName(actor)
                .targetType(targetType)
                .methodeName(action)
                .details(description)
                .build();
    }

    protected void addLog(String actor, TargetType targetType, String action, String description){
        history.getLogs().add(createLog(actor,targetType,action,description));
    }

    protected void logAnyTransaction(Transaction transaction, String action, String description) {
        String actorName = transaction.getActor().getLastName();
        String targetType = transaction.getTarget().getClass().getSimpleName();
        LocalDate dateLog = transaction.getDateExecution();

        this.addLog(actorName, TargetType.valueOf(targetType), action, description);
    }

    public Hotel createHotel(String name, String address, String phone, Employee director) {
        var hotel= Hotel.builder().phone(phone).address(address).name(name).director(director).build();

        addLog("SYSTEM", HOTEL, "createHotel", "The hotel %s was successfully created!".formatted(name));
        return hotel;
    }
}