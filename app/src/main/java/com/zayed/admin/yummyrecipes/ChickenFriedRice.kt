package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenFriedRice : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenfriedrice)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1/2 Kg Long Grained Rice, boiled

            2.4-5 Tbsp Cooking Oil

            3.150 Gram Boneless Chicken (diced)

            4.100 Gram Prawns (deshelled)

            5.2 Small Onions , finely chopped

            6.4 Pieces Garlic, finely chopped

            7.4 Red Chillies (grounded)

            8.4-5 Tbsp Sweet Soya Sauce

            9.To taste Salt

            10.To taste Pepper

            11.For garnishing Fried eggs


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Boil rice and keep aside.


            2.Heat oil in a pan and saute the onion and garlic until golden brown.


            3.Add chicken and cook.


            4.Sprinkle in salt and pepper.


            5.When the chicken is almost done add the red chillies and then toss in the prawns.


            6.Stir fry for a few minutes.


            7.Add the sweet soya sauce and mix in the cooked rice.


            8.In another pan, make a double fried egg.


            9.Serve rice hot with a fried egg on top.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}