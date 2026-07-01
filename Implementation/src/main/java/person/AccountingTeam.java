package person;

import enums.Post;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
public class AccountingTeam extends Team {

    public AccountingTeam(String teamId, String teamTitle, TeamLeader leader) {
        super();
        this.setTeamId(teamId);
        this.setTeamTitle(teamTitle);
        this.setPost(Post.ACCOUNTABLE);
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