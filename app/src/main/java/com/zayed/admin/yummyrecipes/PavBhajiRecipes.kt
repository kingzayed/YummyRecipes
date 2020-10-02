package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class PavBhajiRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pavbhaji);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 tsp Oil\n\n" +
                "2.4 cubes Large Butter, finely chopped\n\n" +
                "3.1 Cup Onion, chopped\n\n" +
                "4.1 tsp Ginger-Garlic paste\n\n" +
                "5.1/2 Cup Lauki, chopped\n\n" +
                "6.1/2 Cup Capsicum, chopped\n\n" +
                "7.1 Cup Potatoes, chopped\n\n" +
                "8.1/2 Cup Beetroot, chopped\n\n" +
                "9.2 tsp Salt\n\n" +
                "10.1 tsp Chili powder\n\n" +
                "11.3 tsp Pav Bhaji Masala\n\n" +
                "12.1 tsp Red chili powder\n\n" +
                "13.1/2 Cup Tomato puree\n\n" +
                "14.1 cube To taste Butter\n\n" +
                "15.1 Bunch Coriander leaves\n\n" +
                "For Pav:\n\n" +
                "Butter\n\n" +
                "Pav Bhaji masala\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat oil in a pan. Add cubes of butter along with onionPav Bhaji\n\n\n" +
                "2.Saute till golden brown and then add ginger garlic paste. Mix well.Pav Bhaji\n\n\n" +
                "3.Now add chopped lauki along with coriander and mix well, followed by a cup of chopped potatoes. Mix and mash well together.Pav Bhaji\n\n\n" +
                "4.Add chopped beetroot, salt, chilli powder and pav bhaji masala to the mashed mixture. Mix well.Pav Bhaji\n\n\n" +
                "5.Now add the tomato puree.Pav Bhaji\n\n\n" +
                "6.Mix the tomato puree thoroughly and then add butter followed by coriander leaves to the cooked bhaaji. Mix thoroughly.Pav Bhaji\n\n\n" +
                "Prepare Pav:\n\n\n" +
                "1.Spread some butter all over the pav.Pav Bhaji\n\n\n" +
                "2.Sprinkle pav bhaji masala over it.Pav Bhaji\n\n\n" +
                "3.Toast it on the pan for a while till it becomes golden brown.Pav Bhaji\n\n\n" +
                "4.Serve hot along with a lemon wedge, chopped onion and green chilli.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
