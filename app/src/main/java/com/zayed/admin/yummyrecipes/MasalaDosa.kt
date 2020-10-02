package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MasalaDosa : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_dosa)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2 Cups Rice (preferably parboiled)

            2.1/2 Cup Black Gram (Dhuli Urad)(split and husked)

            3.1/2 tsp Fenugreek seeds

            4.2 tsp Salt

            5.For cooking dosas Oil

            For the Masala for Dosas:

            1.500 Gram Potatoes (peeled and cubed), boiled

            2.1 1/2 Cups Onions, sliced

            3.2 Green chillies (optional), finely chopped

            4.2 Tbsp Oil

            5.1 tsp Mustard seeds

            6.6-7 Curry leaves

            7.2 tsp Salt

            8.1/4 tsp Turmeric, powdered

            9.1/2 Cup Water
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.Wash and soak the rice in one container and the dal and
 fenugreek seeds together in another container
 for 5-6 hours or over night, depending on the weather.


2.Grind dal mixture together to a very smooth consistency.
 Next grind the rice smooth too and mix the two batters.


3.Add salt and enough water to make into a dropping consistency.
 Leave to ferment over-night or more depending on the weather,
 till a little spongy.


4.If thickened too much, add a little water to thin a bit.
 Heat tawa, and brush oil over it. When really hot, splash a little water over it,
 and immediately pour batter onto it, spreading it thin,
 with a circular motion.


5.This will have to be very swift and will need a bit of practice.


6.After spreading the batter, lower the heat and dribble a little oil
 around the edges so that it seeps under the dosa.


7.When edges start browning a bit, pass a flat spoon under it to ease the dosa off the pan.
 Put desired filling in the center, and fold the two edges over.


8.Serve accompanied with sambhar and chutney.


Prepare the masala filling:


1.Heat the oil in a heavy based pan and add the mustard seeds, then onions,
 curry leaves and green chillies,
 and saute over high heat till the onions
 are a little transparent.


2.Add the salt and the turmeric and mix well, before adding the potatoes.


3.Turn the potatoes around till well mixed,
 and add the water, and let it simmer, for 2-3 minutes."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}