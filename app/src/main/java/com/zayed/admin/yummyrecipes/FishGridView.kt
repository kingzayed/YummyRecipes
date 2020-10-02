package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.FishGridView

class FishGridView : Activity() {
    private var gridView: GridView? = null
    private val FishImages = intArrayOf(R.drawable.salmonfry, R.drawable.surmaicurry, R.drawable.skilletsalmon, R.drawable.prawncurry, R.drawable.malabharfish, R.drawable.lobstertail, R.drawable.grilledsalmon, R.drawable.bajafishtacos)
    private val FishNames = arrayOf("Salmon Fry", "Surmai Curry", "Skillets Salmon", "Prawn Curry", "Malabhar Fish", "Lobster Tails", "Grilled Salmon", "Baja Tacos")
    private var fishGridViewAdapter: FishGridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_fish)
        gridView = findViewById<View>(R.id.fishgrid) as GridView
        fishGridViewAdapter = FishGridViewAdapter(this, FishImages, FishNames)
        gridView!!.adapter = fishGridViewAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@FishGridView, SalmonFryRecipes::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@FishGridView, SurmaiCurryRecipes::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@FishGridView, SkilletSalmon::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@FishGridView, PrawnCurry::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@FishGridView, MalabharFish::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@FishGridView, LobsterTails::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent6 = Intent(this@FishGridView, GrilledSalmon::class.java)
                    startActivity(intent6)
                }
                7 -> {
                    val intent7 = Intent(this@FishGridView, BajaTacos::class.java)
                    startActivity(intent7)
                }
            }
        }
    }
}