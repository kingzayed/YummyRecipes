package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChowMeinChicken extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chowmein);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.200 g /6oz chicken thigh fillets , cut into bite size pieces (Note 1 tenderise option)\n\n" +
                "2.1 1/2 tbsp peanut oil (or other cooking oil)\n\n" +
                "3.200 g /6 oz fresh chow mein noodles (Note 2)\n\n" +
                "4.3 - 4 cups green cabbage or Chinese cabbage , finely shredded (Note 3)\n\n" +
                "5.1 carrot, julienned\n\n" +
                "6.1 cup bean sprouts\n\n" +
                "7.3 shallot/scallions/green onions , cut into 5cm/2\" pieces\n\n" +
                "8.2 cloves garlic , finely chopped\n\n" +
                "9.1/4 cup / 65 ml water\n\n" +
                "Chow Mein Sauce:\n\n" +
                "1.2 tsp cornflour / cornstarch\n\n" +
                "2.1 1/2 tbsp soy sauce , all purpose or light (Note 4)\n\n" +
                "3.1 1/2 tbsp oyster sauce\n\n" +
                "4.1 1/2 tbsp Chinese cooking wine (Note 5)\n\n" +
                "5.2 tsp sugar\n\n" +
                "6.1/2 tsp sesame oil\n\n" +
                "7.White pepper\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "Sauce:\n\n\n" +
                "1.Mix together cornflour and soy sauce, then mix in remaining ingredients. \n\n\n" +
                "2.Alternative: Use 1/3 cup Chinese All Purpose Stir Fry Sauce, if you have some in stock.\n\n\n" +
                "Other Prep:\n\n\n" +
                "1.Marinate Chicken: Pour 1 tbsp of Sauce over the chicken, mix to coat, set aside to marinate for 10 minutes.\n\n\n" +
                "Noodles: 1.Prepare the noodles according to the packet instructions (my pack says soak in boiled water for 1 minute), then drain.\n\n\n" +
                "Cooking:\n\n\n" +
                "1.Heat oil in wok or large fry pan over high heat.\n\n\n" +
                "2.Add garlic and stir fry for 10 seconds or until it starts to turn golden - don't let it burn!\n\n\n" +
                "3.Add chicken and stir fry until the surface gets a tinge of browning but inside is still raw - about 1 minute. \n\n\n" +
                "4.Add the cabbage, carrot, and the white pieces of shallots (i.e. from the base of the stalk). Stir fry for 1 1/2 minutes until the cabbage is mostly wilted.\n\n\n" +
                "5.Add the noodles, Sauce and water. Stir fry for 1 minute, tossing constantly. \n\n\n" +
                "6.Add bean sprouts and remaining shallots/scallions. Toss through for 30 seconds or until the bean sprouts just start to wilt.\n\n\n" +
                "7.Remove from heat and serve immediately.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
