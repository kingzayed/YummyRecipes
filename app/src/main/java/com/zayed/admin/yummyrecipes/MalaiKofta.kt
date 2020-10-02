package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MalaiKofta : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_malaikofta)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.4 Large Potatoes, boiled

            2.250 Gram Paneer (cottage cheese)

            3.50 Gram Maida

            4.1 Tbsp Coriander leaves, chopped

            5.3 Onions

            6.1 Tbsp Ginger garlic paste

            7.2 Tomatoes

            8.200 Ml Malai or cream

            9.2 Tbsp Raisins and cashew nuts

            10.50 Gram Cashew nuts paste

            11.1/2 tsp Haldi (turmeric)

            12.1/2 tsp Red chilli powder

            13.1/2 tsp Kitchen king masala

            14.1 Tbsp Kasturi methi (dry Fenugreek)

            15.To taste Salt

            16.1 Tbsp Sugar
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            Prepare the koftas:


            1.Refrigerate the boiled potatoes for 4 to 6 hours as this makes it easy to cook koftas.


            2.Mash the boiled potatoes, paneer, maida. The mix should not be too hard or too soft. Add salt, chopped coriander leaves and mix well.


            3.Cut the raisins and cashew nuts into very small pieces and add 1/2 tsp of sugar to the mix.


            4.Heat up the oil for deep frying.


            5.Roll out the balls from the dough you prepared and stuff the dry fruit mix in the centre.


            6.Fry the koftas and if they break in hot oil then dust them with dry maida before putting them in.


            Prepare the gravy:


            1.Fry some onion, ginger garlic paste and tomato paste.


            2.Mix the cashew nut paste with 2 Tbsp of warm milk and pour it into the paste.


            3.Except kasturi methi, add all the dry masala into the paste and saute till the oil separates itself.


            4.Add and a half cup of water and simmer the gravy till it's done.


            5.Add cream/malai, 1 Tbsp of sugar and kasturi methi.


            6.Simmer the gravy till the oil starts separating and once it's done, put the fried koftas into the gravy and serve hot with chapatis.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}