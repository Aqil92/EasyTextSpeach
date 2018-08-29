package com.sevenrocks.easytexttospeach;

import android.app.Activity;
import android.os.Bundle;

import com.aqil.Sound;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Sound sound=new Sound(this.getApplication());
        sound.play("hi hi hi hi hi hi hi hih hello hello hello hello d");
    }
}
