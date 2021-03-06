package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChanaMasala : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chanamasala)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.3 Tbsp grape seed oil (or sub coconut oil)

            2.1 medium white or yellow onion, finely diced

            3.1 Tbsp ground cumin

            4.3/4 tsp sea salt (divided // plus more to taste)

            5.6 cloves garlic, minced (6 cloves yield ~3 Tbsp)

            6.2 Tbsp fresh ginger, minced

            7.1/2 cup fresh cilantro, chopped

            8.2-3 fresh green chilies, sliced with seeds (I used serrano peppers)

            9.1 Tbsp ground coriander

            10.1 tsp chili powder

            11.1 tsp ground turmeric

            12.1 28-ounce can pureed or finely diced tomatoes (if unsalted, you’ll add more salt to the dish)

            13.2 15-ounce cans chickpeas, slightly drained

            14.1 tsp garam masala* (see instructions for DIY blend)

            15.2-3 tsp coconut sugar

            16.2 Tbsp lemon juice (plus more to taste)


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat a large pot over medium heat. Once hot, add oil, onion, cumin, and one-third of the salt (1/4 tsp as original recipe is written  adjust if altering batch size).


            2.Add garlic, ginger, cilantro, and green chilies to a mortar and pestle and grind into a rough paste (or use a small food processor to pulse into a paste. Alternatively, just finely mince.) Then, add to the pan with the onions.


            3.Next add ground coriander, chili powder, and turmeric and stir to coat. Add a little more oil at this point if the pan is looking dry.


            4.Next add pureed tomatoes and chickpeas and remaining salt (1/2 tsp as original recipe is written). If the mixture looks a little too thick, add up to 1 cup (240 ml) water (I added ~1/2 cup (120 ml) // amount as original recipe is written // adjust if altering batch size). You’re looking for a semi-thick soup consistency at this point, as it will cook down into more of a stew.


            5.Increase heat to medium high until it reaches a rolling simmer, then reduce heat to low or medium-low and maintain a simmer (uncovered) for 15-20 minutes, or until thick and stew-like. Stir occasionally.


            6.In the meantime, if you don’t have garam masala seasoning, make your own by adding (amounts as original recipe is written // adjust if altering batch size) 2 small dried red chilies, 1 tsp black peppercorns (or 1/2 tsp ground black pepper), 1 tsp cumin seeds (or 1/2 tsp ground cumin), 1 tsp cardamom pods (or 1/2 tsp ground cardamom), 1/2 tsp cloves (or 1/4 tsp ground cloves), and 1/8 tsp nutmeg to a mortar and pestle or spice grinder and grind/mix into a powder. Set aside.


            7.When the chana masala is thickened and bubbly, taste and adjust seasonings as needed, adding more salt for saltiness, chili powder for heat, or a bit of coconut sugar for sweetness and to offset the heat of the chilies.


            8.Remove from heat and add lemon juice and garam masala. Stir to mix, then let cool slightly before serving. Fresh cilantro and lemon juice make an excellent garnish. Chana masala can be enjoyed as a stew on its own, or it can be delicious with white or brown rice (see my favorite method here), or cauliflower rice. Lastly, my favorite is over roasted sweet potatoes and broccoli (see notes for instructions).


            9.Leftovers will keep covered in the refrigerator up to 4 days, or in the freezer up to 1 month.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}