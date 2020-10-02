package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChowMeinChicken : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chowmein)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """1.200 g /6oz chicken thigh fillets , cut into bite size pieces (Note 1 tenderise option)

2.1 1/2 tbsp peanut oil (or other cooking oil)

3.200 g /6 oz fresh chow mein noodles (Note 2)

4.3 - 4 cups green cabbage or Chinese cabbage , finely shredded (Note 3)

5.1 carrot, julienned

6.1 cup bean sprouts

7.3 shallot/scallions/green onions , cut into 5cm/2" pieces

8.2 cloves garlic , finely chopped

9.1/4 cup / 65 ml water

Chow Mein Sauce:

1.2 tsp cornflour / cornstarch

2.1 1/2 tbsp soy sauce , all purpose or light (Note 4)

3.1 1/2 tbsp oyster sauce

4.1 1/2 tbsp Chinese cooking wine (Note 5)

5.2 tsp sugar

6.1/2 tsp sesame oil

7.White pepper

"""
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            Sauce:


            1.Mix together cornflour and soy sauce, then mix in remaining ingredients.


            2.Alternative: Use 1/3 cup Chinese All Purpose Stir Fry Sauce, if you have some in stock.


            Other Prep:


            1.Marinate Chicken: Pour 1 tbsp of Sauce over the chicken, mix to coat, set aside to marinate for 10 minutes.


            Noodles: 1.Prepare the noodles according to the packet instructions (my pack says soak in boiled water for 1 minute), then drain.


            Cooking:


            1.Heat oil in wok or large fry pan over high heat.


            2.Add garlic and stir fry for 10 seconds or until it starts to turn golden - don't let it burn!


            3.Add chicken and stir fry until the surface gets a tinge of browning but inside is still raw - about 1 minute.


            4.Add the cabbage, carrot, and the white pieces of shallots (i.e. from the base of the stalk). Stir fry for 1 1/2 minutes until the cabbage is mostly wilted.


            5.Add the noodles, Sauce and water. Stir fry for 1 minute, tossing constantly.


            6.Add bean sprouts and remaining shallots/scallions. Toss through for 30 seconds or until the bean sprouts just start to wilt.


            7.Remove from heat and serve immediately.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}