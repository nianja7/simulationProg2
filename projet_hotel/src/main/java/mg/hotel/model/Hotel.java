package mg.hotel.model;

import mg.hotel.service.GestionnaireChambre;
import mg.hotel.service.GestionnaireClient;
import mg.hotel.service.GestionnaireEmploye;
import mg.hotel.service.GestionnairePaiement;
import mg.hotel.service.GestionnaireReservation;
import mg.hotel.service.GestionnaireSejour;
import mg.hotel.transaction.Historique;

import java.util.List;

public class Hotel extends Espace {
    private String nom;
    private String adresse;
    private String telephone;
    private List<Chambre> chambres;
    private Employe directeur;
    private List<Integer> listeDeNote;
    private double noteGlobal;
    private GestionnaireChambre gestionnaireChambre;
    private GestionnaireReservation gestionnaireReservation;
    private GestionnaireClient gestionnaireClient;
    private GestionnairePaiement gestionnairePaiement;
    private GestionnaireSejour gestionnaireSejour;
    private GestionnaireEmploye gestionnaireEmploye;
    private Historique historique;

    public Hotel(double volume, int capacity, String nom, String adresse, String telephone, List<Chambre> chambres,
                 Employe directeur, List<Integer> listeDeNote, double noteGlobal,
                 GestionnaireChambre gestionnaireChambre, GestionnaireReservation gestionnaireReservation,
                 GestionnaireClient gestionnaireClient, GestionnairePaiement gestionnairePaiement,
                 GestionnaireSejour gestionnaireSejour, GestionnaireEmploye gestionnaireEmploye,
                 Historique historique) {
        super(volume, capacity);
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.chambres = chambres;
        this.directeur = directeur;
        this.listeDeNote = listeDeNote;
        this.noteGlobal = noteGlobal;
        this.gestionnaireChambre = gestionnaireChambre;
        this.gestionnaireReservation = gestionnaireReservation;
        this.gestionnaireClient = gestionnaireClient;
        this.gestionnairePaiement = gestionnairePaiement;
        this.gestionnaireSejour = gestionnaireSejour;
        this.gestionnaireEmploye = gestionnaireEmploye;
        this.historique = historique;
    }
}
