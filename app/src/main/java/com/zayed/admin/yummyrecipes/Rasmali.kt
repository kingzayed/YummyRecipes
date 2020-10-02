package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Rasmali : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_rasmali)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.250 Gram Paneer (cottage cheese)

            2.3 Tbsp Semolina (sooji)

            3.2 Tbsp Refined flour (maida)

            4.1 Tbsp Cornflour

            5.2 1/2 Cups Sugar

            6.2 Litre Milk

            7.300 Gram Khoya

            8.1/2 tsp Saffron

            9.2 Tbsp Reetha powder (with water)

            10.1 tsp Fresh mint

            11.2 tsp Pistachios (crushed)

            12.1 tsp Almonds (crushed)

            13.1 tsp Pine nuts (crushed)

            14.3 Pieces Gold vark
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Take fresh paneer, flours, sugar and all ingredients in a bowl and mash well.


            2.Make small balls out of the mixture.


            3.Make a sugar syrup with 1 1/2 cup water and 1/2 cup sugar. Add these small balls to the sugar syrup. Cook for 10 minutes.


            4.To make rabdhi, take 2 ltr milk. Reduce it to 1 1/2 ltr. Then add khoya, 2 cups sugar, saffron and reetha powder. Cook on low flame for 10-15 minutes.


            5.Cool down to room temperature.


            6.Then add the small balls to this rabdhi, and put in refrigerator to chill.


            7.Sprinkle mint and crushed nuts on rabdhi. Put golden vark on top.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}