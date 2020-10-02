package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.ChickenGridView

class ChickenGridView : Activity() {
    private var gridView: GridView? = null
    private val ChickenMenuImages = intArrayOf(R.drawable.chickenlollipopa, R.drawable.chickencrsipya, R.drawable.chickensixfivea, R.drawable.chickentikka, R.drawable.tandoorichicken, R.drawable.butterchickena, R.drawable.chickenhandi, R.drawable.chickenkofta, R.drawable.chickenkormaa, R.drawable.chickenbiryania)
    private val ChickenMenuNames = arrayOf("Chicken Lollipop", "Chicken Crispy", "Chicken 65", "Chicken Tikka", "Chicken Tandoori", "Butter Chicken", "Chicken Handi", "Chicken Kofta", "Chicken Korma", "Chicken Biryani")
    private var chickenGridAdapter: ChickenGridAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chicken)
        gridView = findViewById<View>(R.id.chickengrid) as GridView
        chickenGridAdapter = ChickenGridAdapter(this, ChickenMenuImages, ChickenMenuNames)
        gridView!!.adapter = chickenGridAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@ChickenGridView, ChickenlollipopRecipes::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@ChickenGridView, ChickenCrispyRecipes::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@ChickenGridView, ChickenSixtyFive::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@ChickenGridView, ChickenTikkaRecipes::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@ChickenGridView, ChickenTandooriRecipes::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@ChickenGridView, ButterChickenRecipes::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent6 = Intent(this@ChickenGridView, ChickenHandiRecipes::class.java)
                    startActivity(intent6)
                }
                7 -> {
                    val intent7 = Intent(this@ChickenGridView, ChickenKoftaRecipes::class.java)
                    startActivity(intent7)
                }
                8 -> {
                    val intent8 = Intent(this@ChickenGridView, ChickenKormaRecipes::class.java)
                    startActivity(intent8)
                }
                9 -> {
                    val intent9 = Intent(this@ChickenGridView, ChickenBiryaniRecipes::class.java)
                    startActivity(intent9)
                }
            }
        }
    }
}