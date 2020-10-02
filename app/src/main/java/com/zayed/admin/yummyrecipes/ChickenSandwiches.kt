package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenSandwiches extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickensandwiches);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 to 3 slices bread\n\n" +
                "2.½ to ¾ cup Chicken shredded or minced\n\n" +
                "3.1 tsp Butter for toasting bread\n\n" +
                "4.1 tbsp olive oil\n\n" +
                "5.1 tbsp garlic minced or 2 cloves\n\n" +
                "6.1 pinch Red chilli powder or paprika a generous pinch\n\n" +
                "7.1 pinch Any spice powder (all spice or garam masala)\n\n" +
                "8.3 tbsp mayonnaise\n\n" +
                "9.1/8 to ¼ tsp mustard powder (optional)\n\n" +
                "10.¼ tsp pepper coarsely crushed\n\n" +
                "11.Salt as needed\n\n" +
                "12.2 to 4 tbsp onions or cucumber, chopped\n\n" +
                "13.sprigs cilantro or parsley chopped finely, Few\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "Preparation\n\n\n" +
                "1.Butter the bread slices and toast them on a griddle until golden. Set these aside.\n\n\n" +
                "2.You can either boil the chicken or saute in oil to give a grilled like flavor and taste.\n\n\n" +
                "3.To saute , add some oil on the griddle and saute the garlic until it smells good.\n\n\n" +
                "4.Saute chicken along with salt until done. Sprinkle the spice powders. Toss well. Switch off and cool this.\n\n\n" +
                "5.Add pepper, mustard powder and mayo to a bowl. Mix everything well.\n\n\n" +
                "6.Add in chopped onions and herbs. Mix and add in the chicken.\n\n\n" +
                "Making chicken sandwich\n\n\n" +
                "1.Mix and spoon it over the toasted bread. Cover with another slice and press down." +
                "2.Halve the chicken sandwich and serve.\n\n\n";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
