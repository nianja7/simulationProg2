package mg.hotel.service;

import mg.hotel.model.Chambre;

import java.util.List;

public class GestionnaireChambre {
    private List<Chambre> chambres;

    public GestionnaireChambre(List<Chambre> chambres) {
        this.chambres = chambres;
    }
}
