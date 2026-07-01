package transaction.manager;

import enums.Post;
import person.*;
import transaction.History;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import static enums.Function.TEAM_CHIEF;
import static enums.TargetType.TEAM;

public class TeamManager extends AbstractManager {
    @Getter private final List<Team> teams = new ArrayList<>();

    public TeamManager(History history) {
        super(history);
    }

    public Team createTeam(Employee caller, String teamId, String teamTitle, Post post) {
        checkFonction(caller, TEAM_CHIEF);
        Team team;
        switch (post) {
            case MAINTENACE -> team = RepairTeam.builder()
                    .teamId(teamId)
                    .teamTitle(teamTitle)
                    .post(post) // Sera géré automatiquement par le constructeur ou forcé ici
                    .build();

            case RECEPTIONIST -> team = ReceptionistTeam.builder()
                    .teamId(teamId)
                    .teamTitle(teamTitle)
                    .post(post)
                    .build();

            case CARETAKER -> team = HouseKeepingTeam.builder()
                    .teamId(teamId)
                    .teamTitle(teamTitle)
                    .post(post)
                    .build();

            default -> throw new IllegalArgumentException("No specific team implementation found for role: " + post);
        }

        this.teams.add(team);

        addLog(caller.getLastName(), TEAM, "createTeam", "Corporate unit initialized: %s".formatted(teamTitle));
        return team;
    }
}