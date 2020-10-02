package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class SkilletSalmon extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_skilletslamon);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.4 (6 oz) skinless salmon fillets (about 1-inch thick)\n\n" +
                "2.Salt and freshly ground black pepper\n\n" +
                "3.2 tsp olive oil\n\n" +
                "4.2 garlic cloves , minced\n\n" +
                "5.1/4 cup low-sodium chicken broth\n\n" +
                "6.2 Tbsp fresh lemon juice\n\n" +
                "7.3 Tbsp + 1 tsp unsalted butter , diced into 1 Tbsp pieces\n\n" +
                "8.1/2 tsp honey\n\n" +
                "9.2 Tbsp minced fresh parsley\n\n" +
                "10.Lemon slices for garnish (optional)";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Remove salmon fillets from refrigerator and allow to rest at room temperature 10 minutes. \n\n\n" +
                "2/Meanwhile prepared garlic lemon butter sauce. In a small saucepan melt 1 tsp butter over medium heat. \n\n\n" +
                "3.Add garlic and saute until lightly golden brown, about 1 - 2 minutes. Pour in chicken broth and lemon juice. \n\n\n" +
                "4.Let sauce simmer until it has reduced by half (to about 3 Tbsp), about 3 minutes. Stir in butter and honey and whisk until combined, set sauce aside.\n\n\n" +
                "\n\n\n" +
                "5.Dab both sides of salmon dry with paper towels, season both sides with salt and pepper. \n\n\n" +
                "6.Heat olive oil in a (heavy) 12-inch non-stick skillet over medium-high heat. \n\n\n" +
                "7.Once oil is shimmering add salmon and cook about 4 minutes on the first side until golden brown on bottom then flip and cook salmon on opposite side until salmon has cooked through, about 2 - 3 minutes longer.\n\n\n" +
                "8.Plate salmon (leaving oil in pan) and drizzle each serving generously with butter sauce, sprinkle with parsley and garnish with lemon slices if desired. Serve immediately.\n\n\n" +
                "9.Recipe source: Cooking Classy";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
