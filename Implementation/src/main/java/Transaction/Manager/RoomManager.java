package Transaction.Manager;

import Space.Room;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import Enum.RoomStatus;

import static Enum.RoomStatus.FREE;

public class RoomManager {
    private List<Room> roomList;

    public List<Room> searchFreeRoom() {
        return roomList.stream()
                .filter(room -> room.getStatus().equals(FREE)) // Correction : .equals()
                .collect(Collectors.toList());                // Correction : toList()
    }
}
