package mg.hotel.service;

import mg.hotel.transaction.Historique;

public abstract class GestionTransaction {
    protected Historique historique;

    public GestionTransaction(Historique historique) {
        this.historique = historique;
    }
}
