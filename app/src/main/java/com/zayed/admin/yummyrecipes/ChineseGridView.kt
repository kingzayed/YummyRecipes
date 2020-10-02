package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.ChineseGridView

class ChineseGridView : Activity() {
    private val ChineseImages = intArrayOf(R.drawable.vegspringroll, R.drawable.machurian, R.drawable.creamsoup, R.drawable.chowmeinchicken, R.drawable.chickenhakkanoodles, R.drawable.chickenfriedrice)
    private val ChineseNames = arrayOf("Veg Spring Roll", "Veg Manchurian", "Chicken Soup", "Chow Mein Chicken", "Chicken Hakka Noodles", "Chicken Fried Rice")
    private var gridView: GridView? = null
    private var chineseGridViewAdapter: ChineseGridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chinese)
        gridView = findViewById<View>(R.id.chinesegrid) as GridView
        chineseGridViewAdapter = ChineseGridViewAdapter(this, ChineseImages, ChineseNames)
        gridView!!.adapter = chineseGridViewAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@ChineseGridView, VegSpringRoll::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@ChineseGridView, VegMachurian::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@ChineseGridView, CreamChickenSoup::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@ChineseGridView, ChowMeinChicken::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@ChineseGridView, ChickenHakkaNoodles::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@ChineseGridView, ChickenFriedRice::class.java)
                    startActivity(intent5)
                }
            }
        }
    }
}