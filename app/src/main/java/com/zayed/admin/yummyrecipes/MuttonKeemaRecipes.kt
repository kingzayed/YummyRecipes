package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MuttonKeemaRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_keema)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val para = """
            1.Marinate the mince with all the marinating ingredients. .


            2.Leave overnight in the fridge or at least for four to five hours.


            Cooking the Qeema:


            1.Add the curd and onions to the marinated mince an hour before cooking.


            2.Heat oil and add cloves and cardamoms, allowing them to crackle for a minute or two.


            3.Now add the marinated mince. Stir it for a few minutes on medium flame and then leave on low flame till done.


            4.Do not use the pressure cooker. As it is a dry dish, let the excess water from the marination evaporate fully.


            5.After the qeema is cooked, prepare to smoke it.


            6.Light a small piece of coal over the stove flame, then place it on an onion slice, pour a few drops of oil on the live coal so it smokes.


            7.Then, leave the smoking coal over the mince and cover the cooking pot with a lid. Let it remain there for a few minutes.


            8.We sometimes use a long deep spoon, place the smoking coal on it and close the lid. It adds an exceptional smoked aroma.


            9.Garnish with fresh coriander leaves, onions rings, chopped green chillies, finely shredded ginger strips and a sprinkling of garam masala.


            10.A squeeze of lemon juice adds a bit of tanginess.
            """.trimIndent()
        textPreparation!!.text = para
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}