package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class BeanCurry : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_beancurry)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2 cups beans chopped (french beans or cluster beans or long beans)

            2.1 handful moong dal , pesara pappu

            3.½ tsp ginger , crushed . (optional)

            4.1/3 cup tomato or 1 large red and ripe tomato (chopped)

            5.1 sprig Coriander leaves , chopped

            6.1/8 tsp turmeric

            7.Salt to taste

            8.½ to ¾ tsp red chili powder

            9.1 sprig curry leaves

            10.½ tsp cumin /jeera

            11.1 Pinch mustard seeds

            12.Oil as needed

            13.1 Pinch hing
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Wash and soak moong dal in enough water for at least 30 minutes. Make sure it is soaked thoroughly.


            2.Add water to a pressure cooker, add chopped beans to a bowl without adding any water. Place this bowl in the pressure cooker and cook for 2 whistles.


            3.Heat a pan with oil, add mustard, jeera and curry leaves, let them splutter, then add hing and ginger if using, saute.


            4.Add tomatoes, salt and turmeric. Fry the tomatoes till they turn fully mushy. After that cook for another 2 mins.


            5.Add the dal, beans, chili powder and salt as needed.


            6.Mix well and fry for 2 to 3 mins. If there is any stock left after cooking beans, just pour it and increase the flame to evaporate that water.


            7.Close the lid and cook for 2 to 3 mins till the beans turn tender and blend well with the tomato and chili powder. Also make sure dal is cooked fully.


            8.Add coriander leaves, coconut if desired. beans curry is ready.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}