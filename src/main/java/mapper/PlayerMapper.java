package mapper;

import entities.Player;
import entities.RankPlayer;

import java.util.List;

public interface PlayerMapper {
    int insertPlayer(Player player);

    int selectAccount(Player player);
    List<Player> selectAllPlay();
    Player selectPlayerByLogin(Player player);

    List<RankPlayer> selectRankPlayer();

    int selectVoteByPlayerId(long id);
}
