package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenlollipopRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenlollipop)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            Marination for chicken lollipop:

            1.1 ¼ tbsp Ginger garlic paste or ½ tsp each of powder

            2.¼ to ½ red chili powder or paprika (adjust) or red chili sauce

            3.½ tsp garam masala or any spice powder

            4.1/8 tsp salt

            5.4 tbsp corn flour or (2 tbsp. rice flour)

            Seasoning for chicken lollipop:

            1.1 onion medium fine chopped

            2.¾ tbsp ginger chopped

            3.¾ tbsp garlic chopped

            4.1 tsp soya sauce

            5.1 tsp vinegar

            6.¾ to 1 tbsp red chili sauce or red chilli paste or any hot sauce

            7.1 tsp sugar (can reduce to ½)

            8.½ cup water


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1. I always prefer to soak the chicken in buttermilk for at least an hour.
 If using larger wings or drummettes then i suggest soaking for 4 to 6 hours in refrigerator.
 I would not recommend skipping this step as it really helps to yield soft and tender chicken when fried or grilled.


To make buttermilk, add 3 to 4 tbsp curd or yogurt to a bowl.
 Whisk it well with a fork. Add 1 ¼ cup water and ¼ tsp salt.
 Then add chicken to the butter milk.
 Always cover the chicken container and wrap with a few disposable plastic bags.
 Place the bowl in a separate compartment in the fridge which is not used for fruits, veggies and nuts.


2. Remove skin and fats before going ahead.
 Hold the thinner side of the drummettes.
 Next with the help of a knife, bring down the meat towards the other end.


3. Drain off the buttermilk completely if any.
 Add chili powder or paprika, spice powder, Ginger garlic and pepper powder as well.
 Toss gently to coat.


4. Mix cornflour with salt. Next add it to the bowl. Mix well.
 If you do not like to use corn flour, use unbleached and unbromated flour.
 You can make these without flour or can use only 2 tbsp rice flour as well.


5. Next shape them to balls on one side and place them all on a plate.


6. You can grill or fry the chicken.
 Grill in a preheated oven at 240 C for 20 to 40 minutes depending on the size.
 OR Heat oil in a pan. When the oil is hot enough, deep fry them on medium high until cooked.
 Do not fry on very high flame as it may brown the chicken outside without cooking inside.
 Next frying on a very low flame, will make the chicken hard.
 I haven’t tried shallow frying or pan frying, since I am not sure if they get cooked well.


7. Drain them on a kitchen towel. I fried in 3 batches.


8. Transfer the oil to a bowl. After that keep 1.5 tsp oil in the pan. Add ginger garlic and fry until fragrant.


9. Next add onions and fry until transparent.
 While the onions fry, make red chili paste.
 Mix ¾ tbsp chili powder with 1.5 tbsp water.
 You can also use ready made chili paste.


10. Mix 1 tsp vinegar with only 1 tsp naturally brewed soya sauce for half kg chicken. Pour it to the pan.


11. Add sugar and red chili paste or sauce. Saute everything together without burning.


12. Then pour ½ cup water and Stir.


13. Allow the sauce to cook until it thickens.


14. Add the chicken and toss."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}