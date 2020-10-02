package com.zayed.admin.yummyrecipes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class IceCreamGridViewAdapter(private val IceCreamMenuImages: IntArray, private val IceCreamMenuNames: Array<String>, private val context: Context) : BaseAdapter() {
    private val gridView: GridView? = null
    override fun getCount(): Int {
        return IceCreamMenuImages.size
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
        view = convertView ?: LayoutInflater.from(context).inflate(R.layout.layout_icecream, null)
        imageView = view.findViewById<View>(R.id.imageview) as ImageView
        imageView.setImageResource(IceCreamMenuImages[position])
        textView = view.findViewById<View>(R.id.icecreamname) as TextView
        textView.text = IceCreamMenuNames[position] + ""
        textView.textSize = 20f
        return view
    }
}