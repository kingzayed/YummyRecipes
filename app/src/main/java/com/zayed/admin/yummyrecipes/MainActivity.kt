package com.zayed.admin.yummyrecipes

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.zayed.admin.yummyrecipes.MainActivity

class MainActivity : AppCompatActivity() {
    private var MenuListview: ListView? = null
    private var menuAdapter: MenuRecipesAdapter? = null
    private val MenuImages = intArrayOf(R.drawable.chickenimage, R.drawable.mutton, R.drawable.veg, R.drawable.fish, R.drawable.chinese, R.drawable.burger, R.drawable.sweetdish, R.drawable.breakfast, R.drawable.icecream)
    private val MenuNames = arrayOf("Chicken", "Mutton", "Vegeterians", "Seafood", "Chinese", "Quick Bites", "Deserts", "Breakfast", "Ice Cream")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MenuListview = findViewById<View>(R.id.list) as ListView
        menuAdapter = MenuRecipesAdapter(this, MenuImages, MenuNames)
        MenuListview!!.adapter = menuAdapter
        MenuListview!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@MainActivity, ChickenGridView::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent1 = Intent(this@MainActivity, MuttonGridView::class.java)
                    startActivity(intent1)
                }
                2 -> {
                    val intent2 = Intent(this@MainActivity, VegGridView::class.java)
                    startActivity(intent2)
                }
                3 -> {
                    val intent3 = Intent(this@MainActivity, FishGridView::class.java)
                    startActivity(intent3)
                }
                4 -> {
                    val intent4 = Intent(this@MainActivity, ChineseGridView::class.java)
                    startActivity(intent4)
                }
                5 -> {
                    val intent5 = Intent(this@MainActivity, JunkFoodGridView::class.java)
                    startActivity(intent5)
                }
                6 -> {
                    val intent7 = Intent(this@MainActivity, DesertsGridView::class.java)
                    startActivity(intent7)
                }
                7 -> {
                    val intent6 = Intent(this@MainActivity, BreakfastGridView::class.java)
                    startActivity(intent6)
                }
                8 -> {
                    val intent8 = Intent(this@MainActivity, IceCreamGridView::class.java)
                    startActivity(intent8)
                }
            }
        }
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes") { dialog, id -> //your_activity.finish();......(1)
                    //otherwise use your code..
                    val intent = Intent(Intent.ACTION_MAIN)
                    intent.addCategory(Intent.CATEGORY_HOME)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)
                }
                .setNegativeButton("No") { dialog, id -> dialog.cancel() }
        val alert = builder.create()
        alert.show()
    }
}