package com.dotengine.linsir.linlogandtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dotengine.linsir.loglibrary.LinLog;
import com.dotengine.linsir.loglibrary.LinToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinToast.showToast("今天很开心");
        LinLog.init(true,"lin");
        LinLog.lLog("今天很开心");
        LinLog.lLog("123123123");


    }
}
