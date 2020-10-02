package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class VegCutlet : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_vegcutlet)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.120 gm french beans - strung and blanched

            2.120 gm bottle gourd - peeled and grated

            3.120 gm cauliflower - grated

            4.1/2 cup carrots-grated

            5.1 cup potatoes-boiled and mashed

            6.1 tsp cumin seeds

            7.2 tsp ginger-chopped fine

            8.2 tsp coriander powder

            9.2 tsp amchoor

            10.1 1/2 tsp salt

            11.2 tsp green chillies-chopped fine

            12.2 eggs-slightly beaten

            13.1/2 cup refined flour

            14.Dried bread crumbs to coat the cutlets

            15.1 Tbsp oil
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Chop the beans fine.


            2.Heat 2 Tbsp of oil and add cumin and ginger.


            3.Stir-fry till well mixed and add the beans, gourd, cauliflower and carrots and stir over high heat to dry off the excess moisture.


            4.Add the coriander, amchoor, salt and chillies, turn around a few times and shut off the heat.


            5.When cool mix in the potato.


            6.Form into round or oval cutlets.


            7.Dust the cutlets with refined flour, then dip into the beaten egg.


            8.Now coat with the crumbs.


            9.Repeat by dipping the crumbed cutlets into egg and crumbs once more.


            10.Deep-fry the cutlets to a golden color and serve.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}