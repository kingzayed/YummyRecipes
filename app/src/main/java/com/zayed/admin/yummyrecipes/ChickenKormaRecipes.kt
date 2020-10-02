package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenKormaRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenkorma)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.300 gm chicken

            2.50 gm grated onion

            3.10 gm cashews

            4.1/2 tablespoon ginger paste

            5.2 clove

            6.1/2 inch cinnamon stick

            7.1/4 teaspoon grated nutmeg

            8.1 tablespoon lime juice

            9.50 ml refined oil

            10.1/2 small coconut

            11.1/2 small coconut

            12.1/2 cup yoghurt (curd)

            13.1 tablespoon sesame seeds

            14.1/2 tablespoon garlic paste

            15.2 green cardamom

            16.1 leaves bay leaf

            17.125 gm peeled potato

            18salt as required


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.Chicken Korma is a spicy melange of chicken and aromatic spices.
 Here’s how you can prepare this delicious chicken recipe at home by following a few simple steps.
 Take a fry pan on low-medium flame and dry roast coconut, cashews and sesame together.
 Once they are roasted, grind these ingredients.
 Now mix this paste with curd along with ginger, garlic and onions.


2.Then wash and clean the chicken pieces with water.
 Now take a large bowl, take the chicken pieces and add the paste along with ginger, garlic and onions.
 Marinade the chicken and keep it for an hour.
 Take a shallow pan or kadhai, heat oil in the same pan over medium flame and put green cardamom, cinnamon, cloves and bay leaves.
 Once they start to crackle, add the chicken along with the marinade.


3.Cook the ingredients over a low flame till dry.
 Then add the grated nutmeg and cover the contents with hot water.
 When the chicken is cooked, add lime juice and potatoes.
 Remove the curry from flame after a few minute, garnish it.
 To make it more delicious you can add some finely chopped ginger juliennes, green chilies and coriander.4.Serve hot with Rice, Biryani, Rumali Roti, Sheermal or Naan.
 Try this delectable chicken recipe at home and impress your loved ones with this flavoursome delicacy."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}