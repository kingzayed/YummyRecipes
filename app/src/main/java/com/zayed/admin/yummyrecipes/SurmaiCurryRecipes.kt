package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class SurmaiCurryRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_surmaicurry);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "Grind to a paste\n\n" +
                "\n" +
                "1.2 Onions (medium sized)\n\n" +
                "2.1 Tomatoes (medium sized)\n\n" +
                "3.3/4 cup Coconut (grated)\n\n" +
                "4.6 Cloves Garlic\n\n" +
                "5.8 Chilies (Kashmiri Red)\n\n" +
                "6.1 teaspoon Coriander Seeds\n\n" +
                "7.1 teaspoon Peppercorns (whole)\n\n" +
                "8.1 Tamarind (marble sized Ball)\n\n" +
                "For the curry\n\n" +
                "\n" +
                "1.600 grams Seer Fish (Surmai or Kingfish or)\n\n" +
                "2.1 teaspoon Turmeric (Powder)\n\n" +
                "3.1 tablespoon Coconut Oil\n\n" +
                "4.1 teaspoon Mustard Seeds\n\n" +
                "5.Handful Curry Leaves\n\n" +
                "6.A few Sprigs Coriander (for topping)\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Clean and wash the fish slices and rub turmeric all over them. Cover and keep aside.\n\n\n" +
                "2.Grind all the ingredients under paste till smooth with a tablespoon or two of water.\n\n\n" +
                "3.Heat coconut oil in a large pan or kadhai and add mustard seeds. Once the seeds start spluttering, add the ground paste and cook while stirring once in awhile for 10 minutes.\n\n\n" +
                "4.Slide the fish into the pan, and add salt and 3/4 cup water. Mix gently so as not to break the fish.\n\n\n" +
                "5.Bring the curry to a boil, and lower the heat to a simmer. Add curry leaves and simmer for 15 minutes.\n\n\n" +
                "6.Top with coriander leaves and serve this spicy kingfish curry with steamed rice.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
