package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.BreakfastGridView

class BreakfastGridView : Activity() {
    private var gridView: GridView? = null
    private val BreakfastMenuImages = intArrayOf(R.drawable.alooparatha, R.drawable.idli, R.drawable.sabudanakhichdi, R.drawable.pohaa, R.drawable.omlet, R.drawable.eggbhurji, R.drawable.dosa, R.drawable.misalpav)
    private val BreakfastMenuNames = arrayOf("Aloo Paratha", "Idli", "Sabudana Khichri", "Poha", "Omlette", "Egg Bhurji", "Masala Dosa", "Misal Pav")
    private var breakfastGridViewAdapter: BreakfastGridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_breakfast)
        gridView = findViewById<View>(R.id.breakfastgrid) as GridView
        breakfastGridViewAdapter = BreakfastGridViewAdapter(this, BreakfastMenuImages, BreakfastMenuNames)
        gridView!!.adapter = breakfastGridViewAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@BreakfastGridView, AlooParatha::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@BreakfastGridView, Idli::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@BreakfastGridView, SabudanaKhirchdi::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@BreakfastGridView, Poha::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@BreakfastGridView, Omlette::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@BreakfastGridView, FryEgg::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent6 = Intent(this@BreakfastGridView, MasalaDosa::class.java)
                    startActivity(intent6)
                }
                7 -> {
                    val intent7 = Intent(this@BreakfastGridView, MisalPav::class.java)
                    startActivity(intent7)
                }
            }
        }
    }
}