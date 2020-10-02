package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class VegJalapenoPoppers : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_jalpanenopoppers)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.100gms - Cream cheese softened

            2.100gms - shredded cheddar cheese

            3.5 Jalapeno peppers, seeded and halved

            4.100ml - Milk

            5.50gms - all-purpose flour

            6.50gms - bread crumbs

            7.200ml - oil for frying
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.In a medium bowl, mix the cream cheese, Cheddar cheese.


            2.Stuff mixture into the jalapeno pepper halves.


            3.Dip the stuffed jalapenos first into the milk then into the flour.


            4.Dry for about 10 minutes.


            5.Dip the jalapenos in milk again and then the breadcrumbs.


            6.Allow them to dry, ensure the entire surface is coated.


            7.Deep fry the coated jalapenos 5 minutes each, until golden brown.


            8.Remove and let drain on a paper towel.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}