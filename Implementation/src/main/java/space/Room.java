package space;
import enums.RoomType;
import enums.RoomStatus;
import enums.RoomFeatures;
import person.Client;
import transaction.Reservation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@AllArgsConstructor
@Data
@SuperBuilder
@Builder
public class Room {
    private int numbre;
    private RoomType type;
    private double nightFee;
    private RoomStatus status;
    private ArrayList<Client> guests;
    private ArrayList<RoomFeatures> roomFeaturesList;
    private ArrayList<Reservation> reservations;
}
