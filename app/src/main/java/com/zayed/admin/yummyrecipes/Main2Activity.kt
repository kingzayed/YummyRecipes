package com.zayed.admin.yummyrecipes

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.zayed.admin.yummyrecipes.Main2Activity

class Main2Activity : AppCompatActivity() {
    var progressBar: ProgressBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_screen)
        progressBar = findViewById<View>(R.id.progress_bar) as ProgressBar
        progressBar!!.max = 200
        progressBar!!.scaleY = 3f
        Handler().postDelayed({
            val intent = Intent(this@Main2Activity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    } //        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    //
    //        textView = (TextView)findViewById(R.id.textscreen);
    //
    //
    //    public void progressAnimation() {
    //        ProgressbarAnimation animation = new ProgressbarAnimation(this, progressBar, textView, 0, 99);
    //        animation.setDuration(12000);
    //        progressBar.setAnimation(animation);
    //    }
    companion object {
        private const val SPLASH_TIME_OUT = 1300
    }
}