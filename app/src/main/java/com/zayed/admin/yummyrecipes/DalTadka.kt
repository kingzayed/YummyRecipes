package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class DalTadka : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_daltakka)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1/2 Cup Chana Dal

            2.1/2 Cup Toor Dal

            3.1/2 tsp Turmeric Powder

            4.1/2 tsp Salt

            5.1 Cup Water

            For Gravy:

            1.2 Tbsp Oil

            2.1 tsp Cumin seeds

            3.1 tsp Ginger-Garlic paste

            4.1 Onion, chopped

            5.1 Tomato, chopped

            6.1/4 tsp Salt

            7.1 tsp Coriander Powder

            8.1/2 tsp Garam Masala

            9.1 Green chilli, chopped

            10.1/2 Cup Dal Water

            11.1/2 tsp Kasoori Methi

            For Tadka:

            1.2 Tbsp Oil

            2.1/2 tsp Cumin Seeds

            3.1 tsp Garlic, chopped

            4.2 Red whole chillis

            5.1/2 tsp Ginger

            6.1/2 tsp Red chilli powder

            7.2 Tbsp Coriander leaves
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.In a bowl soak chana dal for 2 hours.Punjabi Dal Tadka


            2.Similarly in another bowl soak toor dal.Punjabi Dal Tadka


            3.After soaking, put both in a pressure cooker adding salt, turmeric powder and water.Punjabi Dal Tadka


            4.Pressure cook the dals for about 5-8 minutes (3-4 whistles) until both are cooked completely.


            To Prepare Gravy:


            1.Heat oil in a pan and add cumin seeds.Punjabi Dal Tadka


            2.When they crackle add ginger garlic paste and mix well.Punjabi Dal Tadka


            3.Add onion and cook until it appears golden pink.Punjabi Dal Tadka


            4.Now add tomatoes, mix and cook a little more.Punjabi Dal Tadka


            5.Then add salt, coriander powder, garam masala, and green chilli to it and cook for a minute.Punjabi Dal Tadka


            6.Add dal water which persisted after boiling the dal and kasoori methi along with it.Punjabi Dal Tadka


            7.Pour the boiled dal in this onion tomato gravy and let it boil on sim.Punjabi Dal Tadka


            8.Add more water if required.


            To Prepare Tadka:


            1.In a pan heat oil and add cumin seeds. Let it crackle.Punjabi Dal Tadka


            2.Add garlic, red whole chillis, and ginger. Cook for few seconds.Punjabi Dal Tadka


            3.Put red chilli powder and coriander leaves. Mix well.Punjabi Dal Tadka


            4.Pour the tadka over the cooked dal.Punjabi Dal Tadka


            5.Punjabi Dal Tadka is ready. Serve it hot with roti, naan or jeera rice.Punjabi Dal Tadka
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}