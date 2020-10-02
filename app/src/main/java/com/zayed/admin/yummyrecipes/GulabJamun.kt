package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class GulabJamun : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_gulabjamun)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            For Sugar Syrup:

            1.2 Cups Sugar

            2.5 Cups Water

            3.1 tsp Milk

            4.1/4 tsp Cardamom Seeds

            5.1/2 tsp Saffron

            6.1/2 tsp Cardamom Powder

            For Gulab Jamun Balls:

            1.1 1/2 Cups Khoya, grated

            2.1/2 tsp Baking Soda

            3.1/2 Cup Maida

            4.1 tsp Milk
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Take required quantity of sugar and water in a deep pan. Stir and bring to boil on high flame for sugar to dissolve.


            2.Now add milk and cardamom seeds to the sugar water. Boil further and strain.


            3.Then add saffron and cardamom powder and bring the mixture to rolling boil for about 5-6 minutes until it becomes little sticky.


            Prepare Gulab Jamun Balls:


            1.Take the grated Khoya in a medium size deep bowl.


            2.Add baking soda and maida. Combine them thoroughly but gently using a spoon.


            3.Add a teaspoon of milk to it and knead all of them together to make a smooth and soft dough. Add another teaspoon of milk if required.


            4.Make sure that the dough is a bit softer to avoid cracking of ball while deep frying.


            5.Divide the dough into equal parts and make smooth surfaced balls out of it.


            6.Now heat ghee in a pan over medium flame and add the Jamun balls to deep-fry them. Cook evenly until it becomes golden brown.


            7.Make sure that you do not cook on high flame otherwise the balls will burn.


            8.Now drain and let them cool for few minutes.


            9.Then immerse the gulab jamuns in the warm sugar syrup for at least 30 minutes. It increases in size when it soaks the sugar syrup.


            10.Hot and tasty sweet dish is ready to serve.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}