package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenHakkaNoodles : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenhakkanoodles)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.150 g Egg Noodles

            2.2 tbsp Sesame Oil

            3.2 tsp Garlic Minced

            4.1/2 cup Onion Cut into cubes

            5.3-4 Green Chillies Slit Into half

            6.1/4 cup White part of Spring Onion Sliced

            7.2 tbsp Celery Chopped

            8.1/4 cup Carrot Julienned

            9.1/4 cup Capsicum Cut into thin stripes

            10.2 Eggs Whisked

            11.1 cup Boiled Chicken Shredded

            12.1 tbsp Soy Sauce

            13.1 tsp Vinegar

            14.1 tsp Bira 91 Hot Sauce

            15.1 tsp Green Chilli sauce

            16.Salt to taste

            17.1/2 tsp Black pepper Powder

            18.2 tbsp Spring Onion Greens Chopped


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat sesame oil in a wok.


            2.Once the oil is hot, add garlic and fry for a few seconds.


            3.Add onion, green chillies, white part of spring onion and celery and fry for a minute.


            4.Add carrot, capsicum and cabbage and fry for another minute.


            5.Push the veggies on one side of the wok and add the eggs in the wok.


            6.Mix until they scramble.


            7.Now mix everything up.


            8.Add boiled chicken, soy sauce, vinegar, Bira 91 Hot Sauce, green chilli sauce and boiled noodles and toss nicely.


            9.Add salt to taste and black pepper powder and mix well.


            10.Garnish with spring onion greens.


            11.Serve hot.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}