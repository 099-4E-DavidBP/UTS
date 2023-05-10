package com.example.uts;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;

    //method onclick untuk setiap imageButton
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.meow1){
            playSound(R.raw.s1);
            showSnackBar("Anda Menekan Button Meow 1");
        }else if (v.getId() == R.id.meow2){
            playSound(R.raw.s2);
            showSnackBar("Anda Menekan Button Meow 2");
        }else if (v.getId() == R.id.meow3) {
            playSound(R.raw.s3);
            showSnackBar("Anda Menekan Button Meow 3");
        }else if (v.getId() == R.id.meow4){
            playSound(R.raw.s4);
            showSnackBar("Anda Menekan Button Meow 4");
        }else if (v.getId() == R.id.meow5){
            playSound(R.raw.s5);
            showSnackBar("Anda Menekan Button Meow 5");
        }else if (v.getId() == R.id.meow6){
            playSound(R.raw.s6);
            showSnackBar("Anda Menekan Button Meow 6");
        }else if (v.getId() == R.id.meow7){
            playSound(R.raw.s7);
            showSnackBar("Anda Menekan Button Meow 7");
        }else if (v.getId() == R.id.meow8){
            playSound(R.raw.s8);
            showSnackBar("Anda Menekan Button Meow 8");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Deklarasi & inisiasi local variable
        ImageButton meow1 = findViewById(R.id.meow1);
        ImageButton meow2 = findViewById(R.id.meow2);
        ImageButton meow3 = findViewById(R.id.meow3);
        ImageButton meow4 = findViewById(R.id.meow4);
        ImageButton meow5 = findViewById(R.id.meow5);
        ImageButton meow6 = findViewById(R.id.meow6);
        ImageButton meow7 = findViewById(R.id.meow7);
        ImageButton meow8 = findViewById(R.id.meow8);

//      Menjalankan Method OnClick untuk setiap imageButton
        meow1.setOnClickListener(this);
        meow2.setOnClickListener(this);
        meow3.setOnClickListener(this);
        meow4.setOnClickListener(this);
        meow5.setOnClickListener(this);
        meow6.setOnClickListener(this);
        meow7.setOnClickListener(this);
        meow8.setOnClickListener(this);

    }
//      Method untuk memutar file audio
        private void playSound(int soundID) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mediaPlayer = MediaPlayer.create(this,soundID);
            mediaPlayer.start();
    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


    //  Method untuk menampilkan snackbar
    private void showSnackBar(String message){
        View rootView = findViewById(android.R.id.content);
        Snackbar.make(rootView,message,Snackbar.LENGTH_SHORT).show();
    }

}
