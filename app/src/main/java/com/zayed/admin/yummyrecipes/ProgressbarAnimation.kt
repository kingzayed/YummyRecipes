package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressbarAnimation extends Animation {

    private Context context;
    private ProgressBar progressBar;
    private TextView textView;
    private float from;
    private float to;

    public ProgressbarAnimation(Context context,ProgressBar progressBar,TextView textView,float from,float to)
    {
        this.context = context;
        this.progressBar = progressBar;
        this.textView = textView;
        this.from = from;
        this.to = to;
    }


    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        int value = (int) (from + (to - from) * interpolatedTime);
        progressBar.setProgress((int)value);
        textView.setText(value+"%");

        if (value == to)
        {
            context.startActivity(new Intent(context,MainActivity.class));
        }
    }

}
