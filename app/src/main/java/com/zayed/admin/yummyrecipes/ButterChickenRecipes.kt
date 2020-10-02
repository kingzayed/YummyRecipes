package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ButterChickenRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_butterchicken)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            700 Gram Raw chicken

            For the Marinade:

            1.1 tsp Red chilli powder

            2.1 tsp Ginger and garlic paste

            3.To taste Salt

            4.1/2 Kg Curd

            For the Gravy:

            1.175 Gram White butter

            2.1/2 tsp Black cumin seeds

            3.1/2 Kg Tomato, pureed

            4.1/2 tsp Sugar

            5.1 tsp Red chilli powder

            To taste Salt

            1.100 Gram Fresh cream

            2.4 Green chillies, sliced

            3.1/2 tsp Fenugreek leaves (crushed)


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.In a mixing bowl, mix red chilli powder, ginger garlic paste, salt and curd.


2.Add the raw chicken pieces to the marinade and mix well. Keep it in the refrigerator overnight or minimum 6 hours.


3.Roast the marinated chicken in a tandoor or an oven for about 10-12 minutes until it is three-fourth done.


Prepare the chicken gravy:


1.Heat half the quantity of white butter in pan.


2.Pour in the tomato puree, and saute for 2-3 minutes.
 Add cumin seeds, sugar, red chilli powder and salt.
 Mix well.


3.Add the prepared chicken, white butter, fresh cream, sliced green chillies and crushed fenugreek leaves.
 Saute for 3-4 minutes and let the chicken cook.


4.Cook till chicken is done. Serve hot with rice or naan."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}