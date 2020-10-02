package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenCrispyRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickencrispy)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.Boneless Chicken cut into very thin strips 400 grams

            2.Green chillies 4 teaspoons

            3.Oil for deep-frying

            4.Salt to taste

            5.Cornstarch 2 teaspoons

            6.Onion 1 medium

            7.Green chillies 4

            8.Green capsicum cut into strips 1 medium

            9.Red capsicum cut into strips 1 medium

            10.Green chilli sauce 1 teaspoon


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Take chicken strips in a bowl.


            2.Heat sufficient oil in a wok.


            3.Add refined flour, salt and cornstarch in the bowl and mix well.


            4.Deep-fry chicken strips in hot oil till golden and crisp.


            5.Cut onion into halves and slice.


            6.Take 4 tsps oil from the wok and add to another non-stick wok on heat.


            7.Slice green chillies lengthwise.


            8.Add onion to the oil and saute. Add green and red capsicum strips and saute well.


            9.Add fried chicken, sliced green chillies, green chilli sauce and salt. Mix well and cook for a minute.


            10.Serve hot
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}