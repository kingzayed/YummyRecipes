package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class PeachIceCream : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_peachesicecream)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.4 cups ripe peaches, peeled, pitted, and cut into 1/2-inch pieces (about 6 medium peaches)
            2.1/2 teaspoon lemon juice
            3.1/2 cup granulated sugar
            4.2 cups heavy cream
            5.1 (14 ounce) can sweetened condensed milk
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.Stir the peaches, lemon juice, and sugar in a medium-sized bowl to combine.
 Set aside until a syrup accumulates in the bowl, about 1 hour.
 Add the peaches and syrup to a blender and pulse until almost pureed, just enough to break down the large pieces.
 Transfer puree to a medium saucepan. Heat over medium-high heat until reduced and thickened, about 5 minutes; stir occasionally.
 Transfer to a bowl and refrigerate until cold, about 2 hours.
2.Add the heavy cream to a large bowl. Using an electric mixer beat until stiff peaks form. Turn the speed to low and slowly pour in the condensed milk. Turn the speed back up to high and beat until thickened.
3.Transfer 2 cups of the whipped cream to a separate bowl. Add in the puree and mix until well combined. Fold into the remaining whipped cream. Transfer to a freezer-safe container and freeze for at least 6 hours.
"""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}