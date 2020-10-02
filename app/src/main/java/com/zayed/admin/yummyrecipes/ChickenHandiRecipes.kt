package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenHandiRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenhandi)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 Kg Chicken (cut into medium sized pieces)

            2.2 Large sized Onion (sliced lengthwise)-approx 250 grams

            3.2 Large sized Tomatoes (puréed)-approx 250 grams

            4.200 grams Curd

            5.Cooking Oil

            6.Salt

            7.3 Bay Leaf

            8.2 tsp. Cumin Seeds

            9.4 Green Cardamom

            10.1 tsp. Black Peppercorns

            11.3 Black Cardamom

            12.½ tsp. Cloves

            13.1-1/2 inch Cinnamon Stick

            14.1 tbsp. Kashmiri Red Chili Powder (less spicy)

            15.½ tsp. Turmeric Powder

            16.1 Lemon Juice

            17.½ tsp. roasted dried Fenugreek Leaves Powder

            18.2 tbsp. Coriander Powder

            19.2-3 tbsp. Ginger Garlic Paste

            20.¼th Cup fresh Coriander Leaves


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.Let's perform Chicken's first Marination:


             Add 1 tsp. Salt, ½ tsp. Turmeric Powder, Lemon Juice and mix well.
 We will keep Chicken in this marination for 30 minutes.


2.We will dry roast Whole Spices.
 In a pan, add Bay Leaf, Cinnamon stick, Peppercorns, Black Cardamom, Green Cardamom, Cumin Seeds and Cloves.
 Dry Roast lightly. As the spices release aroma, switch off the heat and grind it into fine powder.


3.Lets prepare for second marination:


 Add roasted and grounded spice Mix, Red Chili Powder, Coriander Powder and curd.
 Mix well. Cover with a Cling Film and keep the chicken in this marination for an hour in refrigerator.


4.Take marinated chicken out from refrigerator.
 We will make this preparation in an earthen pot.
 Heat 4-5 tbsp. Oil and add sliced Onions. Fry until Onions become brown in color.


5.When Onions become brown, add ginger-garlic paste and fry for a minute.
 Add Chopped Coriander Leaves and marinated chicken. Roast Chicken on high heat.


6.After 5 mins of roasting, add tomato puree and salt to taste and mix well. Cover and cook the Chicken on reduced heat.


7.After 10 mins, stir the chicken. We have not added any water in this preparation.
 Chicken gets cooked in its own juices, and the moisture from curd and tomato puree.
 Cover and cook for remaining time.


8.Chicken gets cooked in total 25 minutes.
 You can adjust the consistency of the final preparation.
 If you require thick consistency, then cook uncovered for 3-4 minutes.
 Add roasted dried fenugreek leaves powder and mix.


9.Switch off the heat and now we will prepare for a Tadka


10.Heat 1 tbsp. Oil and add ½ tsp. Cumin Seeds. Pour tadka on Chicken. Add some chopped Coriander Leaves


11.Chicken Handi is ready to be served.
 Flavor of Chicken cooked in an earthen pot on low heat in its own juices is delicious.
 Chicken Handi can be relished with Laccha Paratha, Naan, Phulka or Steamed Rice."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}