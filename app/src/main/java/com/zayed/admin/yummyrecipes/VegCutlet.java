package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class VegCutlet extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vegcutlet);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.120 gm french beans - strung and blanched\n\n" +
                "2.120 gm bottle gourd - peeled and grated\n\n" +
                "3.120 gm cauliflower - grated\n\n" +
                "4.1/2 cup carrots-grated\n\n" +
                "5.1 cup potatoes-boiled and mashed\n\n" +
                "6.1 tsp cumin seeds\n\n" +
                "7.2 tsp ginger-chopped fine\n\n" +
                "8.2 tsp coriander powder\n\n" +
                "9.2 tsp amchoor\n\n" +
                "10.1 1/2 tsp salt\n\n" +
                "11.2 tsp green chillies-chopped fine\n\n" +
                "12.2 eggs-slightly beaten\n\n" +
                "13.1/2 cup refined flour\n\n" +
                "14.Dried bread crumbs to coat the cutlets\n\n" +
                "15.1 Tbsp oil";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Chop the beans fine.\n\n\n" +
                "2.Heat 2 Tbsp of oil and add cumin and ginger.\n\n\n" +
                "3.Stir-fry till well mixed and add the beans, gourd, cauliflower and carrots and stir over high heat to dry off the excess moisture.\n\n\n" +
                "4.Add the coriander, amchoor, salt and chillies, turn around a few times and shut off the heat.\n\n\n" +
                "5.When cool mix in the potato.\n\n\n" +
                "6.Form into round or oval cutlets.\n\n\n" +
                "7.Dust the cutlets with refined flour, then dip into the beaten egg.\n\n\n" +
                "8.Now coat with the crumbs.\n\n\n" +
                "9.Repeat by dipping the crumbed cutlets into egg and crumbs once more.\n\n\n" +
                "10.Deep-fry the cutlets to a golden color and serve.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
