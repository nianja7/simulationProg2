package mg.hotel.model;

import mg.hotel.enums.Fonction;
import mg.hotel.enums.Poste;

public class ChefDEquipe extends Employe {
    public ChefDEquipe(String nom, String prenom, String telephone, String email, int idEmploye, Poste poste,
                       Fonction fonction, double salaire) {
        super(nom, prenom, telephone, email, idEmploye, poste, fonction, salaire);
    }
}
