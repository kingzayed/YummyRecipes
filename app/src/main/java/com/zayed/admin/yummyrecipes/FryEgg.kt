package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class FryEgg extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fryegg);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.4 Eggs\n\n" +
                "2.2 Onions, finely chopped\n\n" +
                "3.2 Tomatoes, chopped\n\n" +
                "4.3 Green chilies or as per taste\n\n" +
                "5.1 Capsicum, chopped\n\n" +
                "6.2 inch Ginger, finely chopped\n\n" +
                "7.1/2 Cup Coriander leaves\n\n" +
                "8.3-4 Curry leaves\n\n" +
                "9.2 Tbsp Vegetable oil or ghee\n\n" +
                "10.1 tsp Jeera\n\n" +
                "11.1 tsp Red chilli powder\n\n" +
                "12.1 tsp Turmeric powder\n\n" +
                "13.As per taste Pav bhaji masala\n\n" +
                "14.A pinch of Asafoetida (hing)\n\n" +
                "15.As per taste Salt\n\n" +
                "16.2 Tbsp Butter (optional)";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.In a large bowl, whisk the eggs using a spoon and keep aside.\n\n\n" +
                "2.Take a pan, add oil or ghee and heat. Now add jeera,\n onions, hing, green chillies, curry leaves, capsicum and ginger.\n Saute for 3-4 minutes..\n\n\n" +
                "3.Add tomatoes and few coriander leaves. Saute for 2 minutes.\n\n\n" +
                "4.Add 1 Tbsp butter, pav bhaji masala, red chilli powder,\n turmeric powder and salt as per taste. Mix well.\n\n\n" +
                "5.Lastly, pour in the slightly beaten eggs and keep whisking until cooked.\n\n\n" +
                "6.Top it up with butter. Garnish with the remaining coriander leaves.\n\n\n" +
                "7.Serve hot with buttered pav.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
