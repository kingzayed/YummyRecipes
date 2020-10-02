package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Malpua : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_malpua)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            For Rabri:

            1.1 Litre Milk

            2.1 Cup Sugar

            3.1/2 tsp Saffron

            4.1 tsp Pistachios

            5.1 tsp Almonds

            6.1 tsp Cardamom powder

            For sugar syrup:

            1.2 Cups Sugar

            2.2 Cups Water

            3.1 Saffron

            4.1 tsp Cardamom powder

            5.2 tsp Almonds

            For Malpua:

            1.1 Cup Maida

            2.1/4 Cup Sooji

            3.1/2 Cup Khoya

            4.2 tsp Sugar ( powdered)

            5.1 tsp Saunf

            6.1 Cup Water

            7.2 Cups Ghee
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            To prepare Rabri:


            1.Boil milk in a bowl.


            2.Add a cup of sugar to it and mix well.


            3.Now add saffron, pistachios and almonds to the milk followed by cardamom powder and mix well. Mix thoroughly to make smooth batter.


            To prepare Sugar syrup:


            1.Put sugar in a bowl along with some water and bring it to boil.


            2.Add saffron, cardamom powder and almonds to the boiling water and mix well.


            3.To prepare Malpua:


            4.Take maida in a bowl, add sooji, khoya along with powdered sugar and saunf, followed by water. Whisk all of it together. Keep adding water to make a creamy-like mixture.


            5.Now, in a wok full of ghee put tablespoon full of the malpua mixture. Make as many malpuas as you can with the mixture.


            6.Immerse malpuas in the prepared sugar syrup for about 10-15 minutes.


            7.Put rabri on top of it and serve.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}