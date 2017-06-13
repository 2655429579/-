package mapper;

import entities.Player;

public interface PlayerMapper {
    int insertPlayer(Player player);

    int selectAccount(Player player);
}
