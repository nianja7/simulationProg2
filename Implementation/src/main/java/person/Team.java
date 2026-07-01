package person;

import enums.Post;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.ArrayList;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Team {
    private String teamId;
    private String teamTitle;
    private Post post;

    @SuperBuilder.Default
    private List<Employee> members = new ArrayList<>();
    private TeamLeader leader;

    // Méthode abstraite demandée
    public abstract void assign(Employee employee);
}