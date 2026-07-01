package transaction.manager;

import enums.Post;
import person.Employee;
import transaction.Reservation;
import transaction.History;
import java.time.LocalDate;
import java.util.ArrayList;
import lombok.Getter;
import static enums.TargetType.TRANSACTION;

public class ReservationManager extends AbstractManager {
    @Getter private final ArrayList<Reservation> reservations = new ArrayList<>();
    private final RoomManager roomManager;

    public ReservationManager(History history, RoomManager roomManager) {
        super(history);
        this.roomManager = roomManager;
    }

    public Reservation createReservation(Employee caller, String id, int companionNumber, LocalDate arrival, int roomNumber) {
        checkPost(caller, Post.RECEPTIONIST);

        var room = roomManager.getRoomByNumber(roomNumber, caller);

        var reservation = Reservation.builder()
                .actor(caller)
                .target(room)
                .dateExecution(LocalDate.now())
                .compagnionNumber(companionNumber)
                .arrivalDate(arrival)
                .build();

        this.reservations.add(reservation);

        addLog(caller.getLastName(), TRANSACTION, "createReservation", "Reservation %s processed for Room #%d".formatted(id, roomNumber));
        return reservation;
    }
}