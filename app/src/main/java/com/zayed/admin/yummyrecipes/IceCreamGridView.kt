package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import com.zayed.admin.yummyrecipes.IceCreamGridView

class IceCreamGridView : Activity() {
    private var gridView: GridView? = null
    private val IceCreamMenuImages = intArrayOf(R.drawable.peach, R.drawable.nutella, R.drawable.stawberry, R.drawable.vanilla, R.drawable.mango, R.drawable.blueberry, R.drawable.buterscotch, R.drawable.kulfi)
    private val IceCreamMenuNames = arrayOf("Peaches", "Cream Nutella", "Stawberry", "Vanilla", "Mango", "Blueberry", "Butterscotch", "Kulfi")
    private var iceCreamGridViewAdapter: IceCreamGridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_icecream)
        gridView = findViewById<View>(R.id.icecreamgrid) as GridView
        iceCreamGridViewAdapter = IceCreamGridViewAdapter(IceCreamMenuImages, IceCreamMenuNames, this)
        gridView!!.adapter = iceCreamGridViewAdapter
        gridView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@IceCreamGridView, PeachIceCream::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@IceCreamGridView, Nutella::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@IceCreamGridView, Stawberry::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@IceCreamGridView, Vanilla::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@IceCreamGridView, Mango::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@IceCreamGridView, Blueberry::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent6 = Intent(this@IceCreamGridView, ButterScotch::class.java)
                    startActivity(intent6)
                }
                7 -> {
                    val intent7 = Intent(this@IceCreamGridView, Kulfi::class.java)
                    startActivity(intent7)
                }
            }
        }
    }
}