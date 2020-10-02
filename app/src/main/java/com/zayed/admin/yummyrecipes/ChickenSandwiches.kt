package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenSandwiches : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickensandwiches)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2 to 3 slices bread

            2.½ to ¾ cup Chicken shredded or minced

            3.1 tsp Butter for toasting bread

            4.1 tbsp olive oil

            5.1 tbsp garlic minced or 2 cloves

            6.1 pinch Red chilli powder or paprika a generous pinch

            7.1 pinch Any spice powder (all spice or garam masala)

            8.3 tbsp mayonnaise

            9.1/8 to ¼ tsp mustard powder (optional)

            10.¼ tsp pepper coarsely crushed

            11.Salt as needed

            12.2 to 4 tbsp onions or cucumber, chopped

            13.sprigs cilantro or parsley chopped finely, Few


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            Preparation


            1.Butter the bread slices and toast them on a griddle until golden. Set these aside.


            2.You can either boil the chicken or saute in oil to give a grilled like flavor and taste.


            3.To saute , add some oil on the griddle and saute the garlic until it smells good.


            4.Saute chicken along with salt until done. Sprinkle the spice powders. Toss well. Switch off and cool this.


            5.Add pepper, mustard powder and mayo to a bowl. Mix everything well.


            6.Add in chopped onions and herbs. Mix and add in the chicken.


            Making chicken sandwich


            1.Mix and spoon it over the toasted bread. Cover with another slice and press down.2.Halve the chicken sandwich and serve.



            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}