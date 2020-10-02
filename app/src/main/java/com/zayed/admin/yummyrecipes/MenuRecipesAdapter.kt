package com.zayed.admin.yummyrecipes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class MenuRecipesAdapter(private val context: Context, private val MenuImages: IntArray, private val MenuNames: Array<String>) : BaseAdapter() {
    private val menuAdapter: MenuRecipesAdapter? = null
    private val MenuListview: ListView? = null
    override fun getCount(): Int {
        return MenuImages.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val mimageView: ImageView
        val textView: TextView
        view = convertView ?: LayoutInflater.from(context).inflate(R.layout.layout_menu, null)
        mimageView = view.findViewById<View>(R.id.imageview) as ImageView
        mimageView.setImageResource(MenuImages[position])
        textView = view.findViewById<View>(R.id.menunames) as TextView
        textView.text = MenuNames[position] + ""
        textView.textSize = 25f
        return view
    }
}