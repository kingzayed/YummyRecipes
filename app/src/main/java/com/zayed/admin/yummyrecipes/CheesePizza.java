package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class CheesePizza extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cheesepizza);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "For Pizza dough:\n\n" +
                "1.500 Gram Flour\n\n" +
                "2.Salt\n\n" +
                "3.300 Ml Tepid Water\n\n" +
                "4.7 Gram Dried yeast\n\n" +
                "5.1/2 tsp Sugar\n\n" +
                "6.30 Ml Olive Oil\n\n" +
                "7.Extra Virgin olive oil\n\n" +
                "For the topping:\n\n" +
                "1.Passata sauce\n\n" +
                "2.1 Cup Mozzarella cheese, grated\n\n" +
                "3.Handful Basil leaves\n\n" +
                "4.Pepper\n\n" +
                "5.Extra virgin olive oil\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "Prepare the Pizza dough:\n\n\n" +
                "1.Sieve flour with salt and add yeast to tepid water and stir in sugar. Leave aside for 6 to 8 minutes.\n\n\n" +
                "2.In a mixing bowl, create a well in the middle of the flour mixture and add 100 ml of yeast mixture and 15 ml olive oil.\n\n\n" +
                "3.Add in the rest of yeast mixture and remaining olive oil.\n\n\n" +
                "4.Flour the kneading surface so that the dough does not stick.\n\n\n" +
                "5.Mix together with your fingers till you have a dough. Knead for 10 minutes till you have an elastic, even product.\n\n\n" +
                "Proving the Dough:\n\n\n" +
                "1.Place the dough in a bowl and drizzle generously with extra virgin olive oil.\n\n\n" +
                "2.Cover bowl with cling film and place in a warm area to prove for 50 minutes.\n\n\n" +
                "3.After the dough is proved, bash the air out and cut into small pieces for individual pizzas.\n\n\n" +
                "4.Dust the work surface and rolling pin with some flour before rolling out the dough.\n\n\n" +
                "Prepare the topping:\n\n\n" +
                "1.Pre-heat oven at its highest mark and flour your baking tray.\n\n\n" +
                "2.Now, using a rolling pin, roll out the freshly made pizza dough and place on the tray.\n\n\n" +
                "3.Spread a thin layer of passata sauce and cover with mozarella cheese and sprinkle basil leaves.\n\n\n" +
                "4.Put the tray into the oven for 10 to 12 minutes.\n\n\n" +
                "5.After the pizza is baked remove from the oven and drizzle extra virgin olive oil and some pepper.\n\n\n" +
                "6.Garnish with fresh basil and cut into slices.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
