package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenCrispyRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickencrispy);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);



        String ing = "1.Boneless Chicken cut into very thin strips 400 grams\n\n" +
                "2.Green chillies 4 teaspoons\n\n" +
                "3.Oil for deep-frying\n\n" +
                "4.Salt to taste\n\n" +
                "5.Cornstarch 2 teaspoons\n\n" +
                "6.Onion 1 medium\n\n" +
                "7.Green chillies 4\n\n" +
                "8.Green capsicum cut into strips 1 medium\n\n" +
                "9.Red capsicum cut into strips 1 medium\n\n" +
                "10.Green chilli sauce 1 teaspoon\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Take chicken strips in a bowl.\n\n\n" +
                "2.Heat sufficient oil in a wok.\n\n\n" +
                "3.Add refined flour, salt and cornstarch in the bowl and mix well.\n\n\n" +
                "4.Deep-fry chicken strips in hot oil till golden and crisp.\n\n\n" +
                "5.Cut onion into halves and slice.\n\n\n" +
                "6.Take 4 tsps oil from the wok and add to another non-stick wok on heat.\n\n\n" +
                "7.Slice green chillies lengthwise.\n\n\n" +
                "8.Add onion to the oil and saute. Add green and red capsicum strips and saute well.\n\n\n" +
                "9.Add fried chicken, sliced green chillies, green chilli sauce and salt. Mix well and cook for a minute.\n\n\n" +
                "10.Serve hot";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }

