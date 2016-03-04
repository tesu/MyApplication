package com.example.jlam.myapplication;

import android.content.res.TypedArray;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by 2016jlam on 3/4/2016.
 */
public class MyTextView extends TextView {
    private int mValue;
    private boolean mPressed = false;

    public MyTextView(Context c, AttributeSet attrs) {
        super(c, attrs);
        setUpAttributes(attrs);

        setText(mValue + "");
    }

    public void incrementAndUpdate() {
        mValue++;
        setText(mValue + "");
    }

    private void setUpAttributes(AttributeSet attrs) {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.MyTextView, 0, 0);
        try {
            mValue = a.getInt(R.styleable.MyTextView_initialValue, 0);
        } finally {
            a.recycle();
        }
    }

}
