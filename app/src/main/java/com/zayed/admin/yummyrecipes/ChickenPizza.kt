package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenPizza extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bbqpizza);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 Tbsp Chili or sunflower oil\n\n" +
                "2.2 Boneless and skinless chicken breasts (cut into 1/2-inch pieces)\n\n" +
                "3.1 TSP Root ginger (grated), peeled\n\n" +
                "4.3-4 Garlic cloves, finely chopped\n\n" +
                "5.4-5 TBSP Pasta sauce or 2 tomatoes (chopped and blended)\n\n" +
                "6.1 TBSP Chili and garlic sauce\n\n" +
                "7.1 TSP Soy sauce\n\n" +
                "8.1/4 TSP Chili powder\n\n" +
                "9.1 Readymade pizza base or a garlic pizza flatbread, 10-12 inches in diameter\n\n" +
                "10.1/2 Red onion, sliced\n\n" +
                "11.30 GRAM Cheddar cheese, grated\n\n" +
                "12.A small handful fresh coriander leaves, chopped\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Preheat the oven to 200C.\n\n\n" +
                "2.Heat the oil on a medium heat in a frying pan or wok. Add the chicken and fry for 8 to 10 minutes.\n\n\n" +
                "3.Tip in the ginger and garlic and mix for a couple of minutes. Stir in the pasta sauce or tomatoes and soy sauce. Mix in the chili powder.\n\n\n" +
                "4.Spoon the mixture onto the pizza base. Sprinkle with the onion and cheese.\n\n\n" +
                "5.Bake for 10 minutes until the cheese has melted. Serve hot.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
