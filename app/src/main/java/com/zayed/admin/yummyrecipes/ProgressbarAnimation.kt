package com.zayed.admin.yummyrecipes

import android.content.Context
import android.content.Intent
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.ProgressBar
import android.widget.TextView

class ProgressbarAnimation(private val context: Context, private val progressBar: ProgressBar, private val textView: TextView, private val from: Float, private val to: Float) : Animation() {
    override fun applyTransformation(interpolatedTime: Float, t: Transformation) {
        super.applyTransformation(interpolatedTime, t)
        val value = (from + (to - from) * interpolatedTime).toInt()
        progressBar.progress = value
        textView.text = "$value%"
        if (value.toFloat() == to) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }
}