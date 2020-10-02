package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class VegSpringRoll : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_vegspringroll)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            For the pancakes:

            1.1/2 cup flour

            2.1 egg

            3.1/4 tsp salt

            4.1/4 cup water

            5.1/4 cup milk

            6.3 Tbsp oil mix the water, oil and milk together

            For the filling:

            1.1 cup thinly shredded cabbage

            2.1 cups spring onions-including leaves, finely chopped

            3.1 cup thinly shredded carrot

            4.1/2 tsp salt

            5.2 Tbsp oil

            6.4 cloves garlic-very finely chopped

            7.1 tsp soya sauce

            8.2 Tbsp celery-chopped fine

            9.1 Tbsp flour, made into thin paste by adding water

            10.Oil for deep frying
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Make the pancakes with the pancake ingredients.


            2.Heat the 1 tbsp oil and stir-fry the garlic and onions over high heat till the onions are a little soft.


            3.Add the rest of the filling ingredients and turn around a few times, still over a high heat.


            4.Take a pancake and place a heaped tbsp of filling towards one edge.


            5.Fold that edge over the filling, then the two sides thus formed over the fold, and roll over till the end, sealing that edge with the flour paste.


            6.It is very important to seal the filling in, so that it does not spill out while frying. Double fry the pancakes.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}