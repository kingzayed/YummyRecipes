package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Nutella extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_nutella);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 cups heavy whipping cream\n" +
                "2.2/3 cup chocolate milk\n" +
                "3.3/4 cup Nutella or any chocolate hazelnut spread will work\n" +
                "4.3/4 cup white granulated sugar\n" +
                "5.1/2 teaspoon vanilla extract\n" +
                "6.Pinch of salt\n" +
                "7.1 to 1 1/2 cups Oreo cookies I used double stuffed, crumbled, between 10-13 Oreos";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.In a blender, I used my Blendtec blender puree Nutella, sugar, cream, salt, and vanilla until creamy and smooth. Set the blender in the fridge and chill the mixture in the refrigerator until chilled. Once chilled set in the freezer, set in the freezer for 45 minutes. Remove from freezer and blend for 15-20 seconds. Pour in a serving dish and place back in freezer for 45 minutes.\n" +
                "2.Remove from the freezer and whisk, add Oreo cookies and gently mix in, then place back in freezer for another 45 minutes. Repeat process one to two more times, I did just one. Then leave in freezer until frozen.\n" +
                "3.When you remove from the freezer, immediately serve. This ice cream will melt faster than your typical store-bought ice cream.\n" +
                "\n";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}

