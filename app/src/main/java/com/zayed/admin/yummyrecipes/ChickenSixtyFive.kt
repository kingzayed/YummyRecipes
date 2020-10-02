package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenSixtyFive extends Activity
{
    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickensixfive);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);



        String ing = "1.250 grams chicken boneless and tender\n\n" +
                "2.1 egg white (optional, refer notes) or whole egg for half kg chicken\n\n" +
                "3.2 tbsp Corn flour\n\n" +
                "4.1 tbsp rice flour or cornflour\n\n" +
                "5.oil for deep frying\n\n" +
                "marination:\n\n" +
                "1.½ tbsp ginger garlic paste\n\n" +
                "2.½ tsp red chili powder\n\n" +
                "3.1 ½ tbsp curd (don’t use sour curd)\n\n" +
                "4.½ tsp pepper powder\n\n" +
                "5.1/8 tsp turmeric\n\n" +
                "6.Salt to taste (about 1/8 tsp)\n\n" +
                "Seasoning for chicken 65 recipe:\n\n" +
                "1.½ tsp cumin or jeera\n\n" +
                "2.1 sprig Curry leaves\n\n" +
                "3.½ tsp garlic chopped\n\n" +
                "4.2 green chilies sliced\n\n" +
                "5.½ tsp pepper powder\n\n" +
                "Seasoning mixture to coat the chicken:\n\n" +
                "1.¾ tsp red chili powder\n\n" +
                "2.½ tsp sugar (removes pungent taste from garlic)\n\n" +
                "3.2 cloves garlic paste\n\n" +
                "4.¼ tsp Salt - use as per your taste\n\n" +
                "5.2 tbsp curd thick (or 1 tsp vinegar with 2 tbsp. water)\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat oil in a deep pan until hot enough.\n\n\n" +
                "2.Fry the chicken until cooked fully and golden. Stir while frying for even frying. Drain them on a kitchen tissue.\n\n\n" +
                "3.Heat a pan with 1 tbsp. oil.\n\n\n" +
                "4.Add curry leaves, green chilies and cumin.  Fry till the leaves turn crisp. You can set aside few for garnish.\n\n\n" +
                "5.Next pour the chili garlic seasoning mixture we prepared above. Let it begin to bubble.\n\n\n" +
                "6.Add the fried chicken and toss. \n\n\n" +
                "7.Fry on medium heat till it absorbs all the moisture and the raw smell of garlic disappears. Over frying can make the it hard. So turn off in time.\n\n\n" +
                "8.Serve chicken 65 with onion wedges.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }

