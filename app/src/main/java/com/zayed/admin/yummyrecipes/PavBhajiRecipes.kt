package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class PavBhajiRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_pavbhaji)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 tsp Oil

            2.4 cubes Large Butter, finely chopped

            3.1 Cup Onion, chopped

            4.1 tsp Ginger-Garlic paste

            5.1/2 Cup Lauki, chopped

            6.1/2 Cup Capsicum, chopped

            7.1 Cup Potatoes, chopped

            8.1/2 Cup Beetroot, chopped

            9.2 tsp Salt

            10.1 tsp Chili powder

            11.3 tsp Pav Bhaji Masala

            12.1 tsp Red chili powder

            13.1/2 Cup Tomato puree

            14.1 cube To taste Butter

            15.1 Bunch Coriander leaves

            For Pav:

            Butter

            Pav Bhaji masala


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat oil in a pan. Add cubes of butter along with onionPav Bhaji


            2.Saute till golden brown and then add ginger garlic paste. Mix well.Pav Bhaji


            3.Now add chopped lauki along with coriander and mix well, followed by a cup of chopped potatoes. Mix and mash well together.Pav Bhaji


            4.Add chopped beetroot, salt, chilli powder and pav bhaji masala to the mashed mixture. Mix well.Pav Bhaji


            5.Now add the tomato puree.Pav Bhaji


            6.Mix the tomato puree thoroughly and then add butter followed by coriander leaves to the cooked bhaaji. Mix thoroughly.Pav Bhaji


            Prepare Pav:


            1.Spread some butter all over the pav.Pav Bhaji


            2.Sprinkle pav bhaji masala over it.Pav Bhaji


            3.Toast it on the pan for a while till it becomes golden brown.Pav Bhaji


            4.Serve hot along with a lemon wedge, chopped onion and green chilli.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}