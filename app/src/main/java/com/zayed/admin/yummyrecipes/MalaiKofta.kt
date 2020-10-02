package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MalaiKofta extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_malaikofta);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.4 Large Potatoes, boiled\n\n" +
                "2.250 Gram Paneer (cottage cheese)\n\n" +
                "3.50 Gram Maida\n\n" +
                "4.1 Tbsp Coriander leaves, chopped\n\n" +
                "5.3 Onions\n\n" +
                "6.1 Tbsp Ginger garlic paste\n\n" +
                "7.2 Tomatoes\n\n" +
                "8.200 Ml Malai or cream\n\n" +
                "9.2 Tbsp Raisins and cashew nuts\n\n" +
                "10.50 Gram Cashew nuts paste\n\n" +
                "11.1/2 tsp Haldi (turmeric)\n\n" +
                "12.1/2 tsp Red chilli powder\n\n" +
                "13.1/2 tsp Kitchen king masala\n\n" +
                "14.1 Tbsp Kasturi methi (dry Fenugreek)\n\n" +
                "15.To taste Salt\n\n" +
                "16.1 Tbsp Sugar";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "Prepare the koftas:\n\n\n" +
                "1.Refrigerate the boiled potatoes for 4 to 6 hours as this makes it easy to cook koftas.\n\n\n" +
                "2.Mash the boiled potatoes, paneer, maida. The mix should not be too hard or too soft. Add salt, chopped coriander leaves and mix well.\n\n\n" +
                "3.Cut the raisins and cashew nuts into very small pieces and add 1/2 tsp of sugar to the mix.\n\n\n" +
                "4.Heat up the oil for deep frying.\n\n\n" +
                "5.Roll out the balls from the dough you prepared and stuff the dry fruit mix in the centre.\n\n\n" +
                "6.Fry the koftas and if they break in hot oil then dust them with dry maida before putting them in.\n\n\n" +
                "Prepare the gravy:\n\n\n" +
                "1.Fry some onion, ginger garlic paste and tomato paste.\n\n\n" +
                "2.Mix the cashew nut paste with 2 Tbsp of warm milk and pour it into the paste.\n\n\n" +
                "3.Except kasturi methi, add all the dry masala into the paste and saute till the oil separates itself.\n\n\n" +
                "4.Add and a half cup of water and simmer the gravy till it's done.\n\n\n" +
                "5.Add cream/malai, 1 Tbsp of sugar and kasturi methi.\n\n\n" +
                "6.Simmer the gravy till the oil starts separating and once it's done, put the fried koftas into the gravy and serve hot with chapatis.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
