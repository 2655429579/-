package controller;


import entities.Player;
import entities.RankPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.PlayerService;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("account")
    public boolean account(@RequestBody Player player){
        return this.playerService.hasAccount(player);
    }

    @PostMapping("player")
    public boolean insertPlayer(@RequestBody Player player){
        return this.playerService.insertPlayer(player);
    }

    @PostMapping("login")
    public boolean login(@RequestBody Player player, HttpSession session){
        Player player1 = playerService.login(player);
        session.setAttribute("player",player1);
        return player1!=null;
    }

    @GetMapping("player")
    public List<Player> selectAllPlayer(){
        return playerService.selectAllPlayer();
    }

    @GetMapping("rankPlayer")
    public List<RankPlayer> selectRankPlayer(){
        return playerService.selectRankPlayer();
    }

    @GetMapping("playerInfo")
    public Player getPlayer(HttpSession session){
        Player player = (Player) session.getAttribute("player");
        return playerService.setVoteByPlayerId(player);
    }
}
