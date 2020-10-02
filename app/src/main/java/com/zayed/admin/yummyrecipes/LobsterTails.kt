package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class LobsterTails : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lobstertails)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 whole lobster (weighing approx. 500 grams)

            2.100 gms mushrooms

            3.8 gms garlic

            4.10 gms red onion

            5.50 ml fresh cream

            6.1 egg yolk

            7.60 ml cognac

            10.10 gm thyme

            11.A pinch of nutmeg

            12.10 - 20 gms Parmesan cheese

            13.20 - 30 gms Gruyere cheese
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Split the lobster length-wise into two parts and clean the head thoroughly under cold running water.


            2.Scope all the meat from the lobster and clean. Keep the shell aside for finishing in the oven.


            3.Now dice the Lobster meat. In another pan sauté the garlic and onion & later add the sliced mushrooms.


            4.After the mushroom has slightly dried out add in the lobster meat and de-glaze with 30 ml Cognac.


            5.In another pan, add the rest of the Cognac to the fresh cream and one egg yolk, grate the nutmeg and mix well.


            6.Add this mixture to the pan containing lobster and mix well, mix in the thyme now.


            7.Get the pan off the flame and mix well till it turns thick. Fill the cleaned empty shell of the lobster with this mixture that has been prepared.


            8.Top up the lobster with Gruyère cheese and Parmesan cheese. Finish in a medium hot oven for 4 minutes.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}