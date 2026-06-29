package mg.hotel.model;

public class Client extends Personne {
    private int idClient;

    public Client(String nom, String prenom, String telephone, String email, int idClient) {
        super(nom, prenom, telephone, email);
        this.idClient = idClient;
    }
}
