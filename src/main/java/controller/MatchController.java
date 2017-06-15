package controller;

import entities.Match;
import entities.MatchInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.MatchService;

import java.util.List;

@RestController
public class MatchController {
    private final MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping("match")
    public boolean insertMatche(@RequestBody Match match){
        return matchService.insertMatch(match);
    }

    @GetMapping("match")
    public List<MatchInfo> selectAllMatch(){
        return matchService.selectMatch();
    }

    @PutMapping("match")
    public boolean updateMatch(@RequestBody Match match){
        return matchService.updateMatch(match);
    }

    @PostMapping("match/{matchId}")
    public boolean deleteMatch(@PathVariable("matchId") Integer matchId){
        return matchService.deleteMatch(matchId);
    }
}
