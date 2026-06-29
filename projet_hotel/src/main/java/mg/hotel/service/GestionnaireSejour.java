package mg.hotel.service;

import mg.hotel.transaction.Historique;
import mg.hotel.transaction.Sejour;

import java.util.List;

public class GestionnaireSejour extends GestionTransaction {
    private List<Sejour> sejours;

    public GestionnaireSejour(Historique historique, List<Sejour> sejours) {
        super(historique);
        this.sejours = sejours;
    }
}
