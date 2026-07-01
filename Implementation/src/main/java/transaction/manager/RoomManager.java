package transaction.manager;

import space.Room;
import enums.RoomType;
import enums.Post;
import person.Employee;
import transaction.History;
import errors.InvalideRoomExeption;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
import static enums.RoomStatus.FREE;
import static enums.TargetType.ROOM;

public class RoomManager extends AbstractManager {
    @Getter private final List<Room> roomList = new ArrayList<>();

    public RoomManager(History history) {
        super(history);
    }

    public Room createRoom(Employee caller, int number, RoomType type, double nightFee) {
        checkPost(caller, Post.RECEPTIONIST);

        var room = Room.builder()
                .numbre(number)
                .type(type)
                .nightFee(nightFee)
                .status(FREE)
                .guests(new ArrayList<>())
                .roomFeaturesList(new ArrayList<>())
                .reservations(new ArrayList<>())
                .build();

        this.roomList.add(room);

        addLog(caller.getLastName(), ROOM, "createRoom", "Physical Room #%d registered.".formatted(number));
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