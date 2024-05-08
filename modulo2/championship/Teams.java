package championship;

import java.util.List;

public class Teams {

    private String teamName;
    private List<Players> player;

    public List<Players> getPlayers() {
        return player;
    }

    public void setPlayers(List<Players> player) {
        this.player = player;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
