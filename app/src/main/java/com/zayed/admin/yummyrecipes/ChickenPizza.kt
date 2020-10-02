package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenPizza : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_bbqpizza)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 Tbsp Chili or sunflower oil

            2.2 Boneless and skinless chicken breasts (cut into 1/2-inch pieces)

            3.1 TSP Root ginger (grated), peeled

            4.3-4 Garlic cloves, finely chopped

            5.4-5 TBSP Pasta sauce or 2 tomatoes (chopped and blended)

            6.1 TBSP Chili and garlic sauce

            7.1 TSP Soy sauce

            8.1/4 TSP Chili powder

            9.1 Readymade pizza base or a garlic pizza flatbread, 10-12 inches in diameter

            10.1/2 Red onion, sliced

            11.30 GRAM Cheddar cheese, grated

            12.A small handful fresh coriander leaves, chopped


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Preheat the oven to 200C.


            2.Heat the oil on a medium heat in a frying pan or wok. Add the chicken and fry for 8 to 10 minutes.


            3.Tip in the ginger and garlic and mix for a couple of minutes. Stir in the pasta sauce or tomatoes and soy sauce. Mix in the chili powder.


            4.Spoon the mixture onto the pizza base. Sprinkle with the onion and cheese.


            5.Bake for 10 minutes until the cheese has melted. Serve hot.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}