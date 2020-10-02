package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenSixtyFive : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickensixfive)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.250 grams chicken boneless and tender

            2.1 egg white (optional, refer notes) or whole egg for half kg chicken

            3.2 tbsp Corn flour

            4.1 tbsp rice flour or cornflour

            5.oil for deep frying

            marination:

            1.½ tbsp ginger garlic paste

            2.½ tsp red chili powder

            3.1 ½ tbsp curd (don’t use sour curd)

            4.½ tsp pepper powder

            5.1/8 tsp turmeric

            6.Salt to taste (about 1/8 tsp)

            Seasoning for chicken 65 recipe:

            1.½ tsp cumin or jeera

            2.1 sprig Curry leaves

            3.½ tsp garlic chopped

            4.2 green chilies sliced

            5.½ tsp pepper powder

            Seasoning mixture to coat the chicken:

            1.¾ tsp red chili powder

            2.½ tsp sugar (removes pungent taste from garlic)

            3.2 cloves garlic paste

            4.¼ tsp Salt - use as per your taste

            5.2 tbsp curd thick (or 1 tsp vinegar with 2 tbsp. water)


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat oil in a deep pan until hot enough.


            2.Fry the chicken until cooked fully and golden. Stir while frying for even frying. Drain them on a kitchen tissue.


            3.Heat a pan with 1 tbsp. oil.


            4.Add curry leaves, green chilies and cumin.  Fry till the leaves turn crisp. You can set aside few for garnish.


            5.Next pour the chili garlic seasoning mixture we prepared above. Let it begin to bubble.


            6.Add the fried chicken and toss.


            7.Fry on medium heat till it absorbs all the moisture and the raw smell of garlic disappears. Over frying can make the it hard. So turn off in time.


            8.Serve chicken 65 with onion wedges.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}