package com.example.thachnguyenit.mvvmexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.thachnguyenit.mvvmexample.data.DummyData;
import com.example.thachnguyenit.mvvmexample.databinding.ActivityMainBinding;
import com.example.thachnguyenit.mvvmexample.models.MatchResult;

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
