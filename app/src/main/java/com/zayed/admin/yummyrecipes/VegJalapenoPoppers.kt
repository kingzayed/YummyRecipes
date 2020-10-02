package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class VegJalapenoPoppers extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_jalpanenopoppers);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.100gms - Cream cheese softened\n\n" +
                "2.100gms - shredded cheddar cheese\n\n" +
                "3.5 Jalapeno peppers, seeded and halved\n\n" +
                "4.100ml - Milk\n\n" +
                "5.50gms - all-purpose flour\n\n" +
                "6.50gms - bread crumbs\n\n" +
                "7.200ml - oil for frying";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.In a medium bowl, mix the cream cheese, Cheddar cheese.\n\n\n" +
                "2.Stuff mixture into the jalapeno pepper halves.\n\n\n" +
                "3.Dip the stuffed jalapenos first into the milk then into the flour.\n\n\n" +
                "4.Dry for about 10 minutes.\n\n\n" +
                "5.Dip the jalapenos in milk again and then the breadcrumbs.\n\n\n" +
                "6.Allow them to dry, ensure the entire surface is coated.\n\n\n" +
                "7.Deep fry the coated jalapenos 5 minutes each, until golden brown.\n\n\n" +
                "8.Remove and let drain on a paper towel.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
