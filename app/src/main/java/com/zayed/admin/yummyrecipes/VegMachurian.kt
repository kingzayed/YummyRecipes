package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class VegMachurian : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_vegmachurian)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            For vegetable balls:

            1.1/2 Cup Cabbage

            2.1/2 Cup Carrot

            3.1/2 Cup Capsicum

            4.1/2 Cup Spring onion

            5.1 tsp Ginger

            6.1 tsp Garlic

            7.3 Tbsp Corn flour

            8.2 Tbsp Maida

            9.2 tsp Salt

            10.2 tsp Black pepper

            11.1 tsp Soy sauce

            12.1 Tbsp Water

            For manchurian sauce:

            1.Oil

            2.2 Tbsp Garlic

            3.1 Tbsp Ginger

            4.1 tsp Green chilli

            5.2 Tbsp Spring onion

            6.2 Tbsp Tomato ketchup

            7.2 Tbsp Chilly sauce

            8.1 tsp Soya sauce

            9.1 tsp Vinegar

            10.1 1/2 Tbsp Salt

            11.1 Tbsp Black pepper

            12.3 Tbsp Corn flour

            13.1 Cup Water
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            To prepare the vegetable balls:


            1.Take all the veggies, finely chopped, in a bowl along with ginger, garlic, corn flour, maida, salt, black pepper and soy sauce.


            2.Mix them well, adding water as required for consistency.


            3.Make round balls out of the thick vegetable mixture.


            4.Now deep fry the vegetable balls in a pan.


            Prepare the sauce:


            1.Heat some oil in a pan and roast ginger, garlic and green chilli in it for a while


            2.Add spring onion, tomato ketchup, chilly sauce, soya sauce and vinegar followed by salt and black pepper.


            3.Mix them well and add a mixture of corn flour plus water to the pan.


            4.Mix thoroughly and put the fried vegetable balls into the mixture.


            5.Properly mix the balls along with the sauce.


            6.Garnish with spring onion and celery. Serve hot along with cooked rice.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}