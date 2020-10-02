package com.zayed.admin.yummyrecipes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class FishGridViewAdapter(private val context: Context, private val FishImages: IntArray, private val FishNames: Array<String>) : BaseAdapter() {
    private val gridView: GridView? = null
    override fun getCount(): Int {
        return FishImages.size
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
        view = convertView ?: LayoutInflater.from(context).inflate(R.layout.layout_fish, null)
        imageView = view.findViewById<View>(R.id.imageview) as ImageView
        imageView.setImageResource(FishImages[position])
        textView = view.findViewById<View>(R.id.textfish) as TextView
        textView.text = FishNames[position] + ""
        textView.textSize = 20f
        return view
    }
}