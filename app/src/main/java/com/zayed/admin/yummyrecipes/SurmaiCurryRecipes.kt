package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class SurmaiCurryRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_surmaicurry)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            Grind to a paste


            1.2 Onions (medium sized)

            2.1 Tomatoes (medium sized)

            3.3/4 cup Coconut (grated)

            4.6 Cloves Garlic

            5.8 Chilies (Kashmiri Red)

            6.1 teaspoon Coriander Seeds

            7.1 teaspoon Peppercorns (whole)

            8.1 Tamarind (marble sized Ball)

            For the curry


            1.600 grams Seer Fish (Surmai or Kingfish or)

            2.1 teaspoon Turmeric (Powder)

            3.1 tablespoon Coconut Oil

            4.1 teaspoon Mustard Seeds

            5.Handful Curry Leaves

            6.A few Sprigs Coriander (for topping)


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Clean and wash the fish slices and rub turmeric all over them. Cover and keep aside.


            2.Grind all the ingredients under paste till smooth with a tablespoon or two of water.


            3.Heat coconut oil in a large pan or kadhai and add mustard seeds. Once the seeds start spluttering, add the ground paste and cook while stirring once in awhile for 10 minutes.


            4.Slide the fish into the pan, and add salt and 3/4 cup water. Mix gently so as not to break the fish.


            5.Bring the curry to a boil, and lower the heat to a simmer. Add curry leaves and simmer for 15 minutes.


            6.Top with coriander leaves and serve this spicy kingfish curry with steamed rice.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}