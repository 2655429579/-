package controller;


import entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.PlayerService;

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



}
