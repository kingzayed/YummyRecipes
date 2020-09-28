package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenFriedRice extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenfriedrice);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1/2 Kg Long Grained Rice, boiled\n\n" +
                "2.4-5 Tbsp Cooking Oil\n\n" +
                "3.150 Gram Boneless Chicken (diced)\n\n" +
                "4.100 Gram Prawns (deshelled)\n\n" +
                "5.2 Small Onions , finely chopped\n\n" +
                "6.4 Pieces Garlic, finely chopped\n\n" +
                "7.4 Red Chillies (grounded)\n\n" +
                "8.4-5 Tbsp Sweet Soya Sauce\n\n" +
                "9.To taste Salt\n\n" +
                "10.To taste Pepper\n\n" +
                "11.For garnishing Fried eggs\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Boil rice and keep aside.\n\n\n" +
                "2.Heat oil in a pan and saute the onion and garlic until golden brown.\n\n\n" +
                "3.Add chicken and cook.\n\n\n" +
                "4.Sprinkle in salt and pepper.\n\n\n" +
                "5.When the chicken is almost done add the red chillies and then toss in the prawns.\n\n\n" +
                "6.Stir fry for a few minutes.\n\n\n" +
                "7.Add the sweet soya sauce and mix in the cooked rice.\n\n\n" +
                "8.In another pan, make a double fried egg.\n\n\n" +
                "9.Serve rice hot with a fried egg on top.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
