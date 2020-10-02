package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class CreamChickenSoup extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickencreamsoup);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 tbsp olive oil\n\n" +
                "2.50 g / 3.5 tbsp unsalted butter\n\n" +
                "3.½ cup / 75 g flour\n\n" +
                "4.1 garlic clove , minced\n\n" +
                "5.½ small brown onion , finely chopped\n\n" +
                "6.1 small carrot , diced\n\n" +
                "7.1/2 red capsicum/bell pepper , finely chopped\n\n" +
                "8.1 small celery stick , diced\n\n" +
                "9.2 cups / 500 ml chicken stock / broth , preferably low sodium\n\n" +
                "10.3 cups / 750 ml milk , any fat %\n\n" +
                "11.½ tsp salt\n\n" +
                "12.¼ tsp EACH garlic powder , onion powder, dried thyme, black pepper (“Spices”)\n\n" +
                "13.3/4 cup frozen peas\n\n" +
                "14.1 cup cooked chicken , diced or shredded\n\n" +
                "Croutons:\n\n" +
                "1.2 slices white bread , cut into cubes\n\n" +
                "2.Olive oil spray\n\n" +
                "3.Salt";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat oil in a large pot over medium high heat. Add onion and garlic and cook for 2 minutes until partly translucent but not browned.\n\n\n" +
                "2.Add carrots, celery and capsicum, cook for 1 minute to soften.\n\n\n" +
                "3.Add butter and melt. Then add flour and mix until incorporated, and stir constantly for 1 minute.\n\n\n" +
                "4.Add broth, mix until flour is incorporated, then add milk. Mix to combine, then add salt, Spices, chicken and peas.\n\n\n" +
                "5.Bring to simmer, mixing occasionally to stop bottom of sticking. As it heats, it will thicken – about 4 to 5 minutes. Don’t let it bubble.\n\n\n" +
                "6.Once thickened to your taste, adjust salt and pepper. Ladle into bowls and serve garnished with croutons and fresh thyme if desired.\n\n\n" +
                "Croutons: Spray croutons generously with oil, sprinkle with salt, then bake for 5 minutes at 180C/350F or until golden and crunchy.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
