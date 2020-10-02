package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Omlette : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_omlet)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1/2 onion chopped

            2.1 tomato chopped

            3.2 green chilies chopped

            4.3 Tbsp olive oil

            5.3 eggs

            6.Salt and pepper to flavor

            7.2 Tbsp butter

            8.Handful fresh coriander leaves

            9.Handful spring onions chopped

            10.Handful grated cheese

            11.Burger bun
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat olive oil in a pan and add onion, tomato and green chilies.


            2.Let the vegetables sweat lightly then turn down the heat and let the vegetables cook.


            3.Then break 3 eggs and whisk them nicely.


            4.Add salt and pepper to flavor.


            5.Mix the eggs and the vegetable and saute them.


            6.Then heat the pan with butter and pour the mixture in the pan.


            7.Sprinkle fresh coriander leaves, spring onions and grated cheese on the mixture and let it fry.


            8.Make two folds of the omelette.


            9.Turn off the heat and add butter under the omelet.


            10.Serve with a toasted bun and garnish with fresh coriander.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}