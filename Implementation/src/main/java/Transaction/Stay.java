package Transaction;

import java.time.LocalDate;
import Enum.StayStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Stay extends Transaction {
    private int compagnionNumber;
    private LocalDate arrivalDate;
    private LocalDate SettingDate; // Date d'établissement / check-out
    private StayStatus status;
}