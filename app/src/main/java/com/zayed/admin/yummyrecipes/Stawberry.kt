package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Stawberry extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_stawberry);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 cups whole milk\n" +
                "2.2 cups heavy cream\n" +
                "3.1 cup white sugar\n" +
                "4.1/4 teaspoon salt\n" +
                "5.2 teaspoons vanilla extract\n" +
                "6.2 cups mashed fresh strawberries\n" +
                "7.2 drops red food coloring (optional)\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "In a large bowl, combine the milk, cream, sugar, salt, vanilla, strawberries, and food coloring. \nPour the mixture into the freezer bowl of an ice cream maker, and freeze according to manufacturer's directions.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}

