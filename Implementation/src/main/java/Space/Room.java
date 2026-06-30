package Space;
import Enum.RoomType;
import Enum.RoomStatus;
import Person.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Room {
    private int numbre;
    private RoomType type;
    private double nightFee;
    private RoomStatus status;
    private List<Client> guests;
    private List<RoomFeatures> roomFeaturesList;

}
