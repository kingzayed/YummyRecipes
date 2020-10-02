package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class FruitsSalads : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_fruitsalads)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.Watermelon

            2.Cantaloupe

            3.Kiwifruiit

            4.Pineapple

            5.Marshmallow

            6.To garnish Mint leaf, crushed nuts, sesame seeds or cinnamon


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Use fruit that will survive being cut into cubes and won’t brown.


            2.If using marshmallow, this will add a soft textured sweetness to the finished cube.


            3.The cubes work well at around 2.5cm/1 inch each. This step is a bit fiddly but cutting well-shaped cubes is what makes the whole cube work well.


            4.Use a sharp knife for clean cutting.


            5.Make one row consisting of three alternating cubes. Alternate so that no adjacent cubes are the same fruit.


            6.The base should consist of four sides of three cubes each side.


            7.Make two more layers the same. The cube is complete.


            8.Place a mint leaf on top for a garnish. Sprinkle with crushed nuts, sesame seeds or a spice like cinnamon, as preferred.


            9.You can serve this as a single cube for everyone to share from, or you can make it as a single serve cube for each diner. This will depend on how large you make the final fruit cube and how much fruit you’ve got to make the small cubes from.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}