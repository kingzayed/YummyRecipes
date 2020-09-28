package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Malpua extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_malpua);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "For Rabri:\n\n" +
                "1.1 Litre Milk\n\n" +
                "2.1 Cup Sugar\n\n" +
                "3.1/2 tsp Saffron\n\n" +
                "4.1 tsp Pistachios\n\n" +
                "5.1 tsp Almonds\n\n" +
                "6.1 tsp Cardamom powder\n\n" +
                "For sugar syrup:\n\n" +
                "1.2 Cups Sugar\n\n" +
                "2.2 Cups Water\n\n" +
                "3.1 Saffron\n\n" +
                "4.1 tsp Cardamom powder\n\n" +
                "5.2 tsp Almonds\n\n" +
                "For Malpua:\n\n" +
                "1.1 Cup Maida\n\n" +
                "2.1/4 Cup Sooji\n\n" +
                "3.1/2 Cup Khoya\n\n" +
                "4.2 tsp Sugar ( powdered)\n\n" +
                "5.1 tsp Saunf\n\n" +
                "6.1 Cup Water\n\n" +
                "7.2 Cups Ghee";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "To prepare Rabri:\n\n\n" +
                "1.Boil milk in a bowl.\n\n\n" +
                "2.Add a cup of sugar to it and mix well.\n\n\n" +
                "3.Now add saffron, pistachios and almonds to the milk followed by cardamom powder and mix well. Mix thoroughly to make smooth batter.\n\n\n" +
                "To prepare Sugar syrup:\n\n\n" +
                "1.Put sugar in a bowl along with some water and bring it to boil.\n\n\n" +
                "2.Add saffron, cardamom powder and almonds to the boiling water and mix well.\n\n\n" +
                "3.To prepare Malpua:\n\n\n" +
                "4.Take maida in a bowl, add sooji, khoya along with powdered sugar and saunf, followed by water. Whisk all of it together. Keep adding water to make a creamy-like mixture.\n\n\n" +
                "5.Now, in a wok full of ghee put tablespoon full of the malpua mixture. Make as many malpuas as you can with the mixture.\n\n\n" +
                "6.Immerse malpuas in the prepared sugar syrup for about 10-15 minutes.\n\n\n" +
                "7.Put rabri on top of it and serve.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
