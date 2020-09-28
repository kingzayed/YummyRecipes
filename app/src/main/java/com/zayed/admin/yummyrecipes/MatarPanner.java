package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MatarPanner extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_matarpanner);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 cup fresh or frozen Green Peas (matar)\n\n" +
                "2.3/4 cup (1/2-inch cubed) Paneer (cottage cheese)\n\n" +
                "3.1 medium Onion, finely chopped\n\n" +
                "4.1 Green Chilli, chopped\n\n" +
                "5.2-3 cloves of Garlic\n\n" +
                "6.1/2 inch piece of Ginger, chopped\n\n" +
                "7.2 medium Tomatoes, roughly chopped\n\n" +
                "8.5-6 Cashew Nuts, soaked in hot water for 20-30 minutes\n\n" +
                "9.1/2 teaspoon Red Chilli Powder\n\n" +
                "10.1/4 teaspoon Turmeric Powder\n\n" +
                "11.1 teaspoon Coriander Powder\n\n" +
                "12.1/4 teaspoon Garam Masala Powder\n\n" +
                "13.For shallow frying + 2 tablespoons Oil or Ghee (clarified butter)\n\n" +
                "14.1/2 cup + 2 tablespoons Water\n\n" +
                "15.Salt to taste";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Grind onion, green chilli, ginger and garlic together in the small chutney jar of a grinder to make medium coarse paste. Grind the tomatoes to make tomato puree. Grind cashew nuts with 2 tablespoons water until smooth paste.\n\n\n" +
                "2.Heat 2 tablespoons oil in the same pan/kadai over medium flame. Add crushed onion paste (prepared in step-1) and salt (only for onion paste, it helps to cook onion faster). Sauté it until oil starts to separate or it turns translucent. It will take around 5-7 minutes.\n\n\n" +
                "3.Add tomato puree (prepared in step-1) and cook on medium flame until oil starts to separate, for approx. 5-6 minutes.\n\n\n" +
                "4.Add red chilli powder, turmeric powder, coriander powder, garam masala powder and salt.\n\n\n" +
                "5.Stir and cook for a minute. Add cashew nut paste (prepared in step-1).\n\n\n" +
                "6.Stir and cook for 1-2 minutes.\n\n\n" +
                "7.Add boiled peas and 1/2 cup water; mix properly and cook for 2-3 minutes.\n\n\n" +
                "8.Add paneer cubes and cook for 2-3 minutes. We have added plain paneer cubes but you can add shallow fried paneer to enhance the flavor (see tips).\n\n\n" +
                "9.Turn off flame and transfer prepared curry to a serving bowl. Matar paneer is ready. Serve it with butter kulcha, cucumber tomato onion salad and gajar halwa for a complete meal.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
