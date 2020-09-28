package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenTikkaRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickentikka);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);



        String ing = "1.500 grams chicken boneless and cubed\n\n" +
                "2..1 to 1 ½ tbsp chickpea flour or besan\n\n" +
                "3.1 cup yogurt (regular thick curd or ½ cup of hung curd or greek yogurt\n\n" +
                "Veggies (at room temp, using from the fridge right away makes them soggy):\n\n" +
                "1.½ green bell pepper\n\n" +
                "2.½ red bell pepper or tomatoes (remove the seeds and pulp)\n\n" +
                "3.1 large onion cubed\n\n" +
                "Chicken tikka masala marinade (skip, if using readymade tikka masala powder):\n\n" +
                "1.¾ to 1 tsp red chili powder , Kashmiri , or paprika\n\n" +
                "2.1/8 tsp pepper powder\n\n" +
                "3.1 ½ tsp ginger garlic paste\n\n" +
                "4.1/8 tsp turmeric\n\n" +
                "5.½ tbsp kasuri methi or dried fenugreek leaves (crushed)\n\n" +
                "6.1 to 2 tbsp lemon juice (adjust, if your curd is sour, you can skip this)\n\n" +
                "7.¼ tsp biryani masala powder or ½ teaspoon of good garam masala\n\n" +
                "8.½ tsp coriander powder (optional, refer notes 3)\n\n" +
                "9.Salt to taste\n\n" +
                "10.1 tbsp oil\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.To make the best chicken tikka, we need drained yogurt/ curd or greek yogurt works fine\n. If you are using regular yogurt, then add it to a cheese or muslin cloth and then drain off the excess water\n. You must have a thick consistency curd. you can also leave the yogurt to drain off for several hours in the refrigerator, after placing it in a muslin cloth.\n\n\n" +
                "2.Wash and cut chicken fillet to equal sized cubes, remove the moisture from them using disposable tissues. Or set them side for a while to take away the dripping water.\n\n\n" +
                "3.Mix all the ingredients under chicken tikka masala marinade with yogurt, lemon juice, gram flour.\n Marinate the chicken for at least an hour.\n 12 tastes the best. You will have to refrigerate if marinating for longer than an hour.\n\n\n" +
                "4.Soak the wooden skewers for at least 30 mins in water to prevent them from burning.\n\n\n" +
                "5.Just before you begin to grill, cube the veggies and marinate in the left over marination.\n Put them on to skewers, alternating veggies and chicken.\n\n\n" +
                "6.Pre heat the oven to 240 C for at least 15 minutes, bake for 20 to 30 mins or till fully done.\n I suggest checking after 20 mins.\n This depends on the size of your chicken pieces and how tender it is.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }

