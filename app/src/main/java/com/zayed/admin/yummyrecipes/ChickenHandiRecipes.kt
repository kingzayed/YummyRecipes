package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenHandiRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenhandi);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 Kg Chicken (cut into medium sized pieces)\n\n" +
                "2.2 Large sized Onion (sliced lengthwise)-approx 250 grams\n\n" +
                "3.2 Large sized Tomatoes (puréed)-approx 250 grams\n\n" +
                "4.200 grams Curd\n\n" +
                "5.Cooking Oil\n\n" +
                "6.Salt\n\n" +
                "7.3 Bay Leaf\n\n" +
                "8.2 tsp. Cumin Seeds\n\n" +
                "9.4 Green Cardamom\n\n" +
                "10.1 tsp. Black Peppercorns\n\n" +
                "11.3 Black Cardamom\n\n" +
                "12.½ tsp. Cloves\n\n" +
                "13.1-1/2 inch Cinnamon Stick\n\n" +
                "14.1 tbsp. Kashmiri Red Chili Powder (less spicy)\n\n" +
                "15.½ tsp. Turmeric Powder\n\n" +
                "16.1 Lemon Juice\n\n" +
                "17.½ tsp. roasted dried Fenugreek Leaves Powder\n\n" +
                "18.2 tbsp. Coriander Powder\n\n" +
                "19.2-3 tbsp. Ginger Garlic Paste\n\n" +
                "20.¼th Cup fresh Coriander Leaves\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Let's perform Chicken's first Marination:\n\n\n" +
                "             Add 1 tsp. Salt, ½ tsp. Turmeric Powder, Lemon Juice and mix well.\n We will keep Chicken in this marination for 30 minutes.\n\n\n" +
                "2.We will dry roast Whole Spices.\n In a pan, add Bay Leaf, Cinnamon stick, Peppercorns, Black Cardamom, Green Cardamom, Cumin Seeds and Cloves.\n Dry Roast lightly. As the spices release aroma, switch off the heat and grind it into fine powder.\n\n\n" +
                "3.Lets prepare for second marination:\n\n\n" +
                " Add roasted and grounded spice Mix, Red Chili Powder, Coriander Powder and curd.\n Mix well. Cover with a Cling Film and keep the chicken in this marination for an hour in refrigerator.\n\n\n" +
                "4.Take marinated chicken out from refrigerator.\n We will make this preparation in an earthen pot.\n Heat 4-5 tbsp. Oil and add sliced Onions. Fry until Onions become brown in color.\n\n\n" +
                "5.When Onions become brown, add ginger-garlic paste and fry for a minute.\n Add Chopped Coriander Leaves and marinated chicken. Roast Chicken on high heat.\n\n\n" +
                "6.After 5 mins of roasting, add tomato puree and salt to taste and mix well. Cover and cook the Chicken on reduced heat.\n\n\n" +
                "7.After 10 mins, stir the chicken. We have not added any water in this preparation.\n Chicken gets cooked in its own juices, and the moisture from curd and tomato puree.\n Cover and cook for remaining time.\n\n\n" +
                "8.Chicken gets cooked in total 25 minutes.\n You can adjust the consistency of the final preparation.\n If you require thick consistency, then cook uncovered for 3-4 minutes.\n Add roasted dried fenugreek leaves powder and mix.\n\n\n" +
                "9.Switch off the heat and now we will prepare for a Tadka\n\n\n" +
                "10.Heat 1 tbsp. Oil and add ½ tsp. Cumin Seeds. Pour tadka on Chicken. Add some chopped Coriander Leaves\n\n\n" +
                "11.Chicken Handi is ready to be served.\n Flavor of Chicken cooked in an earthen pot on low heat in its own juices is delicious.\n Chicken Handi can be relished with Laccha Paratha, Naan, Phulka or Steamed Rice.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }
