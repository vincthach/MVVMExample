package com.example.thachnguyenit.mvvmexample.data;

import com.example.thachnguyenit.mvvmexample.models.MatchResult;
import com.example.thachnguyenit.mvvmexample.models.Team;

/**
 * Created by thachnguyenit on 1/7/17.
 */

public class DummyData {
    public static MatchResult createDummyData() {
        Team teamA = new Team("Team A", 10);
        Team teamB = new Team("Team B", 9);
        String featureImage = "http://kenh14cdn.com/2016/tung-son-la-ai-2-1477556820136.jpg";
        MatchResult matchResult = new MatchResult(teamA, teamB, featureImage);
        return matchResult;
    }
}
