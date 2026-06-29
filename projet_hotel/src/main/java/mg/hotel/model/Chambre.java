package mg.hotel.model;

import mg.hotel.enums.FournitureDeChambre;
import mg.hotel.enums.StatutChambre;
import mg.hotel.enums.TypeChambre;

import java.util.List;

public class Chambre extends Espace {
    private int numero;
    private TypeChambre type;
    private double prixParNuit;
    private StatutChambre statut;
    private List<Client> occupants;
    private List<FournitureDeChambre> fournitures;

    public Chambre(double volume, int capacity, int numero, TypeChambre type, double prixParNuit,
                   StatutChambre statut, List<Client> occupants, List<FournitureDeChambre> fournitures) {
        super(volume, capacity);
        this.numero = numero;
        this.type = type;
        this.prixParNuit = prixParNuit;
        this.statut = statut;
        this.occupants = occupants;
        this.fournitures = fournitures;
    }
}
