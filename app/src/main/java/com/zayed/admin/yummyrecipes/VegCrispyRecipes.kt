package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class VegCrispyRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_vegcrispy)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.Babycorn cut into thick strips 10

            2.Green Capsicum cut into thick strips 1 large

            3.Cauliflower 5-6 florets

            4.Cabbage cut into thick strips 1/4 small

            5.Oil 2 tablespoons

            FOR BATTER

            1.Cornflour/ corn starch 5 tablespoons

            2.Refined flour (maida) 5 tablespoons

            3.Ginger-garlic paste 1/2 teaspoon

            4.MSG optional 1/4 teaspoon

            5.Lemon juice 1 teaspoon

            6.Salt to taste

            7.Black pepper powder to taste

            FOR SAUCE

            1.Garlic chopped 4-5 cloves

            2.Ginger chopped 1 inch piece

            3.Celery chopped 2-3 inch stalk

            4.Spring onions chopped 2

            5.Green chillies chopped 2

            6.Soy sauce 1 tablespoon

            7.Red chilli sauce 1 tablespoon

            8.Tomato ketchup 2 teaspoons

            9.Salt to taste

            10.Black pepper powder to taste
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Mix cornflour, refined flour, ginger-garlic paste, MSG, lemon juice, salt and black pepper powder in a bowl with enough water to make a thick batter. Add the vegetables and mix so that all the vegetables are well coated.


            2.Heat enough oil in a wok and deep fry the vegetables. Drain on absorbent paper and set aside. For the sauce heat two tablespoons of oil in a pan. Add garlic, ginger, celery, spring onions and green chillies and sauté for a minute.


            3.Add soy sauce, red chilli sauce, tomato ketchup, salt and black pepper powder and sauté for half a minute. Add all the fried vegetables and mix well. Serve hot.

            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}