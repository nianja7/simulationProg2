package mg.hotel.transaction;

import java.util.List;

public class Historique {
    private List<LogTransaction> logs;

    public Historique(List<LogTransaction> logs) {
        this.logs = logs;
    }
}
