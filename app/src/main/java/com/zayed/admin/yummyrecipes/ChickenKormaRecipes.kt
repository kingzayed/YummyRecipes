package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenKormaRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenkorma);


        imageView = (ImageView) findViewById(R.id.imageview);
        textName = (TextView) findViewById(R.id.textname);
        textingredients = (TextView) findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.300 gm chicken\n\n" +
                "2.50 gm grated onion\n\n" +
                "3.10 gm cashews\n\n" +
                "4.1/2 tablespoon ginger paste\n\n" +
                "5.2 clove\n\n" +
                "6.1/2 inch cinnamon stick\n\n" +
                "7.1/4 teaspoon grated nutmeg\n\n" +
                "8.1 tablespoon lime juice\n\n" +
                "9.50 ml refined oil\n\n" +
                "10.1/2 small coconut\n\n" +
                "11.1/2 small coconut\n\n" +
                "12.1/2 cup yoghurt (curd)\n\n" +
                "13.1 tablespoon sesame seeds\n\n" +
                "14.1/2 tablespoon garlic paste\n\n" +
                "15.2 green cardamom\n\n" +
                "16.1 leaves bay leaf\n\n" +
                "17.125 gm peeled potato\n\n" +
                "18salt as required\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Chicken Korma is a spicy melange of chicken and aromatic spices.\n Here’s how you can prepare this delicious chicken recipe at home by following a few simple steps.\n Take a fry pan on low-medium flame and dry roast coconut, cashews and sesame together.\n Once they are roasted, grind these ingredients.\n Now mix this paste with curd along with ginger, garlic and onions.\n\n\n" +
                "2.Then wash and clean the chicken pieces with water.\n Now take a large bowl, take the chicken pieces and add the paste along with ginger, garlic and onions.\n Marinade the chicken and keep it for an hour.\n Take a shallow pan or kadhai, heat oil in the same pan over medium flame and put green cardamom, cinnamon, cloves and bay leaves.\n Once they start to crackle, add the chicken along with the marinade.\n\n\n" +
                "3.Cook the ingredients over a low flame till dry.\n Then add the grated nutmeg and cover the contents with hot water.\n When the chicken is cooked, add lime juice and potatoes.\n Remove the curry from flame after a few minute, garnish it.\n To make it more delicious you can add some finely chopped ginger juliennes, green chilies and coriander." +
                "4.Serve hot with Rice, Biryani, Rumali Roti, Sheermal or Naan.\n Try this delectable chicken recipe at home and impress your loved ones with this flavoursome delicacy.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }

