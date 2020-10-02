package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenBurger : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenburger)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.250 Gram Minced Chicken

            For frying Oil

            1.2 Onions, chopped

            2.2 Tbsp Coriander, chopped

            3.1 tsp Garlic, chopped

            4.3 Tbsp Salt

            5.3 tsp Chilli flakes

            6.3 tsp Black pepper

            7.1 Egg

            8.3 Tbsp Bread crumbs

            9.2 Tbsp Mayonnaise

            10.4 Burger Buns

            11.2 Lettuce
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Pour some oil in a pan.


            2.Put freshly chopped onions in it and fry until golden brown.


            3.Take another bowl and add minced chicken to it.


            4.Along with it add coriander, salt, chilli flakes, black pepper, garlic and fried onions.


            5.Crack an egg into the bowl and mix it all well together with your hands.


            6.Add bread crumbs to the mixture.


            7.Make round patties of the mixture using your hand and pan fry it until golden brown.


            8.Take the buns and add butter/mayonnaise, lettuce and onion or any other filling of your choice.


            9.Put the fried patties between the buns. Serve hot.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}