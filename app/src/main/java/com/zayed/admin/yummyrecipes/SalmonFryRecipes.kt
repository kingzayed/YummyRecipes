package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class SalmonFryRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_salmonfry)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.Salmon Fish -1 lb


            2.Red chili powder - 1&1/2 tsp


            3.Coriander powder - 2 tsp


            4.Turmeric powder - 1/4 tsp


            5.Ginger garlic paste - 1 tbsp


            6.Lemon - 1


            7.Curry leaves - 1 tsp(finely minced)


            8.Salt - to salt


            9.Oil - for shallow frying(i have used about 2 tbsp)
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.First clean the salmon well and cut into desired size. Now in a plate,add the spices (turmeric,chili & coriander powder),salt & ginger garlic paste.Mix it well.


            2.Then add the curry leaves and squeeze the lemon juice into the spices and mix it well.


            3.Apply the masala evenly on all the fish pieces ,cover it and let it rest for 2 hrs.Then heat the oil in a kadai for deep frying.


            4.Place the fish on the kadai and cook it on medium flame for 3-4 mins on each sides.Remove it on the plate.


            5.That's it, Tasty and flavorful fish fry is ready.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}