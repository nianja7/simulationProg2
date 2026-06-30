package transaction.manager;

import space.Room;
import model.enums.RoomType;
import model.enums.RoomStatus;
import model.enums.Post;
import person.Employee;
import transaction.History;
import error.InvalideRoomExeption;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class RoomManager extends AbstractManager {
    @Getter private final List<Room> roomList = new ArrayList<>();

    public RoomManager(History history) {
        super(history);
    }

    public Room createRoom(Employee caller, int number, RoomType type, double nightFee) {
        checkPost(caller, Post.RECEPTIONIST);

        Room room = new Room(number, type, nightFee, RoomStatus.FREE, new ArrayList<>());
        this.roomList.add(room);

        history.addLog(caller.getLastName(), "Room", "createRoom", "Physical Room #" + number + " registered.");
        return room;
    }

    public Room getRoomByNumber(int roomNumber, Employee caller) {
        checkPost(caller, Post.RECEPTIONIST);

        return roomList.stream()
                .filter(room -> room.getNumbre() == roomNumber)
                .findFirst()
                .orElseThrow(() -> new InvalideRoomExeption(
                        caller,
                        "Room #" + roomNumber,
                        "Targeted room cannot be tracked down.",
                        "Verify room layout configurations or instantiate the missing room structure via createRoom()."
                ));
    }
}