package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class VegSpringRoll extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vegspringroll);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "For the pancakes:\n\n" +
                "1.1/2 cup flour\n\n" +
                "2.1 egg\n\n" +
                "3.1/4 tsp salt\n\n" +
                "4.1/4 cup water\n\n" +
                "5.1/4 cup milk\n\n" +
                "6.3 Tbsp oil mix the water, oil and milk together\n\n" +
                "For the filling:\n\n" +
                "1.1 cup thinly shredded cabbage\n\n" +
                "2.1 cups spring onions-including leaves, finely chopped\n\n" +
                "3.1 cup thinly shredded carrot\n\n" +
                "4.1/2 tsp salt\n\n" +
                "5.2 Tbsp oil\n\n" +
                "6.4 cloves garlic-very finely chopped\n\n" +
                "7.1 tsp soya sauce\n\n" +
                "8.2 Tbsp celery-chopped fine\n\n" +
                "9.1 Tbsp flour, made into thin paste by adding water\n\n" +
                "10.Oil for deep frying";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Make the pancakes with the pancake ingredients.\n\n\n" +
                "2.Heat the 1 tbsp oil and stir-fry the garlic and onions over high heat till the onions are a little soft.\n\n\n" +
                "3.Add the rest of the filling ingredients and turn around a few times, still over a high heat.\n\n\n" +
                "4.Take a pancake and place a heaped tbsp of filling towards one edge.\n\n\n" +
                "5.Fold that edge over the filling, then the two sides thus formed over the fold, and roll over till the end, sealing that edge with the flour paste.\n\n\n" +
                "6.It is very important to seal the filling in, so that it does not spill out while frying. Double fry the pancakes.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
