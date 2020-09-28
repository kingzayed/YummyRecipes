package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MuttonPuloaRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_muttonpuloa);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.350 gm mutton/lamb - chops-pricked\n\n" +
                "2.2 cups rice - washed and soaked\n\n" +
                "3.4 black cardamoms\n\n" +
                "4.1 tsp peppercorns\n\n" +
                "5.4 whole red chillies\n\n" +
                "6.6 cloves\n\n" +
                "7.1 inch piece cinnamon-broken roughly\n\n" +
                "8.4 tbsp ghee\n\n" +
                "9.1 cup onions - sliced uniformly\n\n" +
                "10.1 tsp salt\n\n" +
                "11.1 tsp kashmiri chilli powder\n\n" +
                "12.1 tsp all spice - powdered\n\n" +
                "13.2 cups hot water - for the rice\n\n" +
                "14.Pinch of food colour";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat the ghee in a pan and add the cardamom, peppercorns, red chillies and cloves.\n\n\n" +
                "2.When they darken a bit, add the onions and cook till transparent.\n\n\n" +
                "3.Add the meat, salt and chilli powder, all spice.\n\n\n" +
                "4.Stir fry till meat is opaque and add two cups of water.\n\n\n" +
                "5.Bring to a boil and lower the heat and cook covered till meat is tender.\n\n\n" +
                "6.Strain the meat and keep aside.\n\n\n" +
                "7.Measure the liquid and make up to three cups by adding hot water.\n\n\n" +
                "8.Mix liquid, meat and rice together.\n\n\n" +
                "9.Bring to a boil, lower the heat and cook covered for five minutes.\n\n\n" +
                "10.Sprinkle the colour in a trail and continue to cook covered for seven minutes. Serve hot.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
