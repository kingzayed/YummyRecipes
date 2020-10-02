package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Idli : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_idli)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            For Oats Powder:

            1.2 Cups Oats

            For Fried Mixture:

            1.1 Tbsp Oil

            2.1 tsp Mustard Seeds

            3.1 tsp Chana Dal

            4.1 tsp Urad Dal

            5.1/2 tsp Turmeric Powder

            6.1 Green Chilli

            7.1 Cup Carrot , finely chopped

            8.1/2 Cup Coriander Leaves , chopped

            9.A pinch of Salt

            For Idli Batter:

            1.1/2 tsp Salt

            2.2 Cups Curd

            3.A pinch of Fruit Salt


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """For Oats Powder:


1.Take 2 cups of oats in a pan and dry roast them for about 5 minutes until golden brown.


2.Let it cool down and then grind to make it a powder.


For Fried Mixture:


1.In a broad pan heat oil over medium flame.


2.Add mustard seeds to it and let them crackle.


3.Now add chana and urad Dal, turmeric powder and green chillis. Mix well and saute until light brown.


4.Add the chopped carrots and coriander leaves. Combine all the ingredients
 thoroughly along with a pinch of salt and cook for a minute or two.


5.Let the mixture cool down for few minutes before adding into idli batter.


For Idli Batter:


1.Transfer the prepared oats powder to a large bowl.


2.In this add salt and the fried mixture. Combine well.


3.Now add the required quantity of curd and stir thoroughly in one direction adding a pinch of fruit salt to it.


4.Prepare a medium thick batter and leave it covered for few minutes.


5.Now grease the idli moulds with ghee using a brush.


6.Pour the prepared oats idli batter in each mould and put it in the steamer.


7.Cover with a lid and steam for about 15 minutes over medium flame.


8.After 15 minutes check whether the idlis are properly cooked.


9.The tasty and healthy oats idli is ready to serve with coconut chutney."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}