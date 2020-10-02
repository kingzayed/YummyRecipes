package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Kulfi : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_kulfi)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.Full fat milk 1.25 lts
            2.Powdered Sugar 1/3 cup heaped
            3.Cardamom 4, powdered
            4.Pistachios 8, roughly chopped (optional)
            5.Saffron few strands, soaked in a tbsp of warm milk for 10 mts
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat milk in a wide bottomed pan and bring to a boil. Allow the milk simmer on medium flame till it reaches half its original quantity. Keep stirring in between.

            2.Add powdered sugar, cardamom powder and roughly chopped nuts. Mix well and keep simmering on medium flame, stirring till it further reduces to almost one-third of its original quantity. It will have a rabdi consistency and like a very thick milk.

            3.Turn off flame and allow to cool.

            4.Once cool, place the mixture in the fridge for 2 hours. (This helps reduce the formation of ice crystals during freezing process).

            5.Place the empty kulfi molds in the freezer to chill.

            6.Next, remove the mixture from the fridge and whisk it well and place the mixture in the freezer. After an hour, take it out and whisk it well or keep mixing with a whisk/ladle to agitate it. Again place it back in the freezer.

            7.Remove it after 2 hours and again repeat the whisking process. At this stage, pour the whisked mixture into chilled kulfi molds and close the lids.

            8.Place the kulfi molds in the deep freezer and allow to set overnight or at least 8 hours.

            9.Once the kulfi sets, place the kulfi mold in lukewarm water for a few secs to help it unmould easily.

            10.Insert kebab or ice cream stick in the kulfi and serve. You can garnish with more nuts.


            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}