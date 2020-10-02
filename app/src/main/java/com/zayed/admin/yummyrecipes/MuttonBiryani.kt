package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MuttonBiryani : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_muttonbiryani)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            For the rice:

            1.1 Star anise

            2.500 Gram Basmati rice, blanched

            3.2 Bay leaves

            4.2 Black cardamom

            5.2 tsp Black cumin seeds

            6.6 Black peppercorn

            7.6 Green cardamom

            8.2 Cinnamon sticks

            9.6 Cloves

            10.1 tsp Fennel

            11.1/4 Jaiphal

            12.1 Javitri

            13.3 tsp Salt

            For mutton marination:

            1.1 Kg Mutton (cut in 2 inches pieces, preferably front leg part and avoid shoulder cut)

            2.1 Tbsp Garam masala

            3.1 Tbsp Garlic paste

            4.1 Tbsp Ginger paste

            5.3 Tbsp Raw papaya paste

            6.4 Tbsp Hung curd

            7.1 Lemon (juiced)

            8.Coriander powder

            9.Cumin powder

            10.1 Tbsp Red chilli powder

            11.1 tsp Salt

            Other ingredients:

            1.4 Onions, sliced

            2.2 Tomatoes, chopped

            3.1/4 Cup Milk (warm)

            4.Ghee

            5.Saffron strands

            6.Oil

            7.Rose water

            8.Kewra essence

            9.4 green chillies
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            Marinating the mutton:


            1.To the mutton add the beaten curd, ginger-garlic paste, raw papaya paste, chilli powder, salt, lemon juice, garam masala.


            2.Allow the mutton to marinate for 3 hours.


            Preparing fried onions or Barista:


            1.Slice 2 onions very thinly. Separate the slices.


            2.In a pan or kadai add oil and fry the onion slices till nicely brown.


            3.Take care not to burn them. Fry in small batches. Do not put all the slices at a time, that will lead to lumpy messy onions.


            4.Make sure all the onion slices frying are dipped in oil, if needed add more oil. Keep stirring continuously but gently for an even brown color.


            5.Take the fried onions out with a slotted spoon or ladle.


            6.Keep them on a paper-towel lined plate. This crispy brown fried onion slices are called Barista.


            Cooking the mutton:


            1.Heat ghee in a thick-bottomed pan.


            2.Add remaining sliced onions and green chillies. Cook, stirring continuously, till onions are light golden brown.


            3.Add ginger paste and garlic paste and mix well.


            4.Add marinated mutton and cook on high heat for seven to eight minutes.


            5.Add coriander powder, cumin powder and red chilli powder. Mix thoroughly.


            6.Stir in three cups of water, bring it to a boil, reduce heat and cook covered till mutton is almost cooked.


            7.Add tomatoes, salt, garam masala powder and fresh coriander leaves.


            8.Cook for 15 minutes on medium heat, stirring occasionally. The ghee would be separated from the spices and there should not be any watery gravy to the meat.


            Preparing the rice:


            1.Use only good quality long grain Basmati rice. Soak the rice for 20 minutes in water. Wash well till the water runs clear. Drain all the water.


            2.In a small piece of cloth take cardamom, cinnamon, cloves, javitri, jaiphal, black peppercorn, shahi jeera, star anise and tie a knot to make a bag (potli).


            3.Bring 750 ml water to boil, add rice, bay leaf, salt and potli, cover and cook till rice is done 1/3rd.


            4.Drain the water & remove the whole masala potli.


            Preparing the saffron-milk:


            1.Take 1/4th cup warm milk in a cup and dissolve saffron strands in the milk.


            2.Cover and wait for 20 minutes. Add rose water and kewra essence in the milk. Mix well and cover. Keep aside.


            Layering the biryani:


            1.Take a large heavy bottom pan with tight fitting lid.


            2.Add 2tbsp ghee to the pan. Melt the ghee on low heat. Turn and rotate the pan carefully so the ghee can coat the bottom and sides of the pan. Switch off the heat.


            3.Add a layer of cooked rice, then cooked meat pieces, sprinkle saffron water, add fried onion slices and ghee.


            4.Again add a layer of rice, then meat...go on like this till you are done. Top and bottom layer will be of rice.


            5.Cover with chopped pudina and coriander, fried onion and slit green chillies and juice of half a lemon.


            6.Put the lid on. Seal the pan with flour dough or aluminium foil, then put the lid. Keep the heat to lowest. And cook the Biryani in this 'Dum' process for 40 minutes.


            7.Make sure your pan is heavy-bottomed or the rice will burn. Or you can place a flat tawa then keep the pan on that tawa.


            8.After 40 minutes switch off the heat and let the biryani stand for another 10 minutes. Transfer to a serving bowl.


            9.Serve with raita and salad.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}