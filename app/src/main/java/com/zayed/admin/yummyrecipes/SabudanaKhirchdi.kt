package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class SabudanaKhirchdi : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_sabudana)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 Cup Sabudana

            2.1 Cup Peanuts

            3.1/4 tsp Black Salt

            4.2 tsp Ghee

            5.1 tsp Cumin Seeds

            6.1 1/2 Potatoes (Boiled)

            7.1/2 tsp Salt

            8.1 tsp Green Chillies, chopped

            9.1/2 tsp Black Salt

            10.1/2 tsp Black Pepper

            11.1 Tbsp Coriander Leaves
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Soak sabudana in a bowl for 2 hours.


            2.After 2 hours, drain the water, squeeze and refrigerate for an hour.


            3.Take soaked sabudana in another bowl and add crushed peanuts and black salt to it.


            4.Mix well.


            5.Now take ghee in a pan, add cumin seeds and saute a little.


            6.Add black pepper and Sabudana-peanut mix to the pan, sprinkle some black pepper again on top.


            7.Mix well and serve with garnishing of coriander leaves.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}