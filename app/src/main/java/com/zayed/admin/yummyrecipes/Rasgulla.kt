package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Rasgulla : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_rasgulla)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2 Litre Low fat milk (Refrigerated overnight, boiled

            2.1/4 Cup Lemon juice (mixed in 1/4 cup water)

            3.1 tsp Refined flour (maida) or semolina

            4.4 Cups Thin sugar syrup (flavored with cardamom or rosewater)
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Remove whatever cream that forms over the milk.


            2.Bring to a boil, lower heat and add the lemon mixture gradually, till milk curdles.


            3.Does not matter if you do not use up the whole solution.


            4.Shut off the heat and leave mixture to rest for 5 minutes.


            5.Drain off water and leave the paneer in a colander for at least 4 hours.


            6.Mash paneer very smooth (no grains).


            7.Add the flour/semolina and mash some more.


            8.Bring 4-6 cups of water to a boil, and shape the paneer into balls (smooth ones, no cracks) in the mean time.


            9.Transfer balls into the boiling water, cover with a tight fitting cover and let cook till puffed up (about 20 minutes).


            10.Let cool, squeeze out of the water, transfer to syrup, chill and serve.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}