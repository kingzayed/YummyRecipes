package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class FryEgg : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_fryegg)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.4 Eggs

            2.2 Onions, finely chopped

            3.2 Tomatoes, chopped

            4.3 Green chilies or as per taste

            5.1 Capsicum, chopped

            6.2 inch Ginger, finely chopped

            7.1/2 Cup Coriander leaves

            8.3-4 Curry leaves

            9.2 Tbsp Vegetable oil or ghee

            10.1 tsp Jeera

            11.1 tsp Red chilli powder

            12.1 tsp Turmeric powder

            13.As per taste Pav bhaji masala

            14.A pinch of Asafoetida (hing)

            15.As per taste Salt

            16.2 Tbsp Butter (optional)
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.In a large bowl, whisk the eggs using a spoon and keep aside.


2.Take a pan, add oil or ghee and heat. Now add jeera,
 onions, hing, green chillies, curry leaves, capsicum and ginger.
 Saute for 3-4 minutes..


3.Add tomatoes and few coriander leaves. Saute for 2 minutes.


4.Add 1 Tbsp butter, pav bhaji masala, red chilli powder,
 turmeric powder and salt as per taste. Mix well.


5.Lastly, pour in the slightly beaten eggs and keep whisking until cooked.


6.Top it up with butter. Garnish with the remaining coriander leaves.


7.Serve hot with buttered pav."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}