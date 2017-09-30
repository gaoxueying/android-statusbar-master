package com.statusbar.activity;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.statusbar.util.AppStatusBar;
import com.statusbar.util.SystemBarTintManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        AppStatusBar.buildStatusBar(this,Color.parseColor("#FA7298"));
        setContentView(R.layout.activity_main);
    }

}
