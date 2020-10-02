package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class BeanCurry extends Activity {
    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_beancurry);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 cups beans chopped (french beans or cluster beans or long beans)\n\n" +
                "2.1 handful moong dal , pesara pappu\n\n" +
                "3.½ tsp ginger , crushed . (optional)\n\n" +
                "4.1/3 cup tomato or 1 large red and ripe tomato (chopped)\n\n" +
                "5.1 sprig Coriander leaves , chopped\n\n" +
                "6.1/8 tsp turmeric\n\n" +
                "7.Salt to taste\n\n" +
                "8.½ to ¾ tsp red chili powder\n\n" +
                "9.1 sprig curry leaves\n\n" +
                "10.½ tsp cumin /jeera\n\n" +
                "11.1 Pinch mustard seeds\n\n" +
                "12.Oil as needed\n\n" +
                "13.1 Pinch hing";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Wash and soak moong dal in enough water for at least 30 minutes. Make sure it is soaked thoroughly.\n\n\n" +
                "2.Add water to a pressure cooker, add chopped beans to a bowl without adding any water. Place this bowl in the pressure cooker and cook for 2 whistles.\n\n\n" +
                "3.Heat a pan with oil, add mustard, jeera and curry leaves, let them splutter, then add hing and ginger if using, saute.\n\n\n" +
                "4.Add tomatoes, salt and turmeric. Fry the tomatoes till they turn fully mushy. After that cook for another 2 mins.\n\n\n" +
                "5.Add the dal, beans, chili powder and salt as needed.\n\n\n" +
                "6.Mix well and fry for 2 to 3 mins. If there is any stock left after cooking beans, just pour it and increase the flame to evaporate that water.\n\n\n" +
                "7.Close the lid and cook for 2 to 3 mins till the beans turn tender and blend well with the tomato and chili powder. Also make sure dal is cooked fully.\n\n\n" +
                "8.Add coriander leaves, coconut if desired. beans curry is ready.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
