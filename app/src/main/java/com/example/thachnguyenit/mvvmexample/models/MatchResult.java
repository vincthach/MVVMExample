package com.example.thachnguyenit.mvvmexample.models;

/**
 * Created by thachnguyenit on 1/7/17.
 */
public class MatchResult {
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
