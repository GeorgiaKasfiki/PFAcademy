package com.codehub.pfacademy;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public abstract class AbstrctActivity extends AppCompatActivity{

    abstract void initial();

    abstract void running();

    abstract void stopped();

    abstract void destroy();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        running();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    //Running

    @Override
    protected void onPause() {
        super.onPause();
        stopped();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy();
    }


}


