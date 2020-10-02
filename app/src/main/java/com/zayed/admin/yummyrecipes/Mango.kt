package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Mango extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mango);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 large mangoes , ripe and juicy - to make 2 cups puree\n" +
                "2.395 g / 14 oz sweetened condensed milk\n" +
                "3.2 cups thickened cream / heavy cream / whipping cream , cold\n" +
                "4.1/8 tsp yellow liquid food colouring ";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Dice the flesh of the mango. \nPuree using a blender, food processor or stick blender then measure out 2 cups of mango puree\n" +
                "2.Pour puree into a non stick skillet over medium low heat.\n Cook, stirring constantly, for 8 - 10 minutes or until it reduces by half.\n The test is when you can drag a wooden spoon across the skillet and the path remains there for a second\n. Or measure out the puree to ensure it's reduced to at least 1 cup - less is even better!\n" +
                "3.Cool puree.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}

