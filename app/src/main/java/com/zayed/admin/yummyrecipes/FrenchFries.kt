package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class FrenchFries : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_frenchfries)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.250 Gram Potatoes (sliced), peeled

            2.1 Tbsp Salt

            3.For deep frying Oil


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Pour around 4 cups of water, enough to cover the potatoes, sprinkle with salt and boil.


            2.Slice the potatoes to a width of your choice. You can either opt for fat french fries or thin ones.


            3.When the water comes to boil, plonk the potatoes and switch off the gas. Now, leave the potatoes for 5 to 6 minutes.


            4.Drain the water and put the potatoes on a tissue or dry cloth. Let them dry or if you're in a hurry dab it with a tissue to dry off the water.


            5.Heat the oil till you can see small bubbles on the side. Now add the potatoes, one by one. Make sure the potatoes have enough space and aren't stacked on top of each other.


            6.Lower the heat to medium and fry till almost cooked but not brown.


            7.Lift the potatoes out of the oil and let the rest of it drain.


            8.Just before serving fry over high heat, till a golden brown and serve.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}