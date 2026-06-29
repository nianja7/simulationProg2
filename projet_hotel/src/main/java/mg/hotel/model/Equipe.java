package mg.hotel.model;

import mg.hotel.enums.Poste;

import java.util.List;

public class Equipe {
    private String equipeID;
    private String equipeIntitule;
    private Poste poste;
    private List<Employe> membres;
    private ChefDEquipe chef;

    public Equipe(String equipeID, String equipeIntitule, Poste poste, List<Employe> membres, ChefDEquipe chef) {
        this.equipeID = equipeID;
        this.equipeIntitule = equipeIntitule;
        this.poste = poste;
        this.membres = membres;
        this.chef = chef;
    }
}
