package mg.hotel.transaction;

import mg.hotel.model.Chambre;
import mg.hotel.model.Personne;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation extends Transaction {
    private int nombreDOccupants;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;
    private Chambre chambre;

    public Reservation(String idTransaction, LocalDateTime dateExecution, Personne acteur, Object cible,
                       int nombreDOccupants, LocalDate dateArrivee, LocalDate dateDepart, Chambre chambre) {
        super(idTransaction, dateExecution, acteur, cible);
        this.nombreDOccupants = nombreDOccupants;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.chambre = chambre;
    }
}
