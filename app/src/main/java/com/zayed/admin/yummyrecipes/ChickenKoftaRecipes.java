package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenKoftaRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenkofta);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.500 gm minced chicken\n\n" +
                "2.1/2 tablespoon crushed to paste ginger\n\n" +
                "3.1/2 cup tomato puree\n\n" +
                "4.1/2 teaspoon coriander powder\n\n" +
                "5.1 teaspoon garam masala powder\n\n" +
                "6.1/4 cup mustard oil\n\n" +
                "7.1 pinch powdered black pepper\n\n" +
                "8.4 medium chopped onion\n\n" +
                "9.1/2 tablespoon crushed to paste garlic\n\n" +
                "10.1/2 cup beaten yoghurt (curd)\n\n" +
                "11.1/2 teaspoon cumin powder\n\n" +
                "12.1 teaspoon red chilli\n\n" +
                "13.3 pinches salt\n\n" +
                "14.1 handful chopped coriander leaves\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Season the minced chicken with salt and pepper and keep aside.\n\n\n" +
                "2.Heat oil and saute the onions, followed by the ginger garlic paste.\n After 5 minutes add in the tomato puree along with the coriander and cumin powder.\n\n\n" +
                "3.Add red chilli and cook till oil separates from masala, add in the garam masala now and give it a good stir.\n\n\n" +
                "4.Take a tbsp of this masala and add it to the raw minced chicken, mix well.\n\n\n" +
                "5.Now add the curd to the masala in the pan(over low flame), add some water to make a gravy and let simmer over low heat.\n\n\n" +
                "6.Meanwhile shape the mince mixture into lemon sized balls.\n Heat a tbsp of oil till moderately hot. Fry the kofta balls till golden , drain and keep aside.\n Add any leftover oil to the simmering masala mixture to enrich the gravy.\n\n\n" +
                "7.Add the fried kofta balls to the simmering gravy, check seasoning and let simmer for 10 minutes till koftas are tender.\nGarnish with fresh coriander.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }

