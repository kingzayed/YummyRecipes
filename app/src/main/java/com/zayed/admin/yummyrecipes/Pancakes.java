package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Pancakes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pancakes);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 cups rolled oats\n\n" +
                "2.2 1/2 cups buttermilk, divided\n\n" +
                "3.1/2 cup whole wheat flour or oat flour\n\n" +
                "4.1 tsp baking powder\n\n" +
                "5.1 tsp baking soda\n\n" +
                "6.1/4 tsp cinnamon\n\n" +
                "7.1/4 tsp salt\n\n" +
                "8.2 large eggs\n\n" +
                "9.canola oil 60 mL\n\n" +
                "10.1 Tbsp honey or maple syrup\n\n" +
                "11.canola oil cooking spray or extra canola\n oil for cooking\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Instructions:\n\n\n" +
                "2.1. In large bowl, stir together oats and 2 cups (500 mL) buttermilk. Set aside for an hour or until buttermilk is absorbed and oats are soft. (To do this ahead of time, cover and refrigerate overnight.)\n\n\n" +
                "3.2. In small bowl, stir together flour, baking powder, baking soda, cinnamon and salt. Add to softened oatmeal.\n\n\n" +
                "4.3. Add remaining 1/2 cup (125 mL) buttermilk along with eggs, canola oil, honey or maple syrup. Stir with rubber spatula just until well combined.\n\n\n" +
                "5.4. Heat large, heavy skillet over medium-high heat and spray with canola oil cooking spray or brush with canola oil. \n\n\n" +
                "6.5. Cook about 1/2 cup (125 mL) batter at a time; spread it out with bottom of ladle or spoon (it will be thick) to about 4 inches (10 cm) in diameter. Turn heat down to medium-low and cook until edges appear dry and bubbles begin to break on surface. Using thin spatula, flip and cook until golden on other side.\n\n\n" +
                "7.6. Repeat with remaining batter. If you like, keep cooked pancakes warm in 200 ˚F (100 ˚C) oven while cooking rest. Serve with maple syrup and enjoy!\n\n\n" +
                "8.Tips: If you like, scatter the tops of pancakes with fresh or frozen blueberries or sliced banana as soon as you spread the batter into the pan; this way, the fruit is evenly distributed and the blueberries won't turn the batter purple with their juice. Freeze leftover pancakes with a piece of waxed paper in between them to pop into the toaster (straight from frozen) on busy weekday mornings.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
