package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class CarrotsHalwa : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_carrotshalwa)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 kg carrots, grated

            2.1 liter almond milk

            3.8 green cardamom pods,

            4.Date paste, to taste

            5.1-2 Tbsp cashew nut paste, optional

            6.7-8 raisins

            7.Blanched almonds, for garnishing

            For the almond milk:

            1.1 cup almonds

            2.1 litre warm-hot water


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            For the almond milk:


            1.Place almonds to soak in water. You can pre-soak the almonds for four hours in cold water or use hot water.


            2.Peel the soaked almonds if you like.


            3.Place the almonds and water into a blender.


            4.Sieve through a fine mesh cloth and squeeze out all the milk.


            For the date paste:


            1.Soak as many dates as you would like in water.


            2.Put them in a container with a lid and let them sit in the refrigerator for a few hours. Drain off and reserve the soaking liquid.


            3.Place dates and a little of the soaking liquid in a blender or food processor and blend until smooth and consistent, adding soaking water if necessary.


            4.Date paste will last in your refrigerator for weeks, and can be used as a replacement for sweetener in a recipe.


            For the halwa:


            1.In a stainless steel heavy bottom pan add grated carrots.


            2.Pour the almond milk into the carrots, add cardamom pods and cook until all liquid has reduced. This will take about 30 - 40 minutes.


            3.Add date paste. Stir occasionally.


            4.Add cashew nut paste if using.


            5.Add raisins, top with almonds.


            6.Serve warm or cold.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}