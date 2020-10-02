package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChocoLavaCakes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chocolava)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.135 Gram Dark chocolate

            2.95 Gram Butter

            3.100 Gram Icing sugar

            4.2 each Egg yolks + whole eggs

            5.35 Gram Flour


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Pre heat the oven at 200 degrees.


            2.In a microwaveable bowl add chocolate and butter. Melt it. (You can melt using the double boiler method too.)


            3.In another bowl whisk together sugar and eggs.


            4.Mix together the chocolate-butter mixture with the sugar-eggs mixture.


            5.Fold in the flour.


            6.Strain the mixture to remove any lumps.


            7.Keep this in the fridge for 5-7 minutes to chill.


            8.Pour the batter in greased ramekins.


            9.Bake for 9-10 minutes.


            10.Serve with whipped cream / vanilla ice cream or fresh fruits.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}