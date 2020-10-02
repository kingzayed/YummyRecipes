package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ChickenKoftaRecipes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickenkofta)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.500 gm minced chicken

            2.1/2 tablespoon crushed to paste ginger

            3.1/2 cup tomato puree

            4.1/2 teaspoon coriander powder

            5.1 teaspoon garam masala powder

            6.1/4 cup mustard oil

            7.1 pinch powdered black pepper

            8.4 medium chopped onion

            9.1/2 tablespoon crushed to paste garlic

            10.1/2 cup beaten yoghurt (curd)

            11.1/2 teaspoon cumin powder

            12.1 teaspoon red chilli

            13.3 pinches salt

            14.1 handful chopped coriander leaves


            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.Season the minced chicken with salt and pepper and keep aside.


2.Heat oil and saute the onions, followed by the ginger garlic paste.
 After 5 minutes add in the tomato puree along with the coriander and cumin powder.


3.Add red chilli and cook till oil separates from masala, add in the garam masala now and give it a good stir.


4.Take a tbsp of this masala and add it to the raw minced chicken, mix well.


5.Now add the curd to the masala in the pan(over low flame), add some water to make a gravy and let simmer over low heat.


6.Meanwhile shape the mince mixture into lemon sized balls.
 Heat a tbsp of oil till moderately hot. Fry the kofta balls till golden , drain and keep aside.
 Add any leftover oil to the simmering masala mixture to enrich the gravy.


7.Add the fried kofta balls to the simmering gravy, check seasoning and let simmer for 10 minutes till koftas are tender.
Garnish with fresh coriander."""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}