package mg.hotel.transaction;

import mg.hotel.model.Chambre;
import mg.hotel.model.Personne;

import java.time.LocalDateTime;

public class Sejour extends Transaction {
    private LocalDateTime dateArriveeReelle;
    private LocalDateTime dateDepartReelle;
    private String statut;
    private Chambre chambre;
    private Reservation reservation;

    public Sejour(String idTransaction, LocalDateTime dateExecution, Personne acteur, Object cible,
                  LocalDateTime dateArriveeReelle, LocalDateTime dateDepartReelle, String statut, Chambre chambre,
                  Reservation reservation) {
        super(idTransaction, dateExecution, acteur, cible);
        this.dateArriveeReelle = dateArriveeReelle;
        this.dateDepartReelle = dateDepartReelle;
        this.statut = statut;
        this.chambre = chambre;
        this.reservation = reservation;
    }
}
