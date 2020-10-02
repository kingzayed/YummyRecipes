package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenShawarma extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenshawarma);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.8 Boneless chicken thighs (skinless)\n\n" +
                "For the marinade:\n\n" +
                "1.1/2 Cup Malt vinegar\n\n" +
                "2.1/4 Cup Plain yogurt\n\n" +
                "3.1 Tbsp Vegetable oil\n\n" +
                "4.To taste Salt and pepper\n\n" +
                "5.1/4 tsp Freshly ground cardamom\n\n" +
                "6.1 tsp All spice\n\n" +
                "For the sauce:\n\n" +
                "1.1/2 Cup Tahini\n\n" +
                "2.1/4 Cup Plain yogurt\n\n" +
                "3.1/2 tsp Garlic (minced)\n\n" +
                "4.2 Tbsp Lemon juice\n\n" +
                "5.1 Tbsp Olive oil\n\n" +
                "6.1 Tbsp Fresh parsley, chopped\n\n" +
                "7.To taste Salt and pepper\n\n" +
                "For plating:\n\n" +
                "1.4 Medium Tomatoes, sliced\n\n" +
                "2.1/2 Cup Onion, sliced\n\n" +
                "3.4 Cups Lettuce, shredded\n\n" +
                "4.8 Pita bread rounds";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.In a glass baking dish, mix together the malt vinegar, 1/4 cup yogurt, vegetable oil, mixed spice, cardamom, salt and pepper.\n\n\n" +
                "2.Place the chicken thighs into the mixture and turn to coat. Cover and marinate in the refrigerator for at least 4 hours or overnight.\n\n\n" +
                "3.Preheat the oven to 350 degrees F (175 degrees C).\n\n\n" +
                "4.In a small bowl, mix together the tahini, 1/4 cup yogurt, garlic, lemon juice, olive oil, and parsley.\n\n\n" +
                "5.Season with salt and pepper, taste, and adjust flavors if desired. Cover and refrigerate.\n\n\n" +
                "6.Cover the chicken and bake in the marinade for 30 minutes, turning once.\n\n\n" +
                "7.Uncover, and cook for an additional 5 to 10 minutes, or until chicken is browned and cooked through.\n\n\n" +
                "8.Remove from the dish, and cut into slices.\n\n\n" +
                "9.Place sliced chicken, tomato, onion, and lettuce onto pita breads.\n\n\n" +
                "10.Roll up, and top with tahini sauce.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
