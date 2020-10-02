package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenTikkaRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickentikka)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.500 grams chicken boneless and cubed

            2..1 to 1 ½ tbsp chickpea flour or besan

            3.1 cup yogurt (regular thick curd or ½ cup of hung curd or greek yogurt

            Veggies (at room temp, using from the fridge right away makes them soggy):

            1.½ green bell pepper

            2.½ red bell pepper or tomatoes (remove the seeds and pulp)

            3.1 large onion cubed

            Chicken tikka masala marinade (skip, if using readymade tikka masala powder):

            1.¾ to 1 tsp red chili powder , Kashmiri , or paprika

            2.1/8 tsp pepper powder

            3.1 ½ tsp ginger garlic paste

            4.1/8 tsp turmeric

            5.½ tbsp kasuri methi or dried fenugreek leaves (crushed)

            6.1 to 2 tbsp lemon juice (adjust, if your curd is sour, you can skip this)

            7.¼ tsp biryani masala powder or ½ teaspoon of good garam masala

            8.½ tsp coriander powder (optional, refer notes 3)

            9.Salt to taste

            10.1 tbsp oil


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.To make the best chicken tikka, we need drained yogurt/ curd or greek yogurt works fine
. If you are using regular yogurt, then add it to a cheese or muslin cloth and then drain off the excess water
. You must have a thick consistency curd. you can also leave the yogurt to drain off for several hours in the refrigerator, after placing it in a muslin cloth.


2.Wash and cut chicken fillet to equal sized cubes, remove the moisture from them using disposable tissues. Or set them side for a while to take away the dripping water.


3.Mix all the ingredients under chicken tikka masala marinade with yogurt, lemon juice, gram flour.
 Marinate the chicken for at least an hour.
 12 tastes the best. You will have to refrigerate if marinating for longer than an hour.


4.Soak the wooden skewers for at least 30 mins in water to prevent them from burning.


5.Just before you begin to grill, cube the veggies and marinate in the left over marination.
 Put them on to skewers, alternating veggies and chicken.


6.Pre heat the oven to 240 C for at least 15 minutes, bake for 20 to 30 mins or till fully done.
 I suggest checking after 20 mins.
 This depends on the size of your chicken pieces and how tender it is."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}