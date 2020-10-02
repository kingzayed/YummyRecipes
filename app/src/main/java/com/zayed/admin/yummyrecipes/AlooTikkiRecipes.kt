package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class AlooTikkiRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_alootikki)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2-3 large potatoes-boiled, peeled, grated

            2.1/2 cup singhare ka atta

            3.1 tsp rock salt

            4.1/4 tsp powdered black pepper

            5.1 tsp green chillies-finely chopped

            6.1 Tbsp green coriander-finely chopped

            7.Ghee for pan frying


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Mix all the ingredients except the ghee till smooth. Knead into a pliable dough.


            2.Shape into tikkies.


            3.Heat a thin layer of ghee in a heavy-based pan.


            4.Fry tikkies over medium flame, till crisp and brown on both sides.


            5.Add a little ghee if required.


            6.Serve hot, accompanied with coriander chutney.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}