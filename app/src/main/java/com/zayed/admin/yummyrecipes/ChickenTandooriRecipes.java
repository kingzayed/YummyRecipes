package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenTandooriRecipes extends Activity {


    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tandoori);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.½ kg chicken (or 500 to 700 grams)\n\n" +
                "2.½ cup yogurt (or hung curd or greek yogurt)\n\n" +
                "3.¾ tbsp ginger garlic paste\n\n" +
                "4.1 tsp garam masala\n\n" +
                "5.1 tsp red chilli powder\n\n" +
                "6.¼ tsp pepper powder\n\n" +
                "7.1 tsp coriander powder (or daniya powder)\n\n" +
                "8.¼ tsp salt (taste marinade and add more)\n\n" +
                "9.¼ tsp Turmeric (or haldi)\n\n" +
                "10.1 tsp kasuri methi (dried fenugreek leaves)\n\n" +
                "11.1 tbsp lemon juice\n\n" +
                "12.1½ tbsp oil (or mustard oil)\n\n" +
                "For grilling:\n\n" +
                "1.1 tbsp oil\n\n" +
                "For color:\n\n" +
                "1.1 tsp red chili powder\n\n" +
                "2.1 tbsp oil\n\n" +
                "Marinade for tandoori chicken:\n\n" +
                "1.To a mixing bowl, add thick yogurt or hung curd.\n If you do not have it, then line a thin cloth over a sieve.\n Pour 1 cup curd.\n Wring it gently and strain off the whey (water).\n Make a knot and hang it to a hook for 45 mins. Then use half cup here.\n\n" +
                "2.Next add in ginger garlic paste, garam masala, red chili powder, salt, turmeric, kasuri methi, pepper powder and coriander powder.\n\n" +
                "3.Pour oil and lemon juice as well.\n\n" +
                "4.Mix everything well. The marinade has to be thick and not of dripping consistency.\n Taste it and add more salt and chili powder if needed.\n\n" +
                "5.Make deep gashes over the chicken and add it to the bowl.\n\n" +
                "7.Marinate the chicken well into the gashes.\n\n" +
                "8.Cover and set aside for at least 6 hours. If you reduce the marination time, chicken will not turn soft and juicy.\n It may not get cooked well if making on tawa.\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.For the stove method, please follow the step by step instructions after the recipe card.\n Preheat the oven at 240 C for at least 15 mins.\n\n\n" +
                "2.Place a foil on the tray. Next grease it.\n\n\n" +
                "3.Place the chicken pieces oven the foil or greased wire rack.\n If using a wire rack place a tray under it to hold the drippings.\n\n\n" +
                "4.Grill the chicken for about 15 mins.\n\n\n" +
                "5.Mix together 1 tsp red chili powder with 1 tbsp oil.\n\n\n" +
                "6.Then baste the red chili oil over the chicken. Grill for 5 mins.\n\n\n" +
                "7.Flip the chicken to the other side and baste the red chili oil.\n\n\n" +
                "8.Grill for another 6 to 10 mins.\n\n\n" +
                "9.The last 5 mins, you can move it to the top most rack. This gives the charred look.\n You can also burn a char coal piece and place it in a small cup.\n Keep that in the chicken tray. Cover with a large utensil.\n Allow it to smoke for 5 to 7 mins.\n\n\n" +
                "10Restaurant style tandoori chicken is ready. Serve with onion and lemon wedges.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }

