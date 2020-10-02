package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class PalakPanner : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_palakpanner)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 cup paneer heaped cup, cubes or Indian cottage cheese (150 grams)

            2.2 cups palak or indian spinach, tightly packed (100 grams)

            3.2 tbsp Oil or butter as needed

            4.2 to 3 green chilies deseeded

            5.¾ cup onions fine chopped or ½ cup paste

            6.1 tsp ginger garlic paste or garlic paste

            7.½ cup tomatoes (deseeded) or puree

            8.¼ tsp kasuri methi or dried fenugreek leaves

            9.2 to 4 tbsp Fresh cream or 10 cashews (refer notes)

            10.salt as needed

            Dry spices for palak paneer

            1.1 inch cinnamon or dalchini

            2.2 green cardamoms or elaichi

            3.2 cloves or laung

            4.1/8 tsp cumin or jeera

            Spice powders for palak paneer recipe

            1.½ tsp coriander powder (optional)

            2.¼ tsp cumin powder or jeera powder

            3.¼ to ½ tsp garam masala
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            Preparation for palak paneer


            1.For best taste always use young and tender palak. Check each spinach leaf for worms. Pluck only the leaves and discard the stems as they may leave a bitter taste.


            2.Add to a large pot of water. I usually spray vinegar and leave for 10 mins before rinsing them to remove the pesticide residue.


            3.Discard the water and rinse them again a few times. Remove them to a colander.


            4.optional for low oxalate diet - If you prefer to blanch, then bring 4 cups of water to a boil. Then add the spinach to it along with ¼ tsp salt. Keep them for 2 mins and remove to a bowl of water with 10 ice cubes in it. After 2 minutes remove to a colander.


            5.This step is optional.  Firstly fry paneer in a pan with 1 tsp oil for 2 to 3 mins. To keep them soft, you can also drop them in water and leave for 10 to 15 mins. Drain and set aside.


            6.In the same pan, add green chilies and spinach as well. Fry for just 2 to 3 mins on a medium heat. Spinach must wilt off thoroughly. Do not overcook. Set aside to cool.


            7.Blend spinach with green chilies to a smooth puree in a mixer jar.


            How to make palak paneer gravy


            1.Heat a pan with oil. Next add cinnamon, cardamoms, cloves and cumin. When they begin to splutter add onions and fry till they turn transparent.


            2.Add ginger garlic paste and fry until the raw smell goes away.


            3.Then put in tomatoes and sprinkle salt. Next fry till they turn mushy.


            4.Next add kasuri methi, garam masala and coriander or cumin powder. Saute until the mixture leaves the sides of the pan.


            5.Pour half cup water and stir. Cook until the mixture thickens.


            6.Next simmer the flame, add the pureed spinach. Mix well and cook until it begins to bubble for about 2 mins.


            7.Add paneer and mix. Switch off.


            8.This step is optional. If using cream add it now. As a substitute to cream, you can soak 10 cashews in warm water for 15 mins and blend to a smooth milk cream consistency.


            9Serve palak paneer with naan, roti or rice.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}