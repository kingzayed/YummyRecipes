package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenBiryaniRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenbiryani);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.600 gm boiled basmati rice\n\n" +
                "2.4 tablespoon minced mint leaves\n\n" +
                "3.salt as required\n\n" +
                "4.2 teaspoon coriander powder\n\n" +
                "5.1 tablespoon garlic paste\n\n" +
                "6.2 tablespoon tomato puree\n\n" +
                "7.400 gm thinly sliced white onion\n\n" +
                "8.8 green cardamom\n\n" +
                "9.1 tablespoon milk\n\n" +
                "10.1 kilograms chicken thighs\n\n" +
                "11.1 teaspoon garam masala powder\n\n" +
                "12.2 pinches saffron\n\n" +
                "13.1 tablespoon ginger paste\n\n" +
                "14.4 sliced and slit green chilli\n\n" +
                "15.320 gm chopped tomato\n\n" +
                "16.2 teaspoon cumin seeds\n\n" +
                "17.6 tablespoon refined oil\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.First, in order to marinate the chicken, take a large bowl, put Greek yogurt, turmeric, chili powder along with salt as per your taste in a small bowl.\n Mix it well using a spoon and then, add the chicken thighs in the mixture and rub with this mixture.\n Keep aside for about 20-30 minutes, so that the yogurt mixture is properly absorbed by the chicken.\n Also, soak saffron in the milk to make saffron milk and keep aside.\n\n\n" +
                "2.In the meanwhile, pour refined oil in a deep-bottomed pan, keeping it on medium flame. Add cumin seeds and green cardamom in it and saute for about 2 minutes. Once done, immediately add the sliced onion and fry for 2-3 minutes straight. Make sure you don't burn it, so when the onion starts to get brown in color, add tomatoes and tomato puree and fry for another 5 minutes.\n\n\n" +
                "3.Next, add the slit green chilies to the mixture along with ginger-garlic paste, frying the mixture yet again for a minute.\n Then, add coriander powder and turn the flame to medium-low while stirring and cooking the masala.\n Quickly, add the marinated chicken and mix for a while so that the ingredients absorb the juices properly.\n\n\n" +
                "4.Turn the flame to medium again and heat-through for about 5-6 minutes only to turn it over to low heat.\nCover with a lid and let simmer for 5 minutes.\nMake sure to keep stirring during the entire process, else the chicken might stick to the bottom, eventually ending up burnt.\n You can add little water, if you find the consistency too thick.\n\n\n" +
                "5.Once done, turn off the flame and add half of the boiled rice in the pan and keep the rest aside until required.\nSprinkle milk soaked saffron along with garam masala, mint and coriander leaves.\nPut the remaining rice over this layer and garnish with the same mentioned four ingredients.\n\n\n" +
                "6.Lastly, cover the lid, turn the flame to low medium and let the rice cook for about 5 minutes.\nOnce done, put it off and let the biryani stay covered for about another 10 minutes.\nServe hot, along with raita or any chutney of your choice.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }

