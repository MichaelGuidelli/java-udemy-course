package championship;

public class Players {

    private String playerName;
    private int playerDateOfBirth;
    private boolean isLeader;

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerDateOfBirth() {
        return playerDateOfBirth;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerDateOfBirth(int playerDateOfBirth) {
        this.playerDateOfBirth = playerDateOfBirth;
    }

    public void setIsLeader(boolean isLeader) {
        this.isLeader = isLeader;
    }
}
