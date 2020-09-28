package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenBurger extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenburger);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.250 Gram Minced Chicken\n\n" +
                "For frying Oil\n\n" +
                "1.2 Onions, chopped\n\n" +
                "2.2 Tbsp Coriander, chopped\n\n" +
                "3.1 tsp Garlic, chopped\n\n" +
                "4.3 Tbsp Salt\n\n" +
                "5.3 tsp Chilli flakes\n\n" +
                "6.3 tsp Black pepper\n\n" +
                "7.1 Egg\n\n" +
                "8.3 Tbsp Bread crumbs\n\n" +
                "9.2 Tbsp Mayonnaise\n\n" +
                "10.4 Burger Buns\n\n" +
                "11.2 Lettuce";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Pour some oil in a pan.\n\n\n" +
                "2.Put freshly chopped onions in it and fry until golden brown.\n\n\n" +
                "3.Take another bowl and add minced chicken to it.\n\n\n" +
                "4.Along with it add coriander, salt, chilli flakes, black pepper, garlic and fried onions.\n\n\n" +
                "5.Crack an egg into the bowl and mix it all well together with your hands.\n\n\n" +
                "6.Add bread crumbs to the mixture.\n\n\n" +
                "7.Make round patties of the mixture using your hand and pan fry it until golden brown.\n\n\n" +
                "8.Take the buns and add butter/mayonnaise, lettuce and onion or any other filling of your choice.\n\n\n" +
                "9.Put the fried patties between the buns. Serve hot.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
