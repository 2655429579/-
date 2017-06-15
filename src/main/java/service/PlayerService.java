package service;

import entities.Player;
import entities.RankPlayer;
import mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerMapper playerMapper;

    @Autowired
    public PlayerService(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    public boolean hasAccount(Player player){
        return this.playerMapper.selectAccount(player)>0;
    }

    public boolean insertPlayer(Player player){
        return this.playerMapper.insertPlayer(player)>0;
    }

    public Player login(Player player){
        return playerMapper.selectPlayerByLogin(player);
    }

    public List<Player> selectAllPlayer(){
        return playerMapper.selectAllPlay();
    }

    public List<RankPlayer> selectRankPlayer(){
        return playerMapper.selectRankPlayer();
    }

    public Player setVoteByPlayerId(Player player){
        player.setVote(playerMapper.selectVoteByPlayerId(player.getPlayerId()));
        return  player;
    }
}
