package mg.hotel.transaction;

public class Paiement {
    private double montant;
    private String modePaiement;
    private Reservation reservation;

    public Paiement(double montant, String modePaiement, Reservation reservation) {
        this.montant = montant;
        this.modePaiement = modePaiement;
        this.reservation = reservation;
    }
}
