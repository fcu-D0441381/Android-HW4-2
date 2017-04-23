package com.example.user_pc.reciver;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User_pc on 2017/4/23.
 */

public class ActivityNotification extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String name = intent.getStringExtra("KEY_MSG");
        TextView tv = new TextView(ActivityNotification.this);
        tv.setText("Greeting!!"+name);
        tv.setTextSize(30);
        setContentView(tv);

    }
}
