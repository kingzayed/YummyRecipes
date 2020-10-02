package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class CheesePizza : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cheesepizza)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            For Pizza dough:

            1.500 Gram Flour

            2.Salt

            3.300 Ml Tepid Water

            4.7 Gram Dried yeast

            5.1/2 tsp Sugar

            6.30 Ml Olive Oil

            7.Extra Virgin olive oil

            For the topping:

            1.Passata sauce

            2.1 Cup Mozzarella cheese, grated

            3.Handful Basil leaves

            4.Pepper

            5.Extra virgin olive oil


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            Prepare the Pizza dough:


            1.Sieve flour with salt and add yeast to tepid water and stir in sugar. Leave aside for 6 to 8 minutes.


            2.In a mixing bowl, create a well in the middle of the flour mixture and add 100 ml of yeast mixture and 15 ml olive oil.


            3.Add in the rest of yeast mixture and remaining olive oil.


            4.Flour the kneading surface so that the dough does not stick.


            5.Mix together with your fingers till you have a dough. Knead for 10 minutes till you have an elastic, even product.


            Proving the Dough:


            1.Place the dough in a bowl and drizzle generously with extra virgin olive oil.


            2.Cover bowl with cling film and place in a warm area to prove for 50 minutes.


            3.After the dough is proved, bash the air out and cut into small pieces for individual pizzas.


            4.Dust the work surface and rolling pin with some flour before rolling out the dough.


            Prepare the topping:


            1.Pre-heat oven at its highest mark and flour your baking tray.


            2.Now, using a rolling pin, roll out the freshly made pizza dough and place on the tray.


            3.Spread a thin layer of passata sauce and cover with mozarella cheese and sprinkle basil leaves.


            4.Put the tray into the oven for 10 to 12 minutes.


            5.After the pizza is baked remove from the oven and drizzle extra virgin olive oil and some pepper.


            6.Garnish with fresh basil and cut into slices.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}