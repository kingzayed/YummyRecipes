package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Nutella : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_nutella)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2 cups heavy whipping cream
            2.2/3 cup chocolate milk
            3.3/4 cup Nutella or any chocolate hazelnut spread will work
            4.3/4 cup white granulated sugar
            5.1/2 teaspoon vanilla extract
            6.Pinch of salt
            7.1 to 1 1/2 cups Oreo cookies I used double stuffed, crumbled, between 10-13 Oreos
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.In a blender, I used my Blendtec blender puree Nutella, sugar, cream, salt, and vanilla until creamy and smooth. Set the blender in the fridge and chill the mixture in the refrigerator until chilled. Once chilled set in the freezer, set in the freezer for 45 minutes. Remove from freezer and blend for 15-20 seconds. Pour in a serving dish and place back in freezer for 45 minutes.
            2.Remove from the freezer and whisk, add Oreo cookies and gently mix in, then place back in freezer for another 45 minutes. Repeat process one to two more times, I did just one. Then leave in freezer until frozen.
            3.When you remove from the freezer, immediately serve. This ice cream will melt faster than your typical store-bought ice cream.


            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}