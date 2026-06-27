package Transaction;

import java.time.LocalDate;
import Enum.StayStatus;

public class Stay extends Transaction{
    private int compagnionNumber;
    private LocalDate arrivalDate;
    private LocalDate SettingDate;
    private StayStatus status;
}
