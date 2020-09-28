package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitsSalads extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fruitsalads);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.Watermelon\n\n" +
                "2.Cantaloupe\n\n" +
                "3.Kiwifruiit\n\n" +
                "4.Pineapple\n\n" +
                "5.Marshmallow\n\n" +
                "6.To garnish Mint leaf, crushed nuts, sesame seeds or cinnamon\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Use fruit that will survive being cut into cubes and won’t brown.\n\n\n" +
                "2.If using marshmallow, this will add a soft textured sweetness to the finished cube.\n\n\n" +
                "3.The cubes work well at around 2.5cm/1 inch each. This step is a bit fiddly but cutting well-shaped cubes is what makes the whole cube work well.\n\n\n" +
                "4.Use a sharp knife for clean cutting.\n\n\n" +
                "5.Make one row consisting of three alternating cubes. Alternate so that no adjacent cubes are the same fruit.\n\n\n" +
                "6.The base should consist of four sides of three cubes each side.\n\n\n" +
                "7.Make two more layers the same. The cube is complete.\n\n\n" +
                "8.Place a mint leaf on top for a garnish. Sprinkle with crushed nuts, sesame seeds or a spice like cinnamon, as preferred.\n\n\n" +
                "9.You can serve this as a single cube for everyone to share from, or you can make it as a single serve cube for each diner. This will depend on how large you make the final fruit cube and how much fruit you’ve got to make the small cubes from.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
