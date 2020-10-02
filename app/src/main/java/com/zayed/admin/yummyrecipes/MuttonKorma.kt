package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MuttonKorma : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_muttonkorma)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val para = """
            1.Take 1 tbsp of ghee and fry the ginger and garlic paste.


            2.Then add the green cardamom, cinnamon stick, cloves, bay leaves, whole black peppers


            3.and a pinch of Javitri.


            4.After a few minutes, add the mutton till the color turns white. Add salt.


            5.Take 3 onions cut lengthwise, and fry them in vegetable oil till they turn brown.


            6.Add the yoghurt with red chillies mix, as well as brown onion paste to the meat. Add 2 cups of water, and let the meat cook on medium heat.


            7.Just before the meat is done, add the cashew nut paste.


            8.For a lovely last step, add the rose water and saffron.
            """.trimIndent()
        textPreparation!!.text = para
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}