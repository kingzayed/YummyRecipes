package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class BajaTacos extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bajatacos);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.Vegetable oil, for frying\n\n" +
                "2.1/4 red cabbage, thinly sliced (about 1 1/2 cups)\n\n" +
                "3.1/2 cup fresh cilantro, roughly chopped\n\n" +
                "4.Juice of 1 lime, plus wedges for serving\n\n" +
                "5.2 tablespoons honey or agave nectar\n\n" +
                "6.1/2 cup mayonnaise\n\n" +
                "7.Kosher salt\n\n" +
                "8.12 corn tortillas\n\n" +
                "9.3/4 cup all-purpose flour\n\n" +
                "10.1/2 teaspoon chili powder\n\n" +
                "11.Freshly ground pepper\n\n" +
                "12.1 1/4 pounds skinless halibut fillet, cut into 2-by-1/2-inch pieces\n\n" +
                "13.1 Hass avocado\n\n" +
                "14.1/2 cup fresh salsa";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Heat about 3 inches vegetable oil in a medium pot over medium-low heat until a deep-fry thermometer registers 375 degrees F. Meanwhile, toss the cabbage, cilantro, lime juice, honey and mayonnaise in a bowl. Season the slaw with salt. \n\n\n" +
                "2.Warm the tortillas in a skillet over medium-low heat or wrap in a damp cloth and microwave 25 seconds. Wrap in a towel to keep warm. \n\n\n" +
                "3.Mix the flour, chili powder, and salt and pepper to taste in a shallow bowl. Dredge the fish in the flour mixture, then fry in batches until golden and just cooked through, 2 to 3 minutes. Transfer with a slotted spoon to a paper-towel-lined plate to drain. Season with salt." +
                "4.Halve, pit and slice the avocado. Fill the tortillas with the fish, avocado, slaw and salsa. Serve with lime wedges. ";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
