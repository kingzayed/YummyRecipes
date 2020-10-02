package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MasalaDosa extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dosa);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 Cups Rice (preferably parboiled)\n\n" +
                "2.1/2 Cup Black Gram (Dhuli Urad)(split and husked)\n\n" +
                "3.1/2 tsp Fenugreek seeds\n\n" +
                "4.2 tsp Salt\n\n" +
                "5.For cooking dosas Oil\n\n" +
                "For the Masala for Dosas:\n\n" +
                "1.500 Gram Potatoes (peeled and cubed), boiled\n\n" +
                "2.1 1/2 Cups Onions, sliced\n\n" +
                "3.2 Green chillies (optional), finely chopped\n\n" +
                "4.2 Tbsp Oil\n\n" +
                "5.1 tsp Mustard seeds\n\n" +
                "6.6-7 Curry leaves\n\n" +
                "7.2 tsp Salt\n\n" +
                "8.1/4 tsp Turmeric, powdered\n\n" +
                "9.1/2 Cup Water";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Wash and soak the rice in one container and the dal and\n fenugreek seeds together in another container\n for 5-6 hours or over night, depending on the weather.\n\n\n" +
                "2.Grind dal mixture together to a very smooth consistency.\n Next grind the rice smooth too and mix the two batters.\n\n\n" +
                "3.Add salt and enough water to make into a dropping consistency.\n Leave to ferment over-night or more depending on the weather,\n till a little spongy.\n\n\n" +
                "4.If thickened too much, add a little water to thin a bit.\n Heat tawa, and brush oil over it. When really hot, splash a little water over it,\n and immediately pour batter onto it, spreading it thin,\n with a circular motion.\n\n\n" +
                "5.This will have to be very swift and will need a bit of practice.\n\n\n" +
                "6.After spreading the batter, lower the heat and dribble a little oil\n around the edges so that it seeps under the dosa.\n\n\n" +
                "7.When edges start browning a bit, pass a flat spoon under it to ease the dosa off the pan.\n Put desired filling in the center, and fold the two edges over.\n\n\n" +
                "8.Serve accompanied with sambhar and chutney.\n\n\n" +
                "Prepare the masala filling:\n\n\n" +
                "1.Heat the oil in a heavy based pan and add the mustard seeds, then onions,\n curry leaves and green chillies,\n and saute over high heat till the onions\n are a little transparent.\n\n\n" +
                "2.Add the salt and the turmeric and mix well, before adding the potatoes.\n\n\n" +
                "3.Turn the potatoes around till well mixed,\n and add the water, and let it simmer, for 2-3 minutes.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
