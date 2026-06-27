package Transaction;

import java.time.LocalDate;
import Enum.ReservationStatus;

public class Reservation extends Transaction{
    private int compagnionNumber;
    private LocalDate arrivalDate;
    private LocalDate SettingDate;
    private ReservationStatus status;
}

