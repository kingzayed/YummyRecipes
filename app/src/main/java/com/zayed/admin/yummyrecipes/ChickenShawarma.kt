package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenShawarma : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenshawarma)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.8 Boneless chicken thighs (skinless)

            For the marinade:

            1.1/2 Cup Malt vinegar

            2.1/4 Cup Plain yogurt

            3.1 Tbsp Vegetable oil

            4.To taste Salt and pepper

            5.1/4 tsp Freshly ground cardamom

            6.1 tsp All spice

            For the sauce:

            1.1/2 Cup Tahini

            2.1/4 Cup Plain yogurt

            3.1/2 tsp Garlic (minced)

            4.2 Tbsp Lemon juice

            5.1 Tbsp Olive oil

            6.1 Tbsp Fresh parsley, chopped

            7.To taste Salt and pepper

            For plating:

            1.4 Medium Tomatoes, sliced

            2.1/2 Cup Onion, sliced

            3.4 Cups Lettuce, shredded

            4.8 Pita bread rounds
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.In a glass baking dish, mix together the malt vinegar, 1/4 cup yogurt, vegetable oil, mixed spice, cardamom, salt and pepper.


            2.Place the chicken thighs into the mixture and turn to coat. Cover and marinate in the refrigerator for at least 4 hours or overnight.


            3.Preheat the oven to 350 degrees F (175 degrees C).


            4.In a small bowl, mix together the tahini, 1/4 cup yogurt, garlic, lemon juice, olive oil, and parsley.


            5.Season with salt and pepper, taste, and adjust flavors if desired. Cover and refrigerate.


            6.Cover the chicken and bake in the marinade for 30 minutes, turning once.


            7.Uncover, and cook for an additional 5 to 10 minutes, or until chicken is browned and cooked through.


            8.Remove from the dish, and cut into slices.


            9.Place sliced chicken, tomato, onion, and lettuce onto pita breads.


            10.Roll up, and top with tahini sauce.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}