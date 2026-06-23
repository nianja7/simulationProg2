Hotel
Attributs :

* nom
* adresse
* telephone
* chambres : List<Chambre>
* clients : List<Client>
* reservations : List<Reservation>

Méthodes :

* ajouterChambre(Chambre)
* supprimerChambre(int numero)
* ajouterClient(Client)
* ajouterReservation(Reservation)
* rechercherChambreDisponible(TypeChambre)
* afficherInformations()

Chambre
Attributs :

* numero
* type : TypeChambre
* prixParNuit
* statut : StatutChambre

Méthodes :

* reserver()
* liberer()
* mettreEnMaintenance()
* estDisponible()
* afficherDetails()

Client
Attributs :

* idClient
* nom
* prenom
* telephone
* email

Méthodes :

* modifierInformations()
* afficherProfil()

Reservation
Attributs :

* idReservation
* client : Client
* chambre : Chambre
* dateArrivee
* dateDepart
* statut : StatutReservation

Méthodes :

* confirmerReservation()
* annulerReservation()
* terminerReservation()
* calculerMontant()
* afficherReservation()

Paiement
Attributs :

* idPaiement
* reservation : Reservation
* montant
* datePaiement
* modePaiement

Méthodes :

* effectuerPaiement()
* genererRecu()
* afficherPaiement()

Personne (optionnel)
Attributs :

* nom
* prenom
* telephone
* email

Méthodes :

* afficherInformations()

Employe (optionnel)
Attributs :

* idEmploye
* poste
* salaire

Méthodes :

* afficherInformations()
* modifierSalaire()

GestionChambre
Attributs :

* chambres : List<Chambre>

Méthodes :

* ajouterChambre(Chambre)
* supprimerChambre(int numero)
* rechercherChambre(int numero)
* listerChambresDisponibles()

GestionReservation
Attributs :

* reservations : List<Reservation>

Méthodes :

* ajouterReservation(Reservation)
* annulerReservation(int idReservation)
* rechercherReservation(int idReservation)
* listerReservations()

GestionClient
Attributs :

* clients : List<Client>

Méthodes :

* ajouterClient(Client)
* supprimerClient(int idClient)
* rechercherClient(int idClient)
* listerClients()

GestionPaiement
Attributs :

* paiements : List<Paiement>

Méthodes :

* ajouterPaiement(Paiement)
* rechercherPaiement(int idPaiement)
* listerPaiements()

ChambreIndisponibleException
Méthodes :

* ChambreIndisponibleException(String message)

ReservationInvalideException
Méthodes :

* ReservationInvalideException(String message)
