package com.zayed.admin.yummyrecipes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class VegGridViewAdapter(private val context: Context, private val VegImages: IntArray, private val VegNames: Array<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return VegImages.size
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
        view = convertView ?: LayoutInflater.from(context).inflate(R.layout.layout_veg, null)
        imageView = view.findViewById<View>(R.id.imageview) as ImageView
        imageView.setImageResource(VegImages[position])
        textView = view.findViewById<View>(R.id.vegtext) as TextView
        textView.text = VegNames[position] + ""
        textView.textSize = 20f
        return view
    }
}