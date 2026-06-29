package mg.hotel.service;

import mg.hotel.model.Employe;

import java.util.List;

public class GestionnaireEmploye {
    private List<Employe> employes;

    public GestionnaireEmploye(List<Employe> employes) {
        this.employes = employes;
    }
}
