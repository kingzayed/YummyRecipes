package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class PalakPanner extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_palakpanner);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 cup paneer heaped cup, cubes or Indian cottage cheese (150 grams)\n\n" +
                "2.2 cups palak or indian spinach, tightly packed (100 grams)\n\n" +
                "3.2 tbsp Oil or butter as needed\n\n" +
                "4.2 to 3 green chilies deseeded\n\n" +
                "5.¾ cup onions fine chopped or ½ cup paste\n\n" +
                "6.1 tsp ginger garlic paste or garlic paste\n\n" +
                "7.½ cup tomatoes (deseeded) or puree\n\n" +
                "8.¼ tsp kasuri methi or dried fenugreek leaves\n\n" +
                "9.2 to 4 tbsp Fresh cream or 10 cashews (refer notes)\n\n" +
                "10.salt as needed\n\n" +
                "Dry spices for palak paneer\n\n" +
                "1.1 inch cinnamon or dalchini\n\n" +
                "2.2 green cardamoms or elaichi\n\n" +
                "3.2 cloves or laung\n\n" +
                "4.1/8 tsp cumin or jeera\n\n" +
                "Spice powders for palak paneer recipe\n\n" +
                "1.½ tsp coriander powder (optional)\n\n" +
                "2.¼ tsp cumin powder or jeera powder\n\n" +
                "3.¼ to ½ tsp garam masala";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "Preparation for palak paneer\n\n\n" +
                "1.For best taste always use young and tender palak. Check each spinach leaf for worms. Pluck only the leaves and discard the stems as they may leave a bitter taste. \n\n\n" +
                "2.Add to a large pot of water. I usually spray vinegar and leave for 10 mins before rinsing them to remove the pesticide residue.\n\n\n" +
                "3.Discard the water and rinse them again a few times. Remove them to a colander.\n\n\n" +
                "4.optional for low oxalate diet - If you prefer to blanch, then bring 4 cups of water to a boil. Then add the spinach to it along with ¼ tsp salt. Keep them for 2 mins and remove to a bowl of water with 10 ice cubes in it. After 2 minutes remove to a colander.\n\n\n" +
                "5.This step is optional.  Firstly fry paneer in a pan with 1 tsp oil for 2 to 3 mins. To keep them soft, you can also drop them in water and leave for 10 to 15 mins. Drain and set aside.\n\n\n" +
                "6.In the same pan, add green chilies and spinach as well. Fry for just 2 to 3 mins on a medium heat. Spinach must wilt off thoroughly. Do not overcook. Set aside to cool.\n\n\n" +
                "7.Blend spinach with green chilies to a smooth puree in a mixer jar.\n\n\n" +
                "How to make palak paneer gravy\n\n\n" +
                "1.Heat a pan with oil. Next add cinnamon, cardamoms, cloves and cumin. When they begin to splutter add onions and fry till they turn transparent.\n\n\n" +
                "2.Add ginger garlic paste and fry until the raw smell goes away.\n\n\n" +
                "3.Then put in tomatoes and sprinkle salt. Next fry till they turn mushy.\n\n\n" +
                "4.Next add kasuri methi, garam masala and coriander or cumin powder. Saute until the mixture leaves the sides of the pan.\n\n\n" +
                "5.Pour half cup water and stir. Cook until the mixture thickens.\n\n\n" +
                "6.Next simmer the flame, add the pureed spinach. Mix well and cook until it begins to bubble for about 2 mins.\n\n\n" +
                "7.Add paneer and mix. Switch off.\n\n\n" +
                "8.This step is optional. If using cream add it now. As a substitute to cream, you can soak 10 cashews in warm water for 15 mins and blend to a smooth milk cream consistency.\n\n\n" +
                "9Serve palak paneer with naan, roti or rice.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
