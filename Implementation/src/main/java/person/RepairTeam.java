package person;

import enums.Post;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RepairTeam extends Team {

    public RepairTeam(String teamId, String teamTitle, TeamLeader leader) {
        super();
        this.setTeamId(teamId);
        this.setTeamTitle(teamTitle);
        this.setPost(Post.MAINTENACE);
        this.setLeader(leader);
    }

    @Override
    public void assign(Employee employee) {
        if (employee != null) {
            employee.setPost(this.getPost());
            this.getMembers().add(employee);
        }
    }
}