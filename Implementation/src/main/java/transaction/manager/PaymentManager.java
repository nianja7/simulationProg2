package transaction.manager;

import transaction.Payment;
import transaction.History;
import enums.PaymentMethod;
import person.Person;
import lombok.Getter;
import java.util.ArrayList;
import java.time.LocalDate;
import static enums.TargetType.TRANSACTION;

public class PaymentManager extends TransactionManager {
    @Getter private final ArrayList<Payment> payments = new ArrayList<>();

    public PaymentManager(History history) {
        super(history);
    }

    public Payment createPayment(double amount, PaymentMethod mode, Person actor, Object target) {
        // Construction de l'objet de manière fluide sans aucun setter ni variable d'ID manuelle
        var payment = Payment.builder()
                .amount(amount)
                .mode(mode)
                .actor(actor)
                .target(target)
                .dateExecution(LocalDate.now())
                .build();

        this.payments.add(payment);

        addLog(
                actor.getLastName(),
                TRANSACTION,
                "createPayment",
                "Enregistrement d'un paiement de %.2f EUR via %s.".formatted(amount, mode.getDisplayName())
        );

        return payment;
    }
}