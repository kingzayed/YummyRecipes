package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class SalmonFryRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_salmonfry);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.Salmon Fish -1 lb\n\n\n" +
                "2.Red chili powder - 1&1/2 tsp\n\n\n" +
                "3.Coriander powder - 2 tsp\n\n\n" +
                "4.Turmeric powder - 1/4 tsp\n\n\n" +
                "5.Ginger garlic paste - 1 tbsp\n\n\n" +
                "6.Lemon - 1\n\n\n" +
                "7.Curry leaves - 1 tsp(finely minced)\n\n\n" +
                "8.Salt - to salt\n\n\n" +
                "9.Oil - for shallow frying(i have used about 2 tbsp)";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.First clean the salmon well and cut into desired size. Now in a plate,add the spices (turmeric,chili & coriander powder),salt & ginger garlic paste.Mix it well.\n\n\n" +
                "2.Then add the curry leaves and squeeze the lemon juice into the spices and mix it well.\n\n\n" +
                "3.Apply the masala evenly on all the fish pieces ,cover it and let it rest for 2 hrs.Then heat the oil in a kadai for deep frying.\n\n\n" +
                "4.Place the fish on the kadai and cook it on medium flame for 3-4 mins on each sides.Remove it on the plate.\n\n\n" +
                "5.That's it, Tasty and flavorful fish fry is ready.";

        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
