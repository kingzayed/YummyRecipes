package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class GulabJamun extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_gulabjamun);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "For Sugar Syrup:\n\n" +
                "1.2 Cups Sugar\n\n" +
                "2.5 Cups Water\n\n" +
                "3.1 tsp Milk\n\n" +
                "4.1/4 tsp Cardamom Seeds\n\n" +
                "5.1/2 tsp Saffron\n\n" +
                "6.1/2 tsp Cardamom Powder\n\n" +
                "For Gulab Jamun Balls:\n\n" +
                "1.1 1/2 Cups Khoya, grated\n\n" +
                "2.1/2 tsp Baking Soda\n\n" +
                "3.1/2 Cup Maida\n\n" +
                "4.1 tsp Milk";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Take required quantity of sugar and water in a deep pan. Stir and bring to boil on high flame for sugar to dissolve.\n\n\n" +
                "2.Now add milk and cardamom seeds to the sugar water. Boil further and strain.\n\n\n" +
                "3.Then add saffron and cardamom powder and bring the mixture to rolling boil for about 5-6 minutes until it becomes little sticky.\n\n\n" +
                "Prepare Gulab Jamun Balls:\n\n\n" +
                "1.Take the grated Khoya in a medium size deep bowl.\n\n\n" +
                "2.Add baking soda and maida. Combine them thoroughly but gently using a spoon.\n\n\n" +
                "3.Add a teaspoon of milk to it and knead all of them together to make a smooth and soft dough. Add another teaspoon of milk if required.\n\n\n" +
                "4.Make sure that the dough is a bit softer to avoid cracking of ball while deep frying.\n\n\n" +
                "5.Divide the dough into equal parts and make smooth surfaced balls out of it.\n\n\n" +
                "6.Now heat ghee in a pan over medium flame and add the Jamun balls to deep-fry them. Cook evenly until it becomes golden brown.\n\n\n" +
                "7.Make sure that you do not cook on high flame otherwise the balls will burn.\n\n\n" +
                "8.Now drain and let them cool for few minutes.\n\n\n" +
                "9.Then immerse the gulab jamuns in the warm sugar syrup for at least 30 minutes. It increases in size when it soaks the sugar syrup.\n\n\n" +
                "10.Hot and tasty sweet dish is ready to serve.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
