package com.example.user.contentobserverpractice;

import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;

// 定义一个内容观察者
public class MyObserver extends ContentObserver {
    /**
     * Creates a content observer.
     *
     * @param handler The handler to run {@link #onChange} on, or null if none.
     */
    public MyObserver(Handler handler) {
        super(handler);
    }

    @Override
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
        Log.v("Observer", "Contact database has changed");
    }
}
