package transaction;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class History {
    @Builder.Default
    private ArrayList<TransactionLog> logs = new ArrayList<>();
}