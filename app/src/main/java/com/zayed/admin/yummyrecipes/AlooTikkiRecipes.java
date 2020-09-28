package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class AlooTikkiRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_alootikki);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2-3 large potatoes-boiled, peeled, grated\n\n" +
                "2.1/2 cup singhare ka atta\n\n" +
                "3.1 tsp rock salt\n\n" +
                "4.1/4 tsp powdered black pepper\n\n" +
                "5.1 tsp green chillies-finely chopped\n\n" +
                "6.1 Tbsp green coriander-finely chopped\n\n" +
                "7.Ghee for pan frying\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Mix all the ingredients except the ghee till smooth. Knead into a pliable dough.\n\n\n" +
                "2.Shape into tikkies.\n\n\n" +
                "3.Heat a thin layer of ghee in a heavy-based pan.\n\n\n" +
                "4.Fry tikkies over medium flame, till crisp and brown on both sides.\n\n\n" +
                "5.Add a little ghee if required.\n\n\n" +
                "6.Serve hot, accompanied with coriander chutney.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
