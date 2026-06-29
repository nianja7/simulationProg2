# SimulationProg2 - Projet Hotel

Ce depot contient un projet de simulation de gestion hoteliere base sur un diagramme UML.

Le code Java est organise dans un sous-projet Maven :

```text
simulationProg2/
├── README.md
├── UML_structure.png
└── projet_hotel/
    ├── pom.xml
    └── src/
        ├── main/
        │   └── java/
        │       └── mg/
        │           └── hotel/
        │               └── Main.java
        └── test/
            └── java/
                └── mg/
                    └── hotel/
                        └── MainTest.java
```

## Ouvrir le projet

Dans IntelliJ IDEA, ouvrir le dossier Maven :

```text
/home/santatra/Bureau/simulationProg2/projet_hotel
```

Si IntelliJ le demande, cliquer sur `Load Maven Project`.

## Configuration Maven

Le fichier Maven principal est :

```text
projet_hotel/pom.xml
```

Le projet utilise :

- Java 17
- Maven
- JUnit 5 pour les tests

## Lancer le programme

Classe principale :

```text
projet_hotel/src/main/java/mg/hotel/Main.java
```

Depuis IntelliJ, lancer la classe `mg.hotel.Main`.

En terminal, si Maven est installe :

```bash
cd projet_hotel
mvn compile
```

## Lancer les tests

Les tests sont dans :

```text
projet_hotel/src/test/java
```

Commande :

```bash
cd projet_hotel
mvn test
```

Note : si la commande `mvn` affiche `command not found`, Maven n'est pas installe sur le PC ou n'est pas disponible dans le `PATH`.

## Structure Java prevue

Pour implementer le diagramme UML, les packages suivants sont conseilles :

```text
mg.hotel.enums
mg.hotel.model
mg.hotel.exception
mg.hotel.transaction
mg.hotel.service
```

Repartition conseillee :

- `mg.hotel.enums` : `StatutChambre`, `TypeChambre`, `Poste`, `Fonction`, `FournitureDeChambre`
- `mg.hotel.model` : `Espace`, `Hotel`, `Chambre`, `Personne`, `Client`, `Employe`, `Equipe`, `ChefDEquipe`
- `mg.hotel.transaction` : `Transaction`, `Reservation`, `Sejour`, `Paiement`, `Historique`, `LogTransaction`
- `mg.hotel.service` : `GestionnaireChambre`, `GestionnaireReservation`, `GestionnaireClient`, `GestionnairePaiement`, `GestionnaireSejour`, `GestionnaireEmploye`
- `mg.hotel.exception` : `HotelException`, `ChambreIndisponibleException`, `ReservationInvalideException`, `TransactionNonAutorisee`

## Etat actuel

Le projet Maven est initialise avec :

- une classe `Main` minimale ;
- un test JUnit minimal ;
- une configuration Maven prete pour ajouter les classes du diagramme UML.

La prochaine etape est d'ajouter les enums et les classes Java du diagramme UML dans les packages correspondants.
