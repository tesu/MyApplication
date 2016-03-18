package com.example.jlam.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        TextView t = (TextView) findViewById(R.id.t1);
        t.setText("YOU CHOSE \"" + i.getStringExtra("string") + "\"");

        Button b = (Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void finish() {
        Intent d = new Intent();
        EditText e = (EditText) findViewById(R.id.e1);
        Log.d("ASDF", "finish() called");
        Log.d("ASDF", e.getText().toString());
        d.putExtra("result", e.getText().toString());
        setResult(1, d);
        super.finish();
    }
}
