package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MisalPav : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_misalpav)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            For paste of gravy/sauce:

            1.2 Tbsp Oil

            2.1 tsp Ginger paste

            3.1 tsp Garlic paste

            4.1 Cup Onion, chopped

            5.1 Cup Tomato, chopped

            6.3/4 Cup Coconut, grated

            To make gravy/sauce (Kat in Marathi):

            1.3 Tbsp Oil

            2.Spice Paste (as above)

            3.To taste Salt

            4.1 tsp Red chilly paste

            5.1 tsp Garam masala

            6.1/2 tsp Turmeric powder

            7.1 tsp Cumin-coriander powder

            8.1/2 tsp Cinnamon & clove powder

            9.3 Cups Water (or as required to adjust the consistency)

            To make usal:

            1.3 Tbsp Oil

            2.1 tsp Garlic paste

            3.1 tsp Ginger paste

            4.1/2 tsp Hing (asafoetida)

            5.1 1/2 Cups Steamed matki (moth) (soaked overnight)

            6.1 Cup Potato (cut into square pieces), boiled

            7.1/2 tsp Turmeric powder

            8.1 tsp Garam masala

            9.1/2 tsp Cinnamon-clove powder

            10.1 Lime juice

            11.3 Cups Water (or as required)

            12.To taste Salt

            For garnishing:

            1.Onion, chopped

            2.Mix dry farsan

            3.Coriander, chopped

            4.To serve with: Paav, slice of lemon
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            Prepare paste:


            1.Heat oil in a pan. Add ginger paste, garlic paste and chopped onion.


            2.Saute till the onion is transculent.


            3.Now add chopped tomatoes and grated coconut. Mix well and saute it for few minutes.


            4.Allow the mixture to cool then grind it into a smooth paste.


            Prepare gravy/sauce ('Kat' in Marathi):


            1.Heat oil in a pan. Add the ready paste into oil and saute it for about 2 minutes.


            2.Now add salt, red chilly powder, garam masala, turmeric powder, cumin-coriander powder, clove-cinnamon powder and mix it.


            3.Add water and cook till the mixture starts leaving oil.


            4.Transfer it in a bowl and keep it aside.


            Prepare Usal:


            1.Heat oil in a pan. Add ginger paste, garlic paste and asafoetida.


            2.Saute it for a minute and add soaked & boiled sprouts along with potatoes. Mix it well.


            3.Now add salt, turmeric powder, garam masala, clove-cinnamon powder and lime juice.


            4.Add water to it and cook it for about 8-10 minutes.


            5.Transfer it in a separate bowl.


            Prepare Misal:


            1.Take a serving bowl. First pour ready usal in the bowl and then pour the red gravy over it.


            2.Thereafter, add finely chopped onion and farsan to the mixture.


            3.Garnish it with chopped coriander. Serve it with pav and a slice of lemon
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}