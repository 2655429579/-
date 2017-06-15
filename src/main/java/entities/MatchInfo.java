package entities;

public class MatchInfo {
    private long matchId;
    private Player player1;
    private Player player2;
    private String song1;
    private String song2;
    private int vote1;
    private int vote2;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSong1() {
        return song1;
    }

    public void setSong1(String song1) {
        this.song1 = song1;
    }

    public String getSong2() {
        return song2;
    }

    public void setSong2(String song2) {
        this.song2 = song2;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getVote1() {
        return vote1;
    }

    public void setVote1(int vote1) {
        this.vote1 = vote1;
    }

    public int getVote2() {
        return vote2;
    }

    public void setVote2(int vote2) {
        this.vote2 = vote2;
    }
}
