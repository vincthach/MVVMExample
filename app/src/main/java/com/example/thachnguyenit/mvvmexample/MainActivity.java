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
        binding.setResult(matchResult);
    }
}
