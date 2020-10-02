package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class BadamKheer extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_badamkheer);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 tin (400g)-NESTLÉ MILKMAID Sweetened Condensed Milk\n\n" +
                "2.1 litre-Milk\n\n" +
                "3.50 g-Badam (Almonds)\n\n" +
                "4.50 g-Kaju (Cashewnuts)\n\n" +
                "5.1/4 tsp-Almond Essence\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Blanch almonds and remove skin. Soak almonds and cashewnuts in 2 cups of hot milk for 30 minutes. Grind to a paste along with milk.\n\n\n" +
                "2.Heat the remaining milk to boil. Add NESTLÉ MILKMAID Sweetened Condensed Milk and the ground almond paste and cook for another 5 minutes with constant stirring.\n\n\n" +
                "3.Remove from fire and add almond essence. Serve hot or cold.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
