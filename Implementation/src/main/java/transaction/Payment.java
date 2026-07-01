package transaction;

import enums.PaymentMethod;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Payment extends Transaction {
    private double amount;
    private PaymentMethod mode;
}