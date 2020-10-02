package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MalabharFish : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_malabharfish)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.40 Gram Whole coriander seeds

            2.60 Gram Whole red chilli

            3.10 Ml Coconut oil

            4.1 Gram Mustard seeds

            5.10 Gram Onion, chopped

            6.3-4 Nos Curry leaf

            7.20 Ml Coconut milk

            8.5 Ml Tamarind pulp

            9.5 Gram Coriander, chopped

            10.120 Gram Seabass fish curry cuts
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Soak whole coriander seeds and whole begdi chilli together for 3 to 4 hrs at least.

            2.Boil soaked ingredients, after boiling make a paste, and strain it.

            3.Take a pan, add coconut oil, mustard seeds, curry leaves and chopped onions, cook it till translucent.

            4.Put the strained paste, cook it well and add fish curry cuts in the gravy.

            5.Finish with coconut milk and tamarind pulp.

            6.Garnish with chopped coriander and fried curry leaves.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}