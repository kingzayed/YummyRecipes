package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class GrilledSalmon extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_grillsalmon);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.220 Gram Salmon\n\n" +
                "2.1 Tbsp Honey\n\n" +
                "3.To taste Salt and Pepper\n\n" +
                "4.1 tsp Olive oil\n\n" +
                "5.30 Ml Bourbon whiskey (for flambe)\n\n" +
                "6.80 Gram Roasted vegetables\n\n" +
                "7.1/2 tsp Celery salt\n\n" +
                "8.50 Ml Buttermilk fluid\n\n" +
                "9.20 Gram Vettiver";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "Prepare Buttermilk Fluid:\n\n\n" +
                "1.Take 60 ml buttermilk, add a pinch of xantana and kappa.\n\n\n" +
                "2.Then add a pinch of salt and pepper for seasoning. Blend together. Serve along with salmon.\n\n\n" +
                "Prepare Salmon:\n\n\n" +
                "1.Marinate the salmon with honey, salt and pepper.\n\n\n" +
                "2.Keep it aside and arrange it on top of stones with roasted vegetables.\n\n\n" +
                "3.Sprinkle celery salt on the salmon and cook it in front of the guest with blowtorch and flambé it with bourbon whiskey.\n\n\n" +
                "4.Serve along with the buttermilk fluid or lemon butter sauce.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
