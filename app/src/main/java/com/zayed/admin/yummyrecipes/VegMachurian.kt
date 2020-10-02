package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class VegMachurian extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vegmachurian);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "For vegetable balls:\n\n" +
                "1.1/2 Cup Cabbage\n\n" +
                "2.1/2 Cup Carrot\n\n" +
                "3.1/2 Cup Capsicum\n\n" +
                "4.1/2 Cup Spring onion\n\n" +
                "5.1 tsp Ginger\n\n" +
                "6.1 tsp Garlic\n\n" +
                "7.3 Tbsp Corn flour\n\n" +
                "8.2 Tbsp Maida\n\n" +
                "9.2 tsp Salt\n\n" +
                "10.2 tsp Black pepper\n\n" +
                "11.1 tsp Soy sauce\n\n" +
                "12.1 Tbsp Water\n\n" +
                "For manchurian sauce:\n\n" +
                "1.Oil\n\n" +
                "2.2 Tbsp Garlic\n\n" +
                "3.1 Tbsp Ginger\n\n" +
                "4.1 tsp Green chilli\n\n" +
                "5.2 Tbsp Spring onion\n\n" +
                "6.2 Tbsp Tomato ketchup\n\n" +
                "7.2 Tbsp Chilly sauce\n\n" +
                "8.1 tsp Soya sauce\n\n" +
                "9.1 tsp Vinegar\n\n" +
                "10.1 1/2 Tbsp Salt\n\n" +
                "11.1 Tbsp Black pepper\n\n" +
                "12.3 Tbsp Corn flour\n\n" +
                "13.1 Cup Water";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "To prepare the vegetable balls:\n\n\n" +
                "1.Take all the veggies, finely chopped, in a bowl along with ginger, garlic, corn flour, maida, salt, black pepper and soy sauce.\n\n\n" +
                "2.Mix them well, adding water as required for consistency.\n\n\n" +
                "3.Make round balls out of the thick vegetable mixture.\n\n\n" +
                "4.Now deep fry the vegetable balls in a pan.\n\n\n" +
                "Prepare the sauce:\n\n\n" +
                "1.Heat some oil in a pan and roast ginger, garlic and green chilli in it for a while\n\n\n" +
                "2.Add spring onion, tomato ketchup, chilly sauce, soya sauce and vinegar followed by salt and black pepper.\n\n\n" +
                "3.Mix them well and add a mixture of corn flour plus water to the pan.\n\n\n" +
                "4.Mix thoroughly and put the fried vegetable balls into the mixture.\n\n\n" +
                "5.Properly mix the balls along with the sauce.\n\n\n" +
                "6.Garnish with spring onion and celery. Serve hot along with cooked rice.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
