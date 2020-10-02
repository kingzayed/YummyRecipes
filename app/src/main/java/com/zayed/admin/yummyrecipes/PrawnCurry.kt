package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class PrawnCurry : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_prawncurry)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.700 gms prawns

            2.250 gms curd

            3.5 gms yellow chilli powder

            4.200 gms onions

            5.30 gms ginger garlic paste

            6.50 gms oil

            7.5 gms red chilli powder

            8.2 gms fenugreek seeds

            9.5 gms fenugreek leaves

            10.5 gms turmeric powder

            11.5 gms garam masala powder

            12.Coriander, chopped

            13.Ginger juliennes to garnish

            14.Desi ghee

            15.Salt to taste
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Clean and wash the prawns, set aside.


            2.Heat oil in a pan, add fenugreek seeds followed by ginger-garlic paste. Saute it all for a while, at least till the aroma goes away.


            3.Add chopped onions, fry till they turn translucent.


            4.Now, add the red chilli, turmeric powder, fenugreek leaves and garam masala. Saute for a few minutes.


            5.Once the masalas have blended well, add prawns.


            6.Add whisked yogurt and stir continuously to avoid curdling.


            7.Pour ghee on top of the curry, season with salt. Garnish with coriander leaves and ginger juliennes.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}