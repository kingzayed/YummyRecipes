package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class VegBurger extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vegburger);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.120 gm french beans - strung, blanched and chopped fine\n\n" +
                "2.120 gm cabbage - grated\n\n" +
                "3.120 gm cauliflower - grated\n\n" +
                "4.1/2 cup carrots - grated\n\n" +
                "5.1 cup potatoes - boiled and mashed\n\n" +
                "6.2 tsp coriander powder\n\n" +
                "7.Salt - to taste\n\n" +
                "8.1/4 tsp turmeric powder\n\n" +
                "9.1/2 cup boiled peas\n\n" +
                "10.2 eggs - slightly beaten\n\n" +
                "11.1/4 cup maida\n\n" +
                "12.Bread crumbs\n\n" +
                "13.Oil";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat oil in a pan and add all the beans, carrots, cauliflower and cabbage to it. Stir over high heat.\n\n\n" +
                "2.Add coriander powder, salt, turmeric powder and mix well.\n\n\n" +
                "3.Turn off the heat. Keep aside to cool.\n\n\n" +
                "4.When cool mix in the boiled potatoes and peas.\n\n\n" +
                "5.Make thin rounds so as to match the bun.\n\n\n" +
                "6.Dust with maida and dip into the beaten egg.\n\n\n" +
                "7.Coat with bread crumbs.\n\n\n" +
                "8.Heat oil and deep fry till they turn golden brown in colour.\n\n\n" +
                "9.Slit the burger roll and place the patty in it along with mustard and mayonnaise. Serve.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
