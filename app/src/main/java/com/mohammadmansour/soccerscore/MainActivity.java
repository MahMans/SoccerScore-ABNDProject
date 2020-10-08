package com.mohammadmansour.soccerscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout mainLayout = (LinearLayout) findViewById(R.id.main_layout);
        final TextView team1score = (TextView) findViewById(R.id.team1score);
        final TextView team1fouls = (TextView) findViewById(R.id.team1fouls);
        final Button team1scoreAdd1 = (Button) findViewById(R.id.team1score_add1);
        final Button team1foulsAdd1 = (Button) findViewById(R.id.team1fouls_add1);

        final TextView team2score = (TextView) findViewById(R.id.team2score);
        final TextView team2fouls = (TextView) findViewById(R.id.team2fouls);
        final Button team2scoreAdd1 = (Button) findViewById(R.id.team2score_add1);
        final Button team2foulsAdd1 = (Button) findViewById(R.id.team2fouls_add1);
        final Button reset = (Button) findViewById(R.id.reset);

        team1scoreAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(team1score);
                mainLayout.setBackgroundColor(getColor(R.color.team1));
            }
        });
        team1foulsAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(team1fouls);
                mainLayout.setBackgroundColor(getColor(R.color.team1));
            }
        });
        team2scoreAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(team2score);
                mainLayout.setBackgroundColor(getColor(R.color.team2));
            }
        });
        team2foulsAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(team2fouls);
                mainLayout.setBackgroundColor(getColor(R.color.team2));
            }
        });

        // reset score & bg color
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team1score.setText("0");
                team1fouls.setText("0");
                team2score.setText("0");
                team2fouls.setText("0");
                mainLayout.setBackgroundColor(getColor(R.color.colorAccent));
            }
        });

    }
    private void addScore(TextView scoreTxt){
        /**
         * Increases the value of the given score/foul by one
         * @param scoreTxt is the TextView of the score/foul that we want to increase its value
         * */
        scoreTxt.setText(String.valueOf(Integer.valueOf((String) scoreTxt.getText())+1));
    }
}