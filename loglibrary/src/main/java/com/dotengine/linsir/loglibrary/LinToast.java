package com.dotengine.linsir.loglibrary;

import android.content.Context;
import android.widget.Toast;

/**
 *  Created by linSir 
 *  date at 2017/5/3.
 *  describe: 一个封装好的toast的library，可以在项目中直接使用
 */

public class LinToast {

    private static LinToast linToast;
    private static Context mContext;
    private static Toast mToast;

    public static void init(Context context) {
        mContext = context.getApplicationContext();
        mToast = Toast.makeText(context,"",Toast.LENGTH_SHORT);
    }

    public static void showToast(String txt) {
        mToast.setText(txt);
        mToast.setDuration(Toast.LENGTH_SHORT);
        mToast.show();
    }

}
