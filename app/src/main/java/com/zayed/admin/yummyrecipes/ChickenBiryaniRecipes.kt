package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenBiryaniRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenbiryani)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.600 gm boiled basmati rice

            2.4 tablespoon minced mint leaves

            3.salt as required

            4.2 teaspoon coriander powder

            5.1 tablespoon garlic paste

            6.2 tablespoon tomato puree

            7.400 gm thinly sliced white onion

            8.8 green cardamom

            9.1 tablespoon milk

            10.1 kilograms chicken thighs

            11.1 teaspoon garam masala powder

            12.2 pinches saffron

            13.1 tablespoon ginger paste

            14.4 sliced and slit green chilli

            15.320 gm chopped tomato

            16.2 teaspoon cumin seeds

            17.6 tablespoon refined oil


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.First, in order to marinate the chicken, take a large bowl, put Greek yogurt, turmeric, chili powder along with salt as per your taste in a small bowl.
 Mix it well using a spoon and then, add the chicken thighs in the mixture and rub with this mixture.
 Keep aside for about 20-30 minutes, so that the yogurt mixture is properly absorbed by the chicken.
 Also, soak saffron in the milk to make saffron milk and keep aside.


2.In the meanwhile, pour refined oil in a deep-bottomed pan, keeping it on medium flame. Add cumin seeds and green cardamom in it and saute for about 2 minutes. Once done, immediately add the sliced onion and fry for 2-3 minutes straight. Make sure you don't burn it, so when the onion starts to get brown in color, add tomatoes and tomato puree and fry for another 5 minutes.


3.Next, add the slit green chilies to the mixture along with ginger-garlic paste, frying the mixture yet again for a minute.
 Then, add coriander powder and turn the flame to medium-low while stirring and cooking the masala.
 Quickly, add the marinated chicken and mix for a while so that the ingredients absorb the juices properly.


4.Turn the flame to medium again and heat-through for about 5-6 minutes only to turn it over to low heat.
Cover with a lid and let simmer for 5 minutes.
Make sure to keep stirring during the entire process, else the chicken might stick to the bottom, eventually ending up burnt.
 You can add little water, if you find the consistency too thick.


5.Once done, turn off the flame and add half of the boiled rice in the pan and keep the rest aside until required.
Sprinkle milk soaked saffron along with garam masala, mint and coriander leaves.
Put the remaining rice over this layer and garnish with the same mentioned four ingredients.


6.Lastly, cover the lid, turn the flame to low medium and let the rice cook for about 5 minutes.
Once done, put it off and let the biryani stay covered for about another 10 minutes.
Serve hot, along with raita or any chutney of your choice."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}