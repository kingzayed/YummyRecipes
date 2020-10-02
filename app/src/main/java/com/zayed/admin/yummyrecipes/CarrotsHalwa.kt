package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class CarrotsHalwa extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_carrotshalwa);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 kg carrots, grated\n\n" +
                "2.1 liter almond milk\n\n" +
                "3.8 green cardamom pods,\n\n" +
                "4.Date paste, to taste\n\n" +
                "5.1-2 Tbsp cashew nut paste, optional\n\n" +
                "6.7-8 raisins\n\n" +
                "7.Blanched almonds, for garnishing\n\n" +
                "For the almond milk:\n\n" +
                "1.1 cup almonds\n\n" +
                "2.1 litre warm-hot water\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "For the almond milk:\n\n\n" +
                "1.Place almonds to soak in water. You can pre-soak the almonds for four hours in cold water or use hot water.\n\n\n" +
                "2.Peel the soaked almonds if you like.\n\n\n" +
                "3.Place the almonds and water into a blender.\n\n\n" +
                "4.Sieve through a fine mesh cloth and squeeze out all the milk.\n\n\n" +
                "For the date paste:\n\n\n" +
                "1.Soak as many dates as you would like in water.\n\n\n" +
                "2.Put them in a container with a lid and let them sit in the refrigerator for a few hours. Drain off and reserve the soaking liquid.\n\n\n" +
                "3.Place dates and a little of the soaking liquid in a blender or food processor and blend until smooth and consistent, adding soaking water if necessary.\n\n\n" +
                "4.Date paste will last in your refrigerator for weeks, and can be used as a replacement for sweetener in a recipe.\n\n\n" +
                "For the halwa:\n\n\n" +
                "1.In a stainless steel heavy bottom pan add grated carrots.\n\n\n" +
                "2.Pour the almond milk into the carrots, add cardamom pods and cook until all liquid has reduced. This will take about 30 - 40 minutes.\n\n\n" +
                "3.Add date paste. Stir occasionally.\n\n\n" +
                "4.Add cashew nut paste if using.\n\n\n" +
                "5.Add raisins, top with almonds.\n\n\n" +
                "6.Serve warm or cold.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
