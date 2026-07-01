package transaction;

import lombok.*;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;
import enums.TargetType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionLog {
    private static final AtomicInteger counter = new AtomicInteger(0);

    @Builder.Default
    private int idLog = counter.incrementAndGet();

    @Builder.Default
    private LocalDateTime dateLog = LocalDateTime.now();

    private String actorName;
    private TargetType targetType;
    private String methodeName;
    private String details;
}