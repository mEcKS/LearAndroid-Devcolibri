package com.company.mexus.androidlog;

import android.nfc.Tag;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInfoLog(View v){
        //Log.i(TAG, "Info level");

    }

    public void onWarnLog(View v) {

    }

    public void onErrorLog(View v) {

    }

    public void onDebugLog(View v) {

    }

}
