package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MatarPanner : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_matarpanner)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 cup fresh or frozen Green Peas (matar)

            2.3/4 cup (1/2-inch cubed) Paneer (cottage cheese)

            3.1 medium Onion, finely chopped

            4.1 Green Chilli, chopped

            5.2-3 cloves of Garlic

            6.1/2 inch piece of Ginger, chopped

            7.2 medium Tomatoes, roughly chopped

            8.5-6 Cashew Nuts, soaked in hot water for 20-30 minutes

            9.1/2 teaspoon Red Chilli Powder

            10.1/4 teaspoon Turmeric Powder

            11.1 teaspoon Coriander Powder

            12.1/4 teaspoon Garam Masala Powder

            13.For shallow frying + 2 tablespoons Oil or Ghee (clarified butter)

            14.1/2 cup + 2 tablespoons Water

            15.Salt to taste
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Grind onion, green chilli, ginger and garlic together in the small chutney jar of a grinder to make medium coarse paste. Grind the tomatoes to make tomato puree. Grind cashew nuts with 2 tablespoons water until smooth paste.


            2.Heat 2 tablespoons oil in the same pan/kadai over medium flame. Add crushed onion paste (prepared in step-1) and salt (only for onion paste, it helps to cook onion faster). Sauté it until oil starts to separate or it turns translucent. It will take around 5-7 minutes.


            3.Add tomato puree (prepared in step-1) and cook on medium flame until oil starts to separate, for approx. 5-6 minutes.


            4.Add red chilli powder, turmeric powder, coriander powder, garam masala powder and salt.


            5.Stir and cook for a minute. Add cashew nut paste (prepared in step-1).


            6.Stir and cook for 1-2 minutes.


            7.Add boiled peas and 1/2 cup water; mix properly and cook for 2-3 minutes.


            8.Add paneer cubes and cook for 2-3 minutes. We have added plain paneer cubes but you can add shallow fried paneer to enhance the flavor (see tips).


            9.Turn off flame and transfer prepared curry to a serving bowl. Matar paneer is ready. Serve it with butter kulcha, cucumber tomato onion salad and gajar halwa for a complete meal.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}