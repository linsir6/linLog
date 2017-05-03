package com.dotengine.linsir.linlogandtoast;

import android.app.Application;

import com.dotengine.linsir.loglibrary.BuildConfig;
import com.dotengine.linsir.loglibrary.LinToast;

/**
 *  Created by linSir 
 *  date at 2017/5/3.
 *  describe:      
 */

public class App extends Application {

    public static final boolean DEBUG = BuildConfig.DEBUG;

    @Override public void onCreate() {
        super.onCreate();
        LinToast.init(getApplicationContext());
    }
}
