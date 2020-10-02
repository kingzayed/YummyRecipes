package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenlollipopRecipes extends Activity {


    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chickenlollipop);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);



        String ing = "Marination for chicken lollipop:\n\n" +
                "1.1 ¼ tbsp Ginger garlic paste or ½ tsp each of powder\n\n" +
                "2.¼ to ½ red chili powder or paprika (adjust) or red chili sauce\n\n" +
                "3.½ tsp garam masala or any spice powder\n\n" +
                "4.1/8 tsp salt\n\n" +
                "5.4 tbsp corn flour or (2 tbsp. rice flour)\n\n" +
                "Seasoning for chicken lollipop:\n\n" +
                "1.1 onion medium fine chopped\n\n" +
                "2.¾ tbsp ginger chopped\n\n" +
                "3.¾ tbsp garlic chopped\n\n" +
                "4.1 tsp soya sauce\n\n" +
                "5.1 tsp vinegar\n\n" +
                "6.¾ to 1 tbsp red chili sauce or red chilli paste or any hot sauce\n\n" +
                "7.1 tsp sugar (can reduce to ½)\n\n" +
                "8.½ cup water\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1. I always prefer to soak the chicken in buttermilk for at least an hour.\n If using larger wings or drummettes then i suggest soaking for 4 to 6 hours in refrigerator.\n I would not recommend skipping this step as it really helps to yield soft and tender chicken when fried or grilled.\n\n\n" +
                "To make buttermilk, add 3 to 4 tbsp curd or yogurt to a bowl.\n Whisk it well with a fork. Add 1 ¼ cup water and ¼ tsp salt.\n Then add chicken to the butter milk.\n Always cover the chicken container and wrap with a few disposable plastic bags.\n Place the bowl in a separate compartment in the fridge which is not used for fruits, veggies and nuts.\n\n\n" +
                "2. Remove skin and fats before going ahead.\n Hold the thinner side of the drummettes.\n Next with the help of a knife, bring down the meat towards the other end.\n\n\n" +
                "3. Drain off the buttermilk completely if any.\n Add chili powder or paprika, spice powder, Ginger garlic and pepper powder as well.\n Toss gently to coat.\n\n\n" +
                "4. Mix cornflour with salt. Next add it to the bowl. Mix well.\n If you do not like to use corn flour, use unbleached and unbromated flour.\n You can make these without flour or can use only 2 tbsp rice flour as well.\n\n\n" +
                "5. Next shape them to balls on one side and place them all on a plate.\n\n\n" +
                "6. You can grill or fry the chicken.\n Grill in a preheated oven at 240 C for 20 to 40 minutes depending on the size.\n OR Heat oil in a pan. When the oil is hot enough, deep fry them on medium high until cooked.\n Do not fry on very high flame as it may brown the chicken outside without cooking inside.\n Next frying on a very low flame, will make the chicken hard.\n I haven’t tried shallow frying or pan frying, since I am not sure if they get cooked well.\n\n\n" +
                "7. Drain them on a kitchen towel. I fried in 3 batches.\n\n\n" +
                "8. Transfer the oil to a bowl. After that keep 1.5 tsp oil in the pan. Add ginger garlic and fry until fragrant.\n\n\n" +
                "9. Next add onions and fry until transparent.\n While the onions fry, make red chili paste.\n Mix ¾ tbsp chili powder with 1.5 tbsp water.\n You can also use ready made chili paste.\n\n\n" +
                "10. Mix 1 tsp vinegar with only 1 tsp naturally brewed soya sauce for half kg chicken. Pour it to the pan.\n\n\n" +
                "11. Add sugar and red chili paste or sauce. Saute everything together without burning.\n\n\n" +
                "12. Then pour ½ cup water and Stir.\n\n\n" +
                "13. Allow the sauce to cook until it thickens.\n\n\n" +
                "14. Add the chicken and toss.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());

    }
}

