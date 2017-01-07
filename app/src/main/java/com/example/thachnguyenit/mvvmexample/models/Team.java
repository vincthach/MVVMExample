package com.example.thachnguyenit.mvvmexample.models;

/**
 * Created by thachnguyenit on 1/7/17.
 */
public class Team {
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
