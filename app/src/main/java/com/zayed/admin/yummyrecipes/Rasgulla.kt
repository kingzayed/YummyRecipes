package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Rasgulla extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_rasgulla);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 Litre Low fat milk (Refrigerated overnight, boiled\n\n" +
                "2.1/4 Cup Lemon juice (mixed in 1/4 cup water)\n\n" +
                "3.1 tsp Refined flour (maida) or semolina\n\n" +
                "4.4 Cups Thin sugar syrup (flavored with cardamom or rosewater)";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Remove whatever cream that forms over the milk.\n\n\n" +
                "2.Bring to a boil, lower heat and add the lemon mixture gradually, till milk curdles.\n\n\n" +
                "3.Does not matter if you do not use up the whole solution.\n\n\n" +
                "4.Shut off the heat and leave mixture to rest for 5 minutes.\n\n\n" +
                "5.Drain off water and leave the paneer in a colander for at least 4 hours.\n\n\n" +
                "6.Mash paneer very smooth (no grains).\n\n\n" +
                "7.Add the flour/semolina and mash some more.\n\n\n" +
                "8.Bring 4-6 cups of water to a boil, and shape the paneer into balls (smooth ones, no cracks) in the mean time.\n\n\n" +
                "9.Transfer balls into the boiling water, cover with a tight fitting cover and let cook till puffed up (about 20 minutes).\n\n\n" +
                "10.Let cool, squeeze out of the water, transfer to syrup, chill and serve.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
