package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenHakkaNoodles extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenhakkanoodles);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.150 g Egg Noodles\n\n" +
                "2.2 tbsp Sesame Oil\n\n" +
                "3.2 tsp Garlic Minced\n\n" +
                "4.1/2 cup Onion Cut into cubes\n\n" +
                "5.3-4 Green Chillies Slit Into half\n\n" +
                "6.1/4 cup White part of Spring Onion Sliced\n\n" +
                "7.2 tbsp Celery Chopped\n\n" +
                "8.1/4 cup Carrot Julienned\n\n" +
                "9.1/4 cup Capsicum Cut into thin stripes\n\n" +
                "10.2 Eggs Whisked\n\n" +
                "11.1 cup Boiled Chicken Shredded\n\n" +
                "12.1 tbsp Soy Sauce\n\n" +
                "13.1 tsp Vinegar\n\n" +
                "14.1 tsp Bira 91 Hot Sauce\n\n" +
                "15.1 tsp Green Chilli sauce\n\n" +
                "16.Salt to taste\n\n" +
                "17.1/2 tsp Black pepper Powder\n\n" +
                "18.2 tbsp Spring Onion Greens Chopped\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat sesame oil in a wok.\n\n\n" +
                "2.Once the oil is hot, add garlic and fry for a few seconds.\n\n\n" +
                "3.Add onion, green chillies, white part of spring onion and celery and fry for a minute.\n\n\n" +
                "4.Add carrot, capsicum and cabbage and fry for another minute.\n\n\n" +
                "5.Push the veggies on one side of the wok and add the eggs in the wok.\n\n\n" +
                "6.Mix until they scramble.\n\n\n" +
                "7.Now mix everything up.\n\n\n" +
                "8.Add boiled chicken, soy sauce, vinegar, Bira 91 Hot Sauce, green chilli sauce and boiled noodles and toss nicely.\n\n\n" +
                "9.Add salt to taste and black pepper powder and mix well.\n\n\n" +
                "10.Garnish with spring onion greens.\n\n\n" +
                "11.Serve hot.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
