package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class segundaP extends AppCompatActivity {

    ProgressBar progressBarBatterry;
    TextView textViewPorcentaje;
    BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_p);

        progressBarBatterry = findViewById(R.id.progressBarBaterry);
        textViewPorcentaje = findViewById(R.id.TextViewPorcentaje);
        broadcastReceiver = new BaterryBroadcast();
        registerReceiver(broadcastReceiver,
                new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }


    private class BaterryBroadcast extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent){
            int level = intent.getIntExtra(
                    BatteryManager.EXTRA_LEVEL,0);
            progressBarBatterry.setProgress(level);
            textViewPorcentaje.setText(level+"%");

        }




    }
}