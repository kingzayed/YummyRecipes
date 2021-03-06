package com.zayed.admin.yummyrecipes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class JunkFoodGridViewAdapter(private val context: Context, private val JunkImages: IntArray, private val JunkNames: Array<String>) : BaseAdapter() {
    private val gridView: GridView? = null
    override fun getCount(): Int {
        return JunkImages.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val imageView: ImageView
        val textView: TextView
        view = convertView ?: LayoutInflater.from(context).inflate(R.layout.layout_junkfood, null)
        imageView = view.findViewById<View>(R.id.imageview) as ImageView
        imageView.setImageResource(JunkImages[position])
        textView = view.findViewById<View>(R.id.textjunk) as TextView
        textView.text = JunkNames[position] + ""
        textView.textSize = 20f
        return view
    }
}