package com.example.szorgalmi1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private SeekBar seekBar3;
    private TextView redText;
    private TextView greenText;
    private TextView blueText;
    private TextView finalout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                redText.setText("" + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    private void init(){
        seekBar1 = findViewById(R.id.seekbar1);
        seekBar2 = findViewById(R.id.seekbar2);
        seekBar3 = findViewById(R.id.seekbar3);
        redText = findViewById(R.id.redText);
        greenText = findViewById(R.id.greenText);
        blueText = findViewById(R.id.blueText);
        finalout = findViewById(R.id.finalOut);
    }
}