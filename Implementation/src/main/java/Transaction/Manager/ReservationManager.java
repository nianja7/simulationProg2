package transaction.manager;

import model.enums.Post;
import person.Employee;
import transaction.Reservation;
import transaction.History;
import space.Room;
import java.time.LocalDate;
import java.util.ArrayList;
import lombok.Getter;

public class ReservationManager extends AbstractManager {
    @Getter private final ArrayList<Reservation> reservations = new ArrayList<>();
    private final RoomManager roomManager;

    public ReservationManager(History history, RoomManager roomManager) {
        super(history);
        this.roomManager = roomManager;
    }

    public Reservation createReservation(Employee caller, String id, int companionNumber, LocalDate arrival, int roomNumber) {
        checkPost(caller, Post.RECEPTIONIST);

        // Fails instantly and points out the culprit if the targeted room does not exist
        Room room = roomManager.getRoomByNumber(roomNumber, caller);

        Reservation reservation = new Reservation();
        reservation.setIdTransaction(id);
        reservation.setAct(caller);
        reservation.setTarget(room);
        this.reservations.add(reservation);

        history.addLog(caller.getLastName(), "Reservation", "createReservation", "Reservation " + id + " processed for Room #" + roomNumber);
        return reservation;
    }
}