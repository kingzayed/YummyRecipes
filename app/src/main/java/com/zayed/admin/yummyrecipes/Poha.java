package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Poha extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_poha);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 Cup Poha/chivda (pressed rice)\n\n" +
                "2.1 Tbsp Oil\n\n" +
                "3.1/8 tsp Asafoetida\n\n" +
                "4.1 tsp Mustard seeds\n\n" +
                "5.1/2 Cup Onions, finely chopped\n\n" +
                "6.8-10 Curry leaves\n\n" +
                "7.2-3 Whole red chillies\n\n" +
                "8.1/2 Cup Potatoes (diced small)\n\n" +
                "9.1/2 tsp Turmeric\n\n" +
                "10.2 tsp Salt\n\n" +
                "11.1 tsp Green chillies, finely chopped\n\n" +
                "12.1 Tbsp Lemon juice\n\n" +
                "13.1 Tbsp Coriander leaves, chopped\n\n" +
                "14.For garnish Lemon wedges";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Put poha in a colander and wash, not letting it soak too long in the water.\n Leave in the colander to drain out completely.\n\n\n" +
                "2.Heat the oil and add the asafoetida, mustard seeds, curry leaves and onions\n along with whole red chillies.\n\n\n" +
                "3.When onions are light brown, add potatoes, and turn around till they look a bit glossy.\n\n\n" +
                "4.Add the turmeric and sauté over low heat till the potatoes are cooked through.\n\n\n" +
                "5.Increase the heat, add salt and poha and mix well. Saute till mixed and heated through.\n\n\n" +
                "6.Shut off the heat, and mix in the green chillies, lemon juice and half of the coriander.\n\n\n" +
                "7.Transfer on to a serving dish, garnish with the rest of the coriander and lemon wedges and serve.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
