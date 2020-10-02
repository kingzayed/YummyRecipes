package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.DesertsGridView

class DesertsGridView : Activity() {
    private val DesertsImages = intArrayOf(R.drawable.gulabjamun, R.drawable.rasmalai, R.drawable.rasgulla, R.drawable.pancakes, R.drawable.fruitsalad, R.drawable.donuts, R.drawable.chocalatelava, R.drawable.carrotshalwa, R.drawable.badamkheer, R.drawable.malpua)
    private val DesertsName = arrayOf("Gulab Jamun", "Rasmalai", "Rasgulla", "Pancakes", "Fruit Salad", "Donuts", "Choco Lava Cake", "Carrots Halwa", "Badam Kheer", "Malpua")
    private var gridView: GridView? = null
    private var desertsGridViewAdapter: DesertsGridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_deserts)
        gridView = findViewById<View>(R.id.desertgrid) as GridView
        desertsGridViewAdapter = DesertsGridViewAdapter(this, DesertsImages, DesertsName)
        gridView!!.adapter = desertsGridViewAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@DesertsGridView, GulabJamun::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@DesertsGridView, Rasmali::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@DesertsGridView, Rasgulla::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@DesertsGridView, Pancakes::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@DesertsGridView, FruitsSalads::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@DesertsGridView, Donuts::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent6 = Intent(this@DesertsGridView, ChocoLavaCakes::class.java)
                    startActivity(intent6)
                }
                7 -> {
                    val intent7 = Intent(this@DesertsGridView, CarrotsHalwa::class.java)
                    startActivity(intent7)
                }
                8 -> {
                    val intent8 = Intent(this@DesertsGridView, BadamKheer::class.java)
                    startActivity(intent8)
                }
                9 -> {
                    val intent9 = Intent(this@DesertsGridView, Malpua::class.java)
                    startActivity(intent9)
                }
            }
        }
    }
}