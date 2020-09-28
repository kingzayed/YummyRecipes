package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Kulfi extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_kulfi);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.Full fat milk 1.25 lts\n" +
                "2.Powdered Sugar 1/3 cup heaped\n" +
                "3.Cardamom 4, powdered\n" +
                "4.Pistachios 8, roughly chopped (optional)\n" +
                "5.Saffron few strands, soaked in a tbsp of warm milk for 10 mts";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat milk in a wide bottomed pan and bring to a boil. Allow the milk simmer on medium flame till it reaches half its original quantity. Keep stirring in between.\n" +
                "\n" +
                "2.Add powdered sugar, cardamom powder and roughly chopped nuts. Mix well and keep simmering on medium flame, stirring till it further reduces to almost one-third of its original quantity. It will have a rabdi consistency and like a very thick milk.\n" +
                "\n" +
                "3.Turn off flame and allow to cool.\n" +
                "\n" +
                "4.Once cool, place the mixture in the fridge for 2 hours. (This helps reduce the formation of ice crystals during freezing process).\n" +
                "\n" +
                "5.Place the empty kulfi molds in the freezer to chill.\n" +
                "\n" +
                "6.Next, remove the mixture from the fridge and whisk it well and place the mixture in the freezer. After an hour, take it out and whisk it well or keep mixing with a whisk/ladle to agitate it. Again place it back in the freezer.\n" +
                "\n" +
                "7.Remove it after 2 hours and again repeat the whisking process. At this stage, pour the whisked mixture into chilled kulfi molds and close the lids.\n" +
                "\n" +
                "8.Place the kulfi molds in the deep freezer and allow to set overnight or at least 8 hours.\n" +
                "\n" +
                "9.Once the kulfi sets, place the kulfi mold in lukewarm water for a few secs to help it unmould easily.\n" +
                "\n" +
                "10.Insert kebab or ice cream stick in the kulfi and serve. You can garnish with more nuts.\n" +
                "\n";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}

