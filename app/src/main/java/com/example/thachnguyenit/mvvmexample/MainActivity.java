package com.example.thachnguyenit.mvvmexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.thachnguyenit.mvvmexample.databinding.ActivityMainBinding;
import com.example.thachnguyenit.mvvmexample.models.MatchResult;
import com.example.thachnguyenit.mvvmexample.models.Team;
import com.example.thachnguyenit.mvvmexample.data.DummyData;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MatchResult matchResult = DummyData.createDummyData();
        fillData(matchResult);
    }

    private void fillData(MatchResult matchResult) {
        if (matchResult.getFeatureImage() != null) {
            Glide.with(this).load(matchResult.getFeatureImage()).into(binding.featureImage);
        }
        if (matchResult.getHomeTeam() != null) {
            Team team = matchResult.getHomeTeam();
            binding.homeTeamName.setText(team.getName());
            binding.homeTeamGoals.setText(Integer.toString(team.getGoals()));
        }
        if (matchResult.getAwayTeam() != null) {
            Team team = matchResult.getAwayTeam();
            binding.awayTeamName.setText(team.getName());
            binding.homeTeamGoals.setText(Integer.toString(team.getGoals()));
        }
    }



}
