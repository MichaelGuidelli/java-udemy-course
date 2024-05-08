package championship;

import java.util.ArrayList;
import java.util.List;

class Tournament {
    private String tournamentName;
    private List<Teams> team;

    private List<Games> game = new ArrayList<Games>();

    public void infoTeams(Teams team) {
        for (Games games : game) {
            if (games.getHomeTeams().getTeamName().equals(team.getTeamName()))
                System.out.println(
                        team.getTeamName() + " - " + games.getAwayTeams().getTeamName() + ": giocata in casa");
            if (games.getAwayTeams().getTeamName().equals(team.getTeamName()))
                System.out.println(
                        team.getTeamName() + " - " + games.getHomeTeams().getTeamName() + ": giocata in trasferta");
        }
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public List<Teams> getTeam() {
        return team;
    }

    public List<Games> getGame() {
        return game;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public void setTeams(List<Teams> team) {
        this.team = team;
    }

    public void setGames(List<Games> game) {
        this.game = game;
    }

    public static void main(String[] args) {
        Tournament tournament = new Tournament();
        Games game = new Games();

        tournament.setTournamentName("CALCIO 2021");

        Teams team1 = new Teams();
        team1.setTeamName("Juve");

        Teams team2 = new Teams();
        team2 = new Teams();

        team2.setTeamName("Roma");

        game.setHomeTeams(team1);
        game.setAwayTeam(team2);
        tournament.getGame().add(game);

        tournament.infoTeams(team1);
    }
}