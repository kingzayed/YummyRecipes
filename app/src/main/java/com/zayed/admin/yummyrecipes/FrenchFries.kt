package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class FrenchFries extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frenchfries);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.250 Gram Potatoes (sliced), peeled\n\n" +
                "2.1 Tbsp Salt\n\n" +
                "3.For deep frying Oil\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Pour around 4 cups of water, enough to cover the potatoes, sprinkle with salt and boil.\n\n\n" +
                "2.Slice the potatoes to a width of your choice. You can either opt for fat french fries or thin ones.\n\n\n" +
                "3.When the water comes to boil, plonk the potatoes and switch off the gas. Now, leave the potatoes for 5 to 6 minutes.\n\n\n" +
                "4.Drain the water and put the potatoes on a tissue or dry cloth. Let them dry or if you're in a hurry dab it with a tissue to dry off the water.\n\n\n" +
                "5.Heat the oil till you can see small bubbles on the side. Now add the potatoes, one by one. Make sure the potatoes have enough space and aren't stacked on top of each other.\n\n\n" +
                "6.Lower the heat to medium and fry till almost cooked but not brown.\n\n\n" +
                "7.Lift the potatoes out of the oil and let the rest of it drain.\n\n\n" +
                "8.Just before serving fry over high heat, till a golden brown and serve.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
