package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Mango : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_mango)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2 large mangoes , ripe and juicy - to make 2 cups puree
            2.395 g / 14 oz sweetened condensed milk
            3.2 cups thickened cream / heavy cream / whipping cream , cold
            4.1/8 tsp yellow liquid food colouring
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.Dice the flesh of the mango.
Puree using a blender, food processor or stick blender then measure out 2 cups of mango puree
2.Pour puree into a non stick skillet over medium low heat.
 Cook, stirring constantly, for 8 - 10 minutes or until it reduces by half.
 The test is when you can drag a wooden spoon across the skillet and the path remains there for a second
. Or measure out the puree to ensure it's reduced to at least 1 cup - less is even better!
3.Cool puree."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}