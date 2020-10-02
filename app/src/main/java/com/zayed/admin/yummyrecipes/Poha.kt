package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Poha : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_poha)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 Cup Poha/chivda (pressed rice)

            2.1 Tbsp Oil

            3.1/8 tsp Asafoetida

            4.1 tsp Mustard seeds

            5.1/2 Cup Onions, finely chopped

            6.8-10 Curry leaves

            7.2-3 Whole red chillies

            8.1/2 Cup Potatoes (diced small)

            9.1/2 tsp Turmeric

            10.2 tsp Salt

            11.1 tsp Green chillies, finely chopped

            12.1 Tbsp Lemon juice

            13.1 Tbsp Coriander leaves, chopped

            14.For garnish Lemon wedges
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.Put poha in a colander and wash, not letting it soak too long in the water.
 Leave in the colander to drain out completely.


2.Heat the oil and add the asafoetida, mustard seeds, curry leaves and onions
 along with whole red chillies.


3.When onions are light brown, add potatoes, and turn around till they look a bit glossy.


4.Add the turmeric and sauté over low heat till the potatoes are cooked through.


5.Increase the heat, add salt and poha and mix well. Saute till mixed and heated through.


6.Shut off the heat, and mix in the green chillies, lemon juice and half of the coriander.


7.Transfer on to a serving dish, garnish with the rest of the coriander and lemon wedges and serve."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}