package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MalabharFish extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_malabharfish);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.40 Gram Whole coriander seeds\n\n" +
                "2.60 Gram Whole red chilli\n\n" +
                "3.10 Ml Coconut oil\n\n" +
                "4.1 Gram Mustard seeds\n\n" +
                "5.10 Gram Onion, chopped\n\n" +
                "6.3-4 Nos Curry leaf\n\n" +
                "7.20 Ml Coconut milk\n\n" +
                "8.5 Ml Tamarind pulp\n\n" +
                "9.5 Gram Coriander, chopped\n\n" +
                "10.120 Gram Seabass fish curry cuts";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Soak whole coriander seeds and whole begdi chilli together for 3 to 4 hrs at least.\n\n" +
                "2.Boil soaked ingredients, after boiling make a paste, and strain it.\n\n" +
                "3.Take a pan, add coconut oil, mustard seeds, curry leaves and chopped onions, cook it till translucent.\n\n" +
                "4.Put the strained paste, cook it well and add fish curry cuts in the gravy.\n\n" +
                "5.Finish with coconut milk and tamarind pulp.\n\n" +
                "6.Garnish with chopped coriander and fried curry leaves.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
