package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class VegCrispyRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vegcrispy);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.Babycorn cut into thick strips 10\n\n" +
                "2.Green Capsicum cut into thick strips 1 large\n\n" +
                "3.Cauliflower 5-6 florets\n\n" +
                "4.Cabbage cut into thick strips 1/4 small\n\n" +
                "5.Oil 2 tablespoons\n\n" +
                "FOR BATTER\n\n" +
                "1.Cornflour/ corn starch 5 tablespoons\n\n" +
                "2.Refined flour (maida) 5 tablespoons\n\n" +
                "3.Ginger-garlic paste 1/2 teaspoon\n\n" +
                "4.MSG optional 1/4 teaspoon\n\n" +
                "5.Lemon juice 1 teaspoon\n\n" +
                "6.Salt to taste\n\n" +
                "7.Black pepper powder to taste\n\n" +
                "FOR SAUCE\n\n" +
                "1.Garlic chopped 4-5 cloves\n\n" +
                "2.Ginger chopped 1 inch piece\n\n" +
                "3.Celery chopped 2-3 inch stalk\n\n" +
                "4.Spring onions chopped 2\n\n" +
                "5.Green chillies chopped 2\n\n" +
                "6.Soy sauce 1 tablespoon\n\n" +
                "7.Red chilli sauce 1 tablespoon\n\n" +
                "8.Tomato ketchup 2 teaspoons\n\n" +
                "9.Salt to taste\n\n" +
                "10.Black pepper powder to taste";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Mix cornflour, refined flour, ginger-garlic paste, MSG, lemon juice, salt and black pepper powder in a bowl with enough water to make a thick batter. Add the vegetables and mix so that all the vegetables are well coated.\n\n\n" +
                "2.Heat enough oil in a wok and deep fry the vegetables. Drain on absorbent paper and set aside. For the sauce heat two tablespoons of oil in a pan. Add garlic, ginger, celery, spring onions and green chillies and sauté for a minute.\n\n\n" +
                "3.Add soy sauce, red chilli sauce, tomato ketchup, salt and black pepper powder and sauté for half a minute. Add all the fried vegetables and mix well. Serve hot." +
                "\n";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
