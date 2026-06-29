package mg.hotel.service;

import mg.hotel.model.Client;

import java.util.List;

public class GestionnaireClient {
    private List<Client> clients;

    public GestionnaireClient(List<Client> clients) {
        this.clients = clients;
    }
}
