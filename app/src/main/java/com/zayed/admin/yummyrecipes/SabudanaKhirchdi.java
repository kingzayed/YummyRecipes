package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class SabudanaKhirchdi extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sabudana);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 Cup Sabudana\n\n" +
                "2.1 Cup Peanuts\n\n" +
                "3.1/4 tsp Black Salt\n\n" +
                "4.2 tsp Ghee\n\n" +
                "5.1 tsp Cumin Seeds\n\n" +
                "6.1 1/2 Potatoes (Boiled)\n\n" +
                "7.1/2 tsp Salt\n\n" +
                "8.1 tsp Green Chillies, chopped\n\n" +
                "9.1/2 tsp Black Salt\n\n" +
                "10.1/2 tsp Black Pepper\n\n" +
                "11.1 Tbsp Coriander Leaves";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Soak sabudana in a bowl for 2 hours.\n\n\n" +
                "2.After 2 hours, drain the water, squeeze and refrigerate for an hour.\n\n\n" +
                "3.Take soaked sabudana in another bowl and add crushed peanuts and black salt to it.\n\n\n" +
                "4.Mix well.\n\n\n" +
                "5.Now take ghee in a pan, add cumin seeds and saute a little.\n\n\n" +
                "6.Add black pepper and Sabudana-peanut mix to the pan, sprinkle some black pepper again on top.\n\n\n" +
                "7.Mix well and serve with garnishing of coriander leaves.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
