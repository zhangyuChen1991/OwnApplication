package com.sz.china.testmoudule.util;

import android.util.Log;

/**
 * Log日志 设置开关openLog
 * Created by zhangyu on 2016-07-01 19:14.
 */
public class MLog {
    public static boolean openLog = true;
    static final String defaultTag = "DefaultTag";

    public static void v(String TAG, String message) {
        if (openLog)
            Log.v(TAG, message);
    }

    public static void d(String TAG, String message) {
        if (openLog)
            Log.d(TAG, message);
    }

    public static void i(String TAG, String message) {
        if (openLog)
            Log.i(TAG, message);
    }

    public static void w(String TAG, String message) {
        if (openLog)
            Log.w(TAG, message);
    }

    public static void e(String TAG, String message) {
        if (openLog)
            Log.e(TAG, message);
    }

    public static void detaultTag(String message){
        i(defaultTag,message);
    }
}
