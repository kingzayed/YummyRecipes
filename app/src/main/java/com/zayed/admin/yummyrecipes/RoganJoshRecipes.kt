package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class RoganJoshRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_roganjosh);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 Kg Meat\n\n" +
                "2.1 Cup Mustard/refined oil\n\n" +
                "3.3 tsp Red chili powder\n\n" +
                "4.3 tsp Fennel powder\n\n" +
                "5.2 tsp Ginger powder\n\n" +
                "6.2 tsp Cumin powder\n\n" +
                "7.3 tsp Brown cardamom powder\n\n" +
                "8.1 tsp Asafoetida\n\n" +
                "9.4 Pieces Green cardamom\n\n" +
                "10.2 Cinnamon sticks\n\n" +
                "11.2 Bay leaves\n\n" +
                "12.2 Cloves\n\n" +
                "13.1/3 tsp Saffron (optional)\n\n" +
                "14.1 Cup Curd\n\n" +
                "15.A pinch of Salt";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Wash the meat properly. Heat oil in a pressure cooker.\n\n\n" +
                "2.Put cinnamon, bay leaves, green cardamom, cloves, a teaspoon of salt, asafoetida, and meat together.\n\n\n" +
                "3.Fry meat till it turns brown. Once browned, pour a cup of water.\n\n\n" +
                "4.Add the red chili powder and saffron into the meat. Keep stirring for about a minute.\n\n\n" +
                "5.Mix the curd nicely in the mixer and pour it into the pressure cooker.\n\n\n" +
                "6.Keep on stirring till you get a reddish tinge.\n\n\n" +
                "7.Add 2 cups of water, fennel powder, ginger powder, and pressure cook for 2 minutes.\n\n\n" +
                "8.Check if the meat is tender. Peel and grind green and brown cardamom and add to the meat dish.\n\n\n" +
                "9.Finally sprinkle cumin powder and simmer for a minute and serve.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
