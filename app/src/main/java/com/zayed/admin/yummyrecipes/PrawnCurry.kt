package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class PrawnCurry extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_prawncurry);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.700 gms prawns\n\n" +
                "2.250 gms curd\n\n" +
                "3.5 gms yellow chilli powder\n\n" +
                "4.200 gms onions\n\n" +
                "5.30 gms ginger garlic paste\n\n" +
                "6.50 gms oil\n\n" +
                "7.5 gms red chilli powder\n\n" +
                "8.2 gms fenugreek seeds\n\n" +
                "9.5 gms fenugreek leaves\n\n" +
                "10.5 gms turmeric powder\n\n" +
                "11.5 gms garam masala powder\n\n" +
                "12.Coriander, chopped\n\n" +
                "13.Ginger juliennes to garnish\n\n" +
                "14.Desi ghee\n\n" +
                "15.Salt to taste";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Clean and wash the prawns, set aside.\n\n\n" +
                "2.Heat oil in a pan, add fenugreek seeds followed by ginger-garlic paste. Saute it all for a while, at least till the aroma goes away.\n\n\n" +
                "3.Add chopped onions, fry till they turn translucent.\n\n\n" +
                "4.Now, add the red chilli, turmeric powder, fenugreek leaves and garam masala. Saute for a few minutes.\n\n\n" +
                "5.Once the masalas have blended well, add prawns.\n\n\n" +
                "6.Add whisked yogurt and stir continuously to avoid curdling.\n\n\n" +
                "7.Pour ghee on top of the curry, season with salt. Garnish with coriander leaves and ginger juliennes.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
