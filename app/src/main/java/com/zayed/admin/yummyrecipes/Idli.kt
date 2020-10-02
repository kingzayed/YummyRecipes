package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Idli extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_idli);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "For Oats Powder:\n\n" +
                "1.2 Cups Oats\n\n" +
                "For Fried Mixture:\n\n" +
                "1.1 Tbsp Oil\n\n" +
                "2.1 tsp Mustard Seeds\n\n" +
                "3.1 tsp Chana Dal\n\n" +
                "4.1 tsp Urad Dal\n\n" +
                "5.1/2 tsp Turmeric Powder\n\n" +
                "6.1 Green Chilli\n\n" +
                "7.1 Cup Carrot , finely chopped\n\n" +
                "8.1/2 Cup Coriander Leaves , chopped\n\n" +
                "9.A pinch of Salt\n\n" +
                "For Idli Batter:\n\n" +
                "1.1/2 tsp Salt\n\n" +
                "2.2 Cups Curd\n\n" +
                "3.A pinch of Fruit Salt\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "For Oats Powder:\n\n\n" +
                "1.Take 2 cups of oats in a pan and dry roast them for about 5 minutes until golden brown.\n\n\n" +
                "2.Let it cool down and then grind to make it a powder.\n\n\n" +
                "For Fried Mixture:\n\n\n" +
                "1.In a broad pan heat oil over medium flame.\n\n\n" +
                "2.Add mustard seeds to it and let them crackle.\n\n\n" +
                "3.Now add chana and urad Dal, turmeric powder and green chillis. Mix well and saute until light brown.\n\n\n" +
                "4.Add the chopped carrots and coriander leaves. Combine all the ingredients\n thoroughly along with a pinch of salt and cook for a minute or two.\n\n\n" +
                "5.Let the mixture cool down for few minutes before adding into idli batter.\n\n\n" +
                "For Idli Batter:\n\n\n" +
                "1.Transfer the prepared oats powder to a large bowl.\n\n\n" +
                "2.In this add salt and the fried mixture. Combine well.\n\n\n" +
                "3.Now add the required quantity of curd and stir thoroughly in one direction adding a pinch of fruit salt to it.\n\n\n" +
                "4.Prepare a medium thick batter and leave it covered for few minutes.\n\n\n" +
                "5.Now grease the idli moulds with ghee using a brush.\n\n\n" +
                "6.Pour the prepared oats idli batter in each mould and put it in the steamer.\n\n\n" +
                "7.Cover with a lid and steam for about 15 minutes over medium flame.\n\n\n" +
                "8.After 15 minutes check whether the idlis are properly cooked.\n\n\n" +
                "9.The tasty and healthy oats idli is ready to serve with coconut chutney.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
