package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.JunkFoodGridView

class JunkFoodGridView : Activity() {
    private val JunkImages = intArrayOf(R.drawable.vegburger, R.drawable.chickenburger, R.drawable.chickenswarma, R.drawable.frenchfries, R.drawable.cheesepizza, R.drawable.bbqchickenpizza, R.drawable.jalapenopoppers, R.drawable.chickensandwich)
    private var gridView: GridView? = null
    private val JunkNames = arrayOf("Veg Burger", "Chicken Burger", "Chicken shawarma", "French Fries", "Cheese Mozzarella Pizza", "BBQ Chicken Pizza", "Veg Jalapeno Poppers", "Chicken Sandwich")
    private var junkFoodGridViewAdapter: JunkFoodGridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_junkfood)
        gridView = findViewById<View>(R.id.junkgrid) as GridView
        junkFoodGridViewAdapter = JunkFoodGridViewAdapter(this, JunkImages, JunkNames)
        gridView!!.adapter = junkFoodGridViewAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@JunkFoodGridView, VegBurger::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@JunkFoodGridView, ChickenBurger::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@JunkFoodGridView, ChickenShawarma::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@JunkFoodGridView, FrenchFries::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@JunkFoodGridView, CheesePizza::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@JunkFoodGridView, ChickenPizza::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent6 = Intent(this@JunkFoodGridView, VegJalapenoPoppers::class.java)
                    startActivity(intent6)
                }
                7 -> {
                    val intent7 = Intent(this@JunkFoodGridView, ChickenSandwiches::class.java)
                    startActivity(intent7)
                }
            }
        }
    }
}