package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    int scoreteamA =0;
    int scoreteamB =0;
    public void addthreeforteamA(View View){
        scoreteamA=scoreteamA+3;
        displayForTeamA(scoreteamA);
    }

    public void addtwoforteamA(View View)
    {
        scoreteamA+=2;
        displayForTeamA(scoreteamA);
    }

    public void addoneforteamA(View View)
    {
        scoreteamA+=1;
        displayForTeamA(scoreteamA);
    }
    public void addthreeforteamB(View View)
    {
        scoreteamB=scoreteamB+3;
        displayForTeamB(scoreteamB);
    }
    public void addtwoforteamB(View View)
    {
        scoreteamB+=2;
        displayForTeamB(scoreteamB);
    }
    public void addoneforteamB(View View)
    {
        scoreteamB+=1;
        displayForTeamB(scoreteamB);
    }

    public void resetscore(View View)
    {
        scoreteamA=0;
        scoreteamB=0;
        displayForTeamA(scoreteamA);
        displayForTeamB(scoreteamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
