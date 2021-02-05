package com.Elick.plgm;

import android.app.*;
import android.os.*;
import java.util.Date;
import java.util.Calendar;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;
import android.util.Log;
import android.icu.text.SimpleDateFormat;
import java.util.Locale;

public class MainActivity extends Activity 
{
    long timecurrentTimeMillis = System.currentTimeMillis();
    long timeGetTime = new Date().getTime();
    long timeSeconds = System.currentTimeMillis();
    long timeMillis = Calendar.getInstance().getTimeInMillis();
    private TextView textview;

    SimpleDateFormat realTime = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        }
}
