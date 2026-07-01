package transaction;

import java.time.LocalDate;
import enums.StayStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Stay extends Transaction {
    private int compagnionNumber;
    private LocalDate arrivalDate;
    private LocalDate SettingDate; //by check-out
    private StayStatus status;
}