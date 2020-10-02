package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class GrilledSalmon : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_grillsalmon)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.220 Gram Salmon

            2.1 Tbsp Honey

            3.To taste Salt and Pepper

            4.1 tsp Olive oil

            5.30 Ml Bourbon whiskey (for flambe)

            6.80 Gram Roasted vegetables

            7.1/2 tsp Celery salt

            8.50 Ml Buttermilk fluid

            9.20 Gram Vettiver
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            Prepare Buttermilk Fluid:


            1.Take 60 ml buttermilk, add a pinch of xantana and kappa.


            2.Then add a pinch of salt and pepper for seasoning. Blend together. Serve along with salmon.


            Prepare Salmon:


            1.Marinate the salmon with honey, salt and pepper.


            2.Keep it aside and arrange it on top of stones with roasted vegetables.


            3.Sprinkle celery salt on the salmon and cook it in front of the guest with blowtorch and flambé it with bourbon whiskey.


            4.Serve along with the buttermilk fluid or lemon butter sauce.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}