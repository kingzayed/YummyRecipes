package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class BadamKheer : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_badamkheer)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 tin (400g)-NESTLÉ MILKMAID Sweetened Condensed Milk

            2.1 litre-Milk

            3.50 g-Badam (Almonds)

            4.50 g-Kaju (Cashewnuts)

            5.1/4 tsp-Almond Essence


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Blanch almonds and remove skin. Soak almonds and cashewnuts in 2 cups of hot milk for 30 minutes. Grind to a paste along with milk.


            2.Heat the remaining milk to boil. Add NESTLÉ MILKMAID Sweetened Condensed Milk and the ground almond paste and cook for another 5 minutes with constant stirring.


            3.Remove from fire and add almond essence. Serve hot or cold.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}