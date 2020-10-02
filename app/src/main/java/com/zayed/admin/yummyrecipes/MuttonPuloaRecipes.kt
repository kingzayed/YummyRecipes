package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MuttonPuloaRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_muttonpuloa)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.350 gm mutton/lamb - chops-pricked

            2.2 cups rice - washed and soaked

            3.4 black cardamoms

            4.1 tsp peppercorns

            5.4 whole red chillies

            6.6 cloves

            7.1 inch piece cinnamon-broken roughly

            8.4 tbsp ghee

            9.1 cup onions - sliced uniformly

            10.1 tsp salt

            11.1 tsp kashmiri chilli powder

            12.1 tsp all spice - powdered

            13.2 cups hot water - for the rice

            14.Pinch of food colour
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat the ghee in a pan and add the cardamom, peppercorns, red chillies and cloves.


            2.When they darken a bit, add the onions and cook till transparent.


            3.Add the meat, salt and chilli powder, all spice.


            4.Stir fry till meat is opaque and add two cups of water.


            5.Bring to a boil and lower the heat and cook covered till meat is tender.


            6.Strain the meat and keep aside.


            7.Measure the liquid and make up to three cups by adding hot water.


            8.Mix liquid, meat and rice together.


            9.Bring to a boil, lower the heat and cook covered for five minutes.


            10.Sprinkle the colour in a trail and continue to cook covered for seven minutes. Serve hot.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}