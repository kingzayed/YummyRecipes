package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class RoganJoshRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_roganjosh)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 Kg Meat

            2.1 Cup Mustard/refined oil

            3.3 tsp Red chili powder

            4.3 tsp Fennel powder

            5.2 tsp Ginger powder

            6.2 tsp Cumin powder

            7.3 tsp Brown cardamom powder

            8.1 tsp Asafoetida

            9.4 Pieces Green cardamom

            10.2 Cinnamon sticks

            11.2 Bay leaves

            12.2 Cloves

            13.1/3 tsp Saffron (optional)

            14.1 Cup Curd

            15.A pinch of Salt
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Wash the meat properly. Heat oil in a pressure cooker.


            2.Put cinnamon, bay leaves, green cardamom, cloves, a teaspoon of salt, asafoetida, and meat together.


            3.Fry meat till it turns brown. Once browned, pour a cup of water.


            4.Add the red chili powder and saffron into the meat. Keep stirring for about a minute.


            5.Mix the curd nicely in the mixer and pour it into the pressure cooker.


            6.Keep on stirring till you get a reddish tinge.


            7.Add 2 cups of water, fennel powder, ginger powder, and pressure cook for 2 minutes.


            8.Check if the meat is tender. Peel and grind green and brown cardamom and add to the meat dish.


            9.Finally sprinkle cumin powder and simmer for a minute and serve.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}