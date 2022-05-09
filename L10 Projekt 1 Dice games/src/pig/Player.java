package pig;

public class Player {
    private int totalPoint;
    private int rundePoint;
    private String playerName;
    private int wonGames;

    public void updateTotal() {
        totalPoint += rundePoint;
    }

    public void setWonGames(int wonGames) {
        this.wonGames = wonGames;
    }

    public int getWonGames() {
        return wonGames;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setRundePoint(int rundePoint) {
        this.rundePoint = rundePoint;
    }

    public int getRundePoint() {
        return rundePoint;
    }
}
