package transaction.manager;

import model.enums.Fonction;
import model.enums.Post;
import person.Employee;
import person.Team;
import transaction.History;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class TeamManager extends AbstractManager {
    @Getter private final List<Team> teams = new ArrayList<>();

    public TeamManager(History history) {
        super(history);
    }

    public Team createTeam(Employee caller, String teamId, String teamTitle, Post post) {
        // Enforces that only top-level executives (DIRECTEUR) can alter the corporate staff structure
        checkFonction(caller, Fonction.DIRECTEUR);

        Team team = new Team(teamId, teamTitle, post, new ArrayList<>(), null);
        this.teams.add(team);

        history.addLog(caller.getLastName(), "Team", "createTeam", "Corporate unit initialized: " + teamTitle);
        return team;
    }
}