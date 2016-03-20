package com.teamlimo.project_y.main_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.teamlimo.project_y.R;

public class MainActivity extends AppCompatActivity {

    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter();
    }

    public void onButtonClicked(View v){

        switch (v.getId()) {

            case R.id.playQuizButton:
                presenter.startQuiz();
                break;

            case R.id.viewHighscoreButton:
                presenter.viewHighscore();
                break;
        }
    }
}
