package mg.hotel.model;

import mg.hotel.enums.Poste;

import java.util.List;

public class EquipeEntretien extends Equipe {
    public EquipeEntretien(String equipeID, String equipeIntitule, Poste poste, List<Employe> membres,
                           ChefDEquipe chef) {
        super(equipeID, equipeIntitule, poste, membres, chef);
    }
}
