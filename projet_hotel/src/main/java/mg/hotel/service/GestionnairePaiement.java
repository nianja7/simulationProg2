package mg.hotel.service;

import mg.hotel.transaction.Paiement;

import java.util.List;

public class GestionnairePaiement {
    private List<Paiement> paiements;

    public GestionnairePaiement(List<Paiement> paiements) {
        this.paiements = paiements;
    }
}
