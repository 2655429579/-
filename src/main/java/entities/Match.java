package entities;

public class Match {
  private Long matchId;
  private Long playId1;
  private Long playId2;
  private String song1;
  private String song2;
  private Long vote1;
  private Long vote2;
  private Long status;
  private int index;
  private int vote;

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public Long getMatchId() {
    return matchId;
  }

  public void setMatchId(Long matchId) {
    this.matchId = matchId;
  }

  public Long getPlayId1() {
    return playId1;
  }

  public void setPlayId1(Long playId1) {
    this.playId1 = playId1;
  }

  public Long getPlayId2() {
    return playId2;
  }

  public void setPlayId2(Long playId2) {
    this.playId2 = playId2;
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

  public Long getVote1() {
    return vote1;
  }

  public void setVote1(Long vote1) {
    this.vote1 = vote1;
  }

  public Long getVote2() {
    return vote2;
  }

  public void setVote2(Long vote2) {
    this.vote2 = vote2;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }
}
