package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Rasmali extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_rasmali);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.250 Gram Paneer (cottage cheese)\n\n" +
                "2.3 Tbsp Semolina (sooji)\n\n" +
                "3.2 Tbsp Refined flour (maida)\n\n" +
                "4.1 Tbsp Cornflour\n\n" +
                "5.2 1/2 Cups Sugar\n\n" +
                "6.2 Litre Milk\n\n" +
                "7.300 Gram Khoya\n\n" +
                "8.1/2 tsp Saffron\n\n" +
                "9.2 Tbsp Reetha powder (with water)\n\n" +
                "10.1 tsp Fresh mint\n\n" +
                "11.2 tsp Pistachios (crushed)\n\n" +
                "12.1 tsp Almonds (crushed)\n\n" +
                "13.1 tsp Pine nuts (crushed)\n\n" +
                "14.3 Pieces Gold vark";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Take fresh paneer, flours, sugar and all ingredients in a bowl and mash well.\n\n\n" +
                "2.Make small balls out of the mixture.\n\n\n" +
                "3.Make a sugar syrup with 1 1/2 cup water and 1/2 cup sugar. Add these small balls to the sugar syrup. Cook for 10 minutes.\n\n\n" +
                "4.To make rabdhi, take 2 ltr milk. Reduce it to 1 1/2 ltr. Then add khoya, 2 cups sugar, saffron and reetha powder. Cook on low flame for 10-15 minutes.\n\n\n" +
                "5.Cool down to room temperature.\n\n\n" +
                "6.Then add the small balls to this rabdhi, and put in refrigerator to chill.\n\n\n" +
                "7.Sprinkle mint and crushed nuts on rabdhi. Put golden vark on top.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
