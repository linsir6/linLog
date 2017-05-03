package com.dotengine.linsir.loglibrary;

import android.util.Log;


/**
 *  Created by linSir 
 *  date at 2017/5/3.
 *  describe: 一个专门用来展示log的工具类
 */

public class LinLog {

    private static boolean Debug = true;
    private static String Tag = "null";

    public static void init(boolean debug, String tag) {
        LinLog.Debug = debug;
        LinLog.Tag = tag;
    }

    public static void loge(String text){
        if (!Debug){
            return;
        }



    }


    public static void lLog(String text){
        String dividingLine = "╔================================================================\n";
        String dividingLine2 = "╚================================================================\n";


        Log.e(Tag,dividingLine);
        setUpContent(text);
        Log.e(Tag,dividingLine2);




    }

    public static void setUpContent(String content) {
        StackTraceElement targetStackTraceElement = getStackTraceElement();
        Log.e(Tag, "║ 出现log的位置-> (" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.e(Tag, "║ log的内容-> "+content);
    }

    private static StackTraceElement getStackTraceElement(){
        StackTraceElement targetStackTrace = null;
        boolean shouldTrace = false;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            boolean isLogMethod = stackTraceElement.getClassName().equals(LinLog.class.getName());
            if (shouldTrace && !isLogMethod) {
                targetStackTrace = stackTraceElement;
                break;
            }
            shouldTrace = isLogMethod;
        }
        return targetStackTrace;


    }


}
