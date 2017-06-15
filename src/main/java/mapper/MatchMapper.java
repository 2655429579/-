package mapper;

import entities.Match;
import entities.MatchInfo;

import java.util.List;

public interface MatchMapper {
    int insertMatch(Match match);

    List<MatchInfo> selectMatch();

    int updateMatch(Match match);

    int deleteMatch(Integer match);
}
