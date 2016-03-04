package com.example.jlam.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//    static TextView meme = null;
    SharedPreferences p = null;
    SharedPreferences.Editor e = null;
    int create = 0, start = 0, resume = 0, stop = 0, restart = 0, destroy = 0;
    private void nice(String xd) {
        if (p == null) {
            p = getPreferences(Context.MODE_PRIVATE);
            e = p.edit();
        }

        switch (xd) {
            case "create":
                create++;
                e.putInt("create", p.getInt("create", 0)+1);
                break;
            case "start":
                start++;
                e.putInt("start", p.getInt("start", 0)+1);
                break;
            case "resume":
                resume++;;
                e.putInt("resume", p.getInt("resume", 0)+1);
                break;
            case "stop":
                stop++;;
                e.putInt("stop", p.getInt("stop", 0)+1);
                break;
            case "restart":
                restart++;;
                e.putInt("restart", p.getInt("restart", 0)+1);
                break;
            case "destroy":
                destroy++;;
                e.putInt("destroy", p.getInt("destroy", 0)+1);
                break;
        }
        e.commit();

//        meme.setText("onCreate: " + create + "\nonStart: " + start + "\nonResume: " + resume + "\nonStop: " + stop + "\nonRestart: " + restart + "\nonDestroy: " + destroy);
//        meme.setText("onCreate: " + p.getInt("create",0) + "\nonStart: " + p.getInt("start",0) + "\nonResume: " + p.getInt("resume",0) + "\nonStop: " + p.getInt("stop",0) + "\nonRestart: " + p.getInt("restart",0) + "\nonDestroy: " + p.getInt("destroy",0));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.layout);

        MyTextView[] t = { (MyTextView) findViewById(R.id.meme1), (MyTextView) findViewById(R.id.meme2), (MyTextView) findViewById(R.id.meme3), (MyTextView) findViewById(R.id.meme4)};
        for (int i = 0; i < t.length; i++) {
            final MyTextView tView = t[i];
            t[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    tView.incrementAndUpdate();
                }
            });
        }

//        meme = (TextView) findViewById(R.id.meme2);
//        nice("create");

//        meme.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                meme.setText(nice());
//            }
//        });
//        Button b = (Button) findViewById(R.id.meme);
//
//        b.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "u pressed the button", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        Integer[] memes = {0, R.id.xd1, R.id.xd2, R.id.xd3, R.id.xd4};
//        for (int i = 1; i <= 4; i++) {
//            final int me = i;
//            findViewById(memes[i]).setOnClickListener(new View.OnClickListener() {
//                int xd = 0;
//                public void onClick(View v) {
//                    Toast.makeText(MainActivity.this, "u have pressed button #" + me + " a total of " + (++xd) + " times", Toast.LENGTH_SHORT).show();
//                    Log.i("onCreate", "xd" + me + " has been pressed for the " + xd + "th time");
//                }
//            });
//        }
    }

//    @Override
//    protected void onStart() {
//        nice("start");
//        super.onStart();
//    }
//
//    @Override
//    protected void onResume() {
//        nice("resume");
//        super.onResume();
//    }
//
//    @Override
//    protected void onStop() {
//        nice("stop");
//        super.onStop();
//    }
//
//    @Override
//    protected void onRestart() {
//        nice("restart");
//        super.onRestart();
//    }
//
//    @Override
//    protected void onDestroy() {
//        nice("destroy");
//        super.onDestroy();
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
