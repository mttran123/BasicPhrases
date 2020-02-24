package com.example.gohasu.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    MediaPlayer mediaPlayer0;
//    MediaPlayer mediaPlayer1;
//    MediaPlayer mediaPlayer2;
//    MediaPlayer mediaPlayer3;
//    MediaPlayer mediaPlayer4;
//    MediaPlayer mediaPlayer5;
//    MediaPlayer mediaPlayer6;
//    MediaPlayer mediaPlayer7;



    public void playPhrase(View view) {

        Button button = (Button) view;

        String x = button.getTag().toString();

        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(x, "raw", getPackageName()));

        mediaPlayer.start();




//        if (x.equals("doyouspeakenglish")) {
//            mediaPlayer0.start();
//        } else if(x.equals("goodevening")) {
//            mediaPlayer1.start();
//        } else if (x.equals("hello")) {
//            mediaPlayer2.start();
//        } else if (x.equals("howareyou")) {
//            mediaPlayer3.start();
//        } else if (x.equals("ilivein")) {
//            mediaPlayer4.start();
//        } else if (x.equals("mynameis")) {
//            mediaPlayer5.start();
//        } else if (x.equals("please")) {
//            mediaPlayer6.start();
//        } else if (x.equals("welcome")) {
//            mediaPlayer7.start();
//        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mediaPlayer0 = MediaPlayer.create(this,R.raw.doyouspeakenglish);
//        mediaPlayer1 = MediaPlayer.create(this,R.raw.goodevening);
//        mediaPlayer2 = MediaPlayer.create(this,R.raw.hello);
//        mediaPlayer3 = MediaPlayer.create(this,R.raw.howareyou);
//        mediaPlayer4 = MediaPlayer.create(this,R.raw.ilivein);
//        mediaPlayer5 = MediaPlayer.create(this,R.raw.mynameis);
//        mediaPlayer6 = MediaPlayer.create(this,R.raw.please);
//        mediaPlayer7 = MediaPlayer.create(this,R.raw.welcome);
    }
}
