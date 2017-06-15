package service;

import entities.Match;
import entities.MatchInfo;
import mapper.MatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchMapper matchMapper;
    public boolean insertMatch(Match match){
        return matchMapper.insertMatch(match)>0;
    }

    public List<MatchInfo> selectMatch(){
        return matchMapper.selectMatch();
    }
    public boolean updateMatch(Match match){
        return matchMapper.updateMatch(match)>0;
    }

    public boolean deleteMatch(Integer match){
        return matchMapper.deleteMatch(match)>0;
    }
}
