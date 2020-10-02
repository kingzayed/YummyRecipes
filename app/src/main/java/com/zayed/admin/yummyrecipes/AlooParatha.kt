package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class AlooParatha : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_paratha)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """1.2 cups kootoo ka atta

2.1 large potato, boiled, peeled and mashed smooth

3.1 tsp senda namak (rock salt)

4.Ghee for frying the paranthas

5.Dry flour for dusting

For the filling:

1.Mashed potatoes, with senda namak (rock salt) and chilli powder mixed into it
, along with lemon juice, hara dhania (coriander leaves)
 and green chillies if desired.

"""
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Knead dough as for parantha. Make flat rounds and pinch the edges to about 1/3 way towards the centre, to form a sort of a cup.


            2.Take some filling, and place in the centre of the 'cup'. Wet the edges and bring together to enclose the filling. Pinch to seal.


            3.Roll out as thinly as you can without tearing.


            4.Fry the paranthas crisp and darker on both sides.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}