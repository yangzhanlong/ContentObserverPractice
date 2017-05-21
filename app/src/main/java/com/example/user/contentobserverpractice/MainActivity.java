package com.example.user.contentobserverpractice;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 注册内容观察者
        Uri dataUri = Uri.parse("content://com.android.contacts/data");
        getContentResolver().registerContentObserver(dataUri, true, new MyObserver(new Handler()));
    }

}
