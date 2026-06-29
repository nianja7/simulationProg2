package mg.hotel.transaction;

import java.time.LocalDateTime;

public class LogTransaction {
    private int idLog;
    private String nomActeur;
    private String typeCible;
    private String nomMethode;
    private LocalDateTime dateLog;
    private String details;

    public LogTransaction(int idLog, String nomActeur, String typeCible, String nomMethode, LocalDateTime dateLog,
                          String details) {
        this.idLog = idLog;
        this.nomActeur = nomActeur;
        this.typeCible = typeCible;
        this.nomMethode = nomMethode;
        this.dateLog = dateLog;
        this.details = details;
    }
}
