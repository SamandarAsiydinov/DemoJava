package com.example.demojava;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
    static final String TAG = MyApplication.class.getCanonicalName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "MyApplication onCreate");
    }
}
