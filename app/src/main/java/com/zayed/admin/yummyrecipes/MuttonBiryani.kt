package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MuttonBiryani extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_muttonbiryani);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "For the rice:\n\n" +
                "1.1 Star anise\n\n" +
                "2.500 Gram Basmati rice, blanched\n\n" +
                "3.2 Bay leaves\n\n" +
                "4.2 Black cardamom\n\n" +
                "5.2 tsp Black cumin seeds\n\n" +
                "6.6 Black peppercorn\n\n" +
                "7.6 Green cardamom\n\n" +
                "8.2 Cinnamon sticks\n\n" +
                "9.6 Cloves\n\n" +
                "10.1 tsp Fennel\n\n" +
                "11.1/4 Jaiphal\n\n" +
                "12.1 Javitri\n\n" +
                "13.3 tsp Salt\n\n" +
                "For mutton marination:\n\n" +
                "1.1 Kg Mutton (cut in 2 inches pieces, preferably front leg part and avoid shoulder cut)\n\n" +
                "2.1 Tbsp Garam masala\n\n" +
                "3.1 Tbsp Garlic paste\n\n" +
                "4.1 Tbsp Ginger paste\n\n" +
                "5.3 Tbsp Raw papaya paste\n\n" +
                "6.4 Tbsp Hung curd\n\n" +
                "7.1 Lemon (juiced)\n\n" +
                "8.Coriander powder\n\n" +
                "9.Cumin powder\n\n" +
                "10.1 Tbsp Red chilli powder\n\n" +
                "11.1 tsp Salt\n\n" +
                "Other ingredients:\n\n" +
                "1.4 Onions, sliced\n\n" +
                "2.2 Tomatoes, chopped\n\n" +
                "3.1/4 Cup Milk (warm)\n\n" +
                "4.Ghee\n\n" +
                "5.Saffron strands\n\n" +
                "6.Oil\n\n" +
                "7.Rose water\n\n" +
                "8.Kewra essence\n\n" +
                "9.4 green chillies";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "Marinating the mutton:\n\n\n" +
                "1.To the mutton add the beaten curd, ginger-garlic paste, raw papaya paste, chilli powder, salt, lemon juice, garam masala.\n\n\n" +
                "2.Allow the mutton to marinate for 3 hours.\n\n\n" +
                "Preparing fried onions or Barista:\n\n\n" +
                "1.Slice 2 onions very thinly. Separate the slices.\n\n\n" +
                "2.In a pan or kadai add oil and fry the onion slices till nicely brown.\n\n\n" +
                "3.Take care not to burn them. Fry in small batches. Do not put all the slices at a time, that will lead to lumpy messy onions.\n\n\n" +
                "4.Make sure all the onion slices frying are dipped in oil, if needed add more oil. Keep stirring continuously but gently for an even brown color.\n\n\n" +
                "5.Take the fried onions out with a slotted spoon or ladle.\n\n\n" +
                "6.Keep them on a paper-towel lined plate. This crispy brown fried onion slices are called Barista.\n\n\n" +
                "Cooking the mutton:\n\n\n" +
                "1.Heat ghee in a thick-bottomed pan.\n\n\n" +
                "2.Add remaining sliced onions and green chillies. Cook, stirring continuously, till onions are light golden brown.\n\n\n" +
                "3.Add ginger paste and garlic paste and mix well.\n\n\n" +
                "4.Add marinated mutton and cook on high heat for seven to eight minutes.\n\n\n" +
                "5.Add coriander powder, cumin powder and red chilli powder. Mix thoroughly.\n\n\n" +
                "6.Stir in three cups of water, bring it to a boil, reduce heat and cook covered till mutton is almost cooked.\n\n\n" +
                "7.Add tomatoes, salt, garam masala powder and fresh coriander leaves.\n\n\n" +
                "8.Cook for 15 minutes on medium heat, stirring occasionally. The ghee would be separated from the spices and there should not be any watery gravy to the meat.\n\n\n" +
                "Preparing the rice:\n\n\n" +
                "1.Use only good quality long grain Basmati rice. Soak the rice for 20 minutes in water. Wash well till the water runs clear. Drain all the water.\n\n\n" +
                "2.In a small piece of cloth take cardamom, cinnamon, cloves, javitri, jaiphal, black peppercorn, shahi jeera, star anise and tie a knot to make a bag (potli).\n\n\n" +
                "3.Bring 750 ml water to boil, add rice, bay leaf, salt and potli, cover and cook till rice is done 1/3rd.\n\n\n" +
                "4.Drain the water & remove the whole masala potli.\n\n\n" +
                "Preparing the saffron-milk:\n\n\n" +
                "1.Take 1/4th cup warm milk in a cup and dissolve saffron strands in the milk.\n\n\n" +
                "2.Cover and wait for 20 minutes. Add rose water and kewra essence in the milk. Mix well and cover. Keep aside.\n\n\n" +
                "Layering the biryani:\n\n\n" +
                "1.Take a large heavy bottom pan with tight fitting lid.\n\n\n" +
                "2.Add 2tbsp ghee to the pan. Melt the ghee on low heat. Turn and rotate the pan carefully so the ghee can coat the bottom and sides of the pan. Switch off the heat.\n\n\n" +
                "3.Add a layer of cooked rice, then cooked meat pieces, sprinkle saffron water, add fried onion slices and ghee.\n\n\n" +
                "4.Again add a layer of rice, then meat...go on like this till you are done. Top and bottom layer will be of rice.\n\n\n" +
                "5.Cover with chopped pudina and coriander, fried onion and slit green chillies and juice of half a lemon.\n\n\n" +
                "6.Put the lid on. Seal the pan with flour dough or aluminium foil, then put the lid. Keep the heat to lowest. And cook the Biryani in this 'Dum' process for 40 minutes.\n\n\n" +
                "7.Make sure your pan is heavy-bottomed or the rice will burn. Or you can place a flat tawa then keep the pan on that tawa.\n\n\n" +
                "8.After 40 minutes switch off the heat and let the biryani stand for another 10 minutes. Transfer to a serving bowl.\n\n\n" +
                "9.Serve with raita and salad.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
