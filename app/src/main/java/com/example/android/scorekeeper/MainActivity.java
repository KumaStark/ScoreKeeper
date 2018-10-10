package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.scorekeeper.R.id.team_a_plus_1;
import static com.example.android.scorekeeper.R.id.team_a_plus_2;
import static com.example.android.scorekeeper.R.id.team_a_plus_3;
import static com.example.android.scorekeeper.R.id.team_b_plus_1;
import static com.example.android.scorekeeper.R.id.team_b_plus_2;
import static com.example.android.scorekeeper.R.id.team_b_plus_3;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    //int teamAShotThree = 0;
    //int teamAShotTwo = 0;
    //int teamAShotOne = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamAPlus(View view) {
        switch (view.getId()) {
            case team_a_plus_3:
                displayForTeamA(scoreTeamA += 3);
                break;
            case team_a_plus_2:
                displayForTeamA(scoreTeamA += 2);
                break;
            case team_a_plus_1:
                displayForTeamA(scoreTeamA += 1);
                break;
        }
    }

    public void teamBPlus(View view) {
        switch (view.getId()) {
            case team_b_plus_3:
                displayForTeamB(scoreTeamB += 3);
                break;
            case team_b_plus_2:
                displayForTeamB(scoreTeamB += 2);
                break;
            case team_b_plus_1:
                displayForTeamB(scoreTeamB += 1);
                break;
        }
    }

    public void resetScore(View view) {
        displayForTeamA(scoreTeamA *= 0);
        displayForTeamB(scoreTeamB *= 0);
    }
}
