package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Omlette extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_omlet);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1/2 onion chopped\n\n" +
                "2.1 tomato chopped\n\n" +
                "3.2 green chilies chopped\n\n" +
                "4.3 Tbsp olive oil\n\n" +
                "5.3 eggs\n\n" +
                "6.Salt and pepper to flavor\n\n" +
                "7.2 Tbsp butter\n\n" +
                "8.Handful fresh coriander leaves\n\n" +
                "9.Handful spring onions chopped\n\n" +
                "10.Handful grated cheese\n\n" +
                "11.Burger bun";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat olive oil in a pan and add onion, tomato and green chilies.\n\n\n" +
                "2.Let the vegetables sweat lightly then turn down the heat and let the vegetables cook.\n\n\n" +
                "3.Then break 3 eggs and whisk them nicely.\n\n\n" +
                "4.Add salt and pepper to flavor.\n\n\n" +
                "5.Mix the eggs and the vegetable and saute them.\n\n\n" +
                "6.Then heat the pan with butter and pour the mixture in the pan.\n\n\n" +
                "7.Sprinkle fresh coriander leaves, spring onions and grated cheese on the mixture and let it fry.\n\n\n" +
                "8.Make two folds of the omelette.\n\n\n" +
                "9.Turn off the heat and add butter under the omelet.\n\n\n" +
                "10.Serve with a toasted bun and garnish with fresh coriander.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
