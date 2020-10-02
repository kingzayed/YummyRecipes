package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenTandooriRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_tandoori)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """1.½ kg chicken (or 500 to 700 grams)

2.½ cup yogurt (or hung curd or greek yogurt)

3.¾ tbsp ginger garlic paste

4.1 tsp garam masala

5.1 tsp red chilli powder

6.¼ tsp pepper powder

7.1 tsp coriander powder (or daniya powder)

8.¼ tsp salt (taste marinade and add more)

9.¼ tsp Turmeric (or haldi)

10.1 tsp kasuri methi (dried fenugreek leaves)

11.1 tbsp lemon juice

12.1½ tbsp oil (or mustard oil)

For grilling:

1.1 tbsp oil

For color:

1.1 tsp red chili powder

2.1 tbsp oil

Marinade for tandoori chicken:

1.To a mixing bowl, add thick yogurt or hung curd.
 If you do not have it, then line a thin cloth over a sieve.
 Pour 1 cup curd.
 Wring it gently and strain off the whey (water).
 Make a knot and hang it to a hook for 45 mins. Then use half cup here.

2.Next add in ginger garlic paste, garam masala, red chili powder, salt, turmeric, kasuri methi, pepper powder and coriander powder.

3.Pour oil and lemon juice as well.

4.Mix everything well. The marinade has to be thick and not of dripping consistency.
 Taste it and add more salt and chili powder if needed.

5.Make deep gashes over the chicken and add it to the bowl.

7.Marinate the chicken well into the gashes.

8.Cover and set aside for at least 6 hours. If you reduce the marination time, chicken will not turn soft and juicy.
 It may not get cooked well if making on tawa.

"""
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.For the stove method, please follow the step by step instructions after the recipe card.
 Preheat the oven at 240 C for at least 15 mins.


2.Place a foil on the tray. Next grease it.


3.Place the chicken pieces oven the foil or greased wire rack.
 If using a wire rack place a tray under it to hold the drippings.


4.Grill the chicken for about 15 mins.


5.Mix together 1 tsp red chili powder with 1 tbsp oil.


6.Then baste the red chili oil over the chicken. Grill for 5 mins.


7.Flip the chicken to the other side and baste the red chili oil.


8.Grill for another 6 to 10 mins.


9.The last 5 mins, you can move it to the top most rack. This gives the charred look.
 You can also burn a char coal piece and place it in a small cup.
 Keep that in the chicken tray. Cover with a large utensil.
 Allow it to smoke for 5 to 7 mins.


10Restaurant style tandoori chicken is ready. Serve with onion and lemon wedges."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}