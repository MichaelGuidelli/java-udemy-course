package championship;

public class Games {

    private Teams homeTeams;
    private Teams awayTeams;
    private int homeTeamsScore;
    private int awayTeamsScore;

    public Teams getHomeTeams() {
        return homeTeams;
    }

    public Teams getAwayTeams() {
        return awayTeams;
    }

    public int getHomeTeamsScore() {
        return homeTeamsScore;
    }

    public int getAwayTeamsScore() {
        return awayTeamsScore;
    }

    public void setHomeTeams(Teams homeTeams) {
        this.homeTeams = homeTeams;
    }

    public void setAwayTeam(Teams awayTeams) {
        this.awayTeams = awayTeams;
    }

    public void setHomeTeamsScore(int homeTeamsScore) {
        this.homeTeamsScore = homeTeamsScore;
    }

    public void setAwayTeamScore(int awayTeamsScore) {
        this.awayTeamsScore = awayTeamsScore;
    }

}
