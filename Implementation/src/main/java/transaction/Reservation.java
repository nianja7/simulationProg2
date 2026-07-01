package transaction;

import java.time.LocalDate;
import enums.ReservationStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Reservation extends Transaction {
    private int compagnionNumber;
    private LocalDate arrivalDate;
    private LocalDate SettingDate;
    private ReservationStatus status;
}