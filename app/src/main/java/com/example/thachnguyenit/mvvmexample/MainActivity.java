package com.example.thachnguyenit.mvvmexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.feature_image)
    ImageView featureImage;

    @BindView(R.id.home_team_name)
    TextView homeTeamName;

    @BindView(R.id.home_team_goals)
    TextView homeTeamGoals;

    @BindView(R.id.away_team_name)
    TextView awayTeamName;

    @BindView(R.id.away_team_goals)
    TextView awayTeamGoals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        MatchResult matchResult = createDummyData();
        fillData(matchResult);
    }

    private void fillData(MatchResult matchResult) {
        if (matchResult == null)
            return;
        if (matchResult.getFeatureImage() != null) {
            Glide.with(this).load(matchResult.getFeatureImage()).into(featureImage);
        }
        if (matchResult.getHomeTeam() != null) {
            Team team = matchResult.getHomeTeam();
            homeTeamName.setText(team.getName());
            homeTeamGoals.setText(Integer.toString(team.getGoals()));
        }
        if (matchResult.getAwayTeam() != null) {
            Team team = matchResult.getAwayTeam();
            awayTeamName.setText(team.getName());
            awayTeamGoals.setText(Integer.toString(team.getGoals()));
        }
    }

    public static MatchResult createDummyData() {
        Team teamA = new Team("Team A", 10);
        Team teamB = new Team("Team B", 9);
        String featureImage = "http://kenh14cdn.com/2016/tung-son-la-ai-2-1477556820136.jpg";
        MatchResult matchResult = new MatchResult(teamA, teamB, featureImage);
        return matchResult;
    }
    public static class Team {
        private String name;
        private Integer goals;

        public Team(String name, Integer goals) {
            this.name = name;
            this.goals = goals;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getGoals() {
            return goals;
        }

        public void setGoals(Integer goals) {
            this.goals = goals;
        }
    }

    public static class MatchResult {
        Team homeTeam;
        Team awayTeam;
        String featureImage;

        public MatchResult(Team homeTeam, Team awayTeam, String featureImage) {
            this.homeTeam = homeTeam;
            this.awayTeam = awayTeam;
            this.featureImage = featureImage;
        }

        public Team getHomeTeam() {
            return homeTeam;
        }

        public void setHomeTeam(Team homeTeam) {
            this.homeTeam = homeTeam;
        }

        public Team getAwayTeam() {
            return awayTeam;
        }

        public void setAwayTeam(Team awayTeam) {
            this.awayTeam = awayTeam;
        }

        public String getFeatureImage() {
            return featureImage;
        }

        public void setFeatureImage(String featureImage) {
            this.featureImage = featureImage;
        }
    }
}
