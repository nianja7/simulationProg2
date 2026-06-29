package mg.hotel.model;

import mg.hotel.enums.Fonction;
import mg.hotel.enums.Poste;

public class Employe extends Personne {
    private int idEmploye;
    private Poste poste;
    private Fonction fonction;
    private double salaire;

    public Employe(String nom, String prenom, String telephone, String email, int idEmploye, Poste poste,
                   Fonction fonction, double salaire) {
        super(nom, prenom, telephone, email);
        this.idEmploye = idEmploye;
        this.poste = poste;
        this.fonction = fonction;
        this.salaire = salaire;
    }
}
