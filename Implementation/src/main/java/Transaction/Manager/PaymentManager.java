package Transaction.Manager;

import Transaction.Payment;
import Transaction.History;
import Enum.PaymentMethod;
import Person.Person;
import lombok.RequiredArgsConstructor;
import lombok.Getter;
import java.util.ArrayList;

@RequiredArgsConstructor
public class PaymentManager {
    @Getter private final ArrayList<Payment> payments = new ArrayList<>();
    private final History history;

    // Enregistrement et traçabilité d'un flux de paiement
    public Payment createPayment(String idTransaction, double amount, PaymentMethod mode, Person actor, Object target) {
        Payment payment = new Payment(amount, mode);
        payment.setIdTransaction(idTransaction);
        payment.setAct(actor);
        payment.setTarget(target);
        payment.setDateExecution(java.time.LocalDate.now());

        this.payments.add(payment);

        // Traçabilité de l'opération financière
        history.addLog(
                actor.getLastName(),
                "Payment",
                "createPayment",
                "Enregistrement d'un paiement de " + amount + " EUR via " + mode.getDisplayName() + " (Transaction ID: " + idTransaction + ")"
        );

        return payment;
    }
}