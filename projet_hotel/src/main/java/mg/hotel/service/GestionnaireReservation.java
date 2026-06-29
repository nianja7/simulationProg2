package mg.hotel.service;

import mg.hotel.transaction.Historique;
import mg.hotel.transaction.Reservation;

import java.util.List;

public class GestionnaireReservation extends GestionTransaction {
    private List<Reservation> reservations;

    public GestionnaireReservation(Historique historique, List<Reservation> reservations) {
        super(historique);
        this.reservations = reservations;
    }
}
