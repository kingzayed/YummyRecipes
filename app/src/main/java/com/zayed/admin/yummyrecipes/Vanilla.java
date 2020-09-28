package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Vanilla extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vanilla);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 1/4 cup milk\n" +
                "2.1 tablespoon corn flour\n" +
                "3.1/2 cup fresh cream\n" +
                "4.1/2 cup sugar\n" +
                "5.1 teaspoon vanilla essence";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Preparing this Vanilla Ice cream at home will surely win you praises. \nHere are some easy tips and tricks to prepare this easy delight. \nTake a small bowl and add 1/4 cup of milk and cornflour to it. \nMix well and keep the mixture aside.\n" +
                "2.Take a deep non-stick pan and add the remaining 2 cups of milk.\n Heat it over moderate flame and allow it to boil for 7-8 minutes, while stirring occasionally.\n Now, add the sugar and the cornflour-milk mixture in the milk, mix well and cook on a medium flame for 5 minutes, while stirring continuously.\n Cool completely.\n" +
                "3.Once the mixture is cooled, add the fresh cream and vanilla essence and mix well.\n After mixing, pour the mixture into a aluminium container.\n Cover the container with an aluminium foil and freeze for 6 hours or till semi-set.\n" +
                "4.Now pour the mixture into a mixer and blend till smooth. \nTransfer the mixture back into the same aluminium container. \nCover with an aluminium foil and freeze for 10 hours or till set. \nScoop the vanilla ice cream in some crispy waffle cones and enjoy the flavourful dessert.\n";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}

