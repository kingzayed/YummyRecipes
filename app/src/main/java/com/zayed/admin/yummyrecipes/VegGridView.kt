package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.VegGridView

class VegGridView : Activity() {
    private var gridView: GridView? = null
    private val VegImages = intArrayOf(R.drawable.alootikkia, R.drawable.vegcrispy, R.drawable.vegcutleta, R.drawable.pavbhajia, R.drawable.palakpannera, R.drawable.matarpannera, R.drawable.malaikoftaa, R.drawable.daltadka, R.drawable.chanamasala, R.drawable.beancurry)
    private val VegNames = arrayOf("Aloo Tikki", "Veg Crispy", "Veg Cutlet", "Pav Bhaji", "Palak Panner", "Matar Panner", "Malai Kofta", "Dal Tadka", "Chana Masala", "Bean Curry")
    private var vegGridViewAdapter: VegGridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_veg)
        gridView = findViewById<View>(R.id.veggrid) as GridView
        vegGridViewAdapter = VegGridViewAdapter(this, VegImages, VegNames)
        gridView!!.adapter = vegGridViewAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@VegGridView, AlooTikkiRecipes::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@VegGridView, VegCrispyRecipes::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@VegGridView, VegCutlet::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@VegGridView, PavBhajiRecipes::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@VegGridView, PalakPanner::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@VegGridView, MatarPanner::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent6 = Intent(this@VegGridView, MalaiKofta::class.java)
                    startActivity(intent6)
                }
                7 -> {
                    val intent7 = Intent(this@VegGridView, DalTadka::class.java)
                    startActivity(intent7)
                }
                8 -> {
                    val intent8 = Intent(this@VegGridView, ChanaMasala::class.java)
                    startActivity(intent8)
                }
                9 -> {
                    val intent9 = Intent(this@VegGridView, BeanCurry::class.java)
                    startActivity(intent9)
                }
            }
        }
    }
}