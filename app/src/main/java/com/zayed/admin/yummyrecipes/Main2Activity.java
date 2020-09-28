package com.zayed.admin.yummyrecipes;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    ProgressBar progressBar;

    private static int SPLASH_TIME_OUT = 1300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_screen);
        progressBar =(ProgressBar)findViewById(R.id.progress_bar);
        progressBar.setMax(200);
        progressBar.setScaleY(3f);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        }, SPLASH_TIME_OUT);


    }

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//

//        textView = (TextView)findViewById(R.id.textscreen);
//



//

//    public void progressAnimation() {
//        ProgressbarAnimation animation = new ProgressbarAnimation(this, progressBar, textView, 0, 99);
//        animation.setDuration(12000);
//        progressBar.setAnimation(animation);
//    }
}


