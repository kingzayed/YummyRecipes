package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.MuttonGridView

class MuttonGridView : Activity() {
    private val MuttonGridImage = intArrayOf(R.drawable.muttoncutleta, R.drawable.muttonseekh, R.drawable.muttonkarahi, R.drawable.muttonkeema, R.drawable.muttonkorma, R.drawable.roganjosh, R.drawable.muttonbiryania, R.drawable.muttonpuloa)
    private val MuttonGridNames = arrayOf("Cutlet Kebab", "Seekh Kebab", "Mutton Karahi", "Mutton Keema", "Mutton Korma", "Rogan Josh", "Mutton Biryani", "Mutton Pulao")
    private var gridView: GridView? = null
    private var muttonGridAdapter: MuttonGridAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_mutton)
        gridView = findViewById<View>(R.id.muttongrid) as GridView
        muttonGridAdapter = MuttonGridAdapter(this, MuttonGridImage, MuttonGridNames)
        gridView!!.adapter = muttonGridAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@MuttonGridView, CutletKebab::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@MuttonGridView, SeekhKebabrecipes::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@MuttonGridView, MuttonkarahiRecipes::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@MuttonGridView, MuttonKeemaRecipes::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@MuttonGridView, MuttonKorma::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@MuttonGridView, RoganJoshRecipes::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent6 = Intent(this@MuttonGridView, MuttonBiryani::class.java)
                    startActivity(intent6)
                }
                7 -> {
                    val intent7 = Intent(this@MuttonGridView, MuttonPuloaRecipes::class.java)
                    startActivity(intent7)
                }
            }
        }
    }
}