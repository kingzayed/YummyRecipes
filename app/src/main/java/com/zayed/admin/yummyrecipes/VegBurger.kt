package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class VegBurger : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_vegburger)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.120 gm french beans - strung, blanched and chopped fine

            2.120 gm cabbage - grated

            3.120 gm cauliflower - grated

            4.1/2 cup carrots - grated

            5.1 cup potatoes - boiled and mashed

            6.2 tsp coriander powder

            7.Salt - to taste

            8.1/4 tsp turmeric powder

            9.1/2 cup boiled peas

            10.2 eggs - slightly beaten

            11.1/4 cup maida

            12.Bread crumbs

            13.Oil
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat oil in a pan and add all the beans, carrots, cauliflower and cabbage to it. Stir over high heat.


            2.Add coriander powder, salt, turmeric powder and mix well.


            3.Turn off the heat. Keep aside to cool.


            4.When cool mix in the boiled potatoes and peas.


            5.Make thin rounds so as to match the bun.


            6.Dust with maida and dip into the beaten egg.


            7.Coat with bread crumbs.


            8.Heat oil and deep fry till they turn golden brown in colour.


            9.Slit the burger roll and place the patty in it along with mustard and mayonnaise. Serve.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}