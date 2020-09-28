package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class AlooParatha extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_paratha);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.2 cups kootoo ka atta\n\n" +
                "2.1 large potato, boiled, peeled and mashed smooth\n\n" +
                "3.1 tsp senda namak (rock salt)\n\n" +
                "4.Ghee for frying the paranthas\n\n" +
                "5.Dry flour for dusting\n\n" +
                "For the filling:\n\n" +
                "1.Mashed potatoes, with senda namak (rock salt) and chilli powder mixed into it\n, along with lemon juice, hara dhania (coriander leaves)\n and green chillies if desired.\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Knead dough as for parantha. Make flat rounds and pinch the edges to about 1/3 way towards the centre, to form a sort of a cup.\n\n\n" +
                "2.Take some filling, and place in the centre of the 'cup'. Wet the edges and bring together to enclose the filling. Pinch to seal.\n\n\n" +
                "3.Roll out as thinly as you can without tearing.\n\n\n" +
                "4.Fry the paranthas crisp and darker on both sides.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
