package mg.hotel.transaction;

import mg.hotel.model.Personne;

import java.time.LocalDateTime;

public abstract class Transaction {
    private String idTransaction;
    private LocalDateTime dateExecution;
    private Personne acteur;
    private Object cible;

    public Transaction(String idTransaction, LocalDateTime dateExecution, Personne acteur, Object cible) {
        this.idTransaction = idTransaction;
        this.dateExecution = dateExecution;
        this.acteur = acteur;
        this.cible = cible;
    }
}
