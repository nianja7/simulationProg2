package person;

import model.enums.Post;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    private String teamId;
    private String teamTitle;
    private Post post;
    private List<Employee> members = new ArrayList<>();
    private TeamLeader leader;
}