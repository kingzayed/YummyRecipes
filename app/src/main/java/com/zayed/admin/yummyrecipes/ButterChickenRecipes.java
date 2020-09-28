package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ButterChickenRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_butterchicken);


    imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "700 Gram Raw chicken\n\n" +
                "For the Marinade:\n\n" +
                "1.1 tsp Red chilli powder\n\n" +
                "2.1 tsp Ginger and garlic paste\n\n" +
                "3.To taste Salt\n\n" +
                "4.1/2 Kg Curd\n\n" +
                "For the Gravy:\n\n" +
                "1.175 Gram White butter\n\n" +
                "2.1/2 tsp Black cumin seeds\n\n" +
                "3.1/2 Kg Tomato, pureed\n\n" +
                "4.1/2 tsp Sugar\n\n" +
                "5.1 tsp Red chilli powder\n\n" +
                "To taste Salt\n\n" +
                "1.100 Gram Fresh cream\n\n" +
                "2.4 Green chillies, sliced\n\n" +
                "3.1/2 tsp Fenugreek leaves (crushed)\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.In a mixing bowl, mix red chilli powder, ginger garlic paste, salt and curd.\n\n\n" +
                "2.Add the raw chicken pieces to the marinade and mix well. Keep it in the refrigerator overnight or minimum 6 hours.\n\n\n" +
                "3.Roast the marinated chicken in a tandoor or an oven for about 10-12 minutes until it is three-fourth done.\n\n\n" +
                "Prepare the chicken gravy:\n\n\n" +
                "1.Heat half the quantity of white butter in pan.\n\n\n" +
                "2.Pour in the tomato puree, and saute for 2-3 minutes.\n Add cumin seeds, sugar, red chilli powder and salt.\n Mix well.\n\n\n" +
                "3.Add the prepared chicken, white butter, fresh cream, sliced green chillies and crushed fenugreek leaves.\n Saute for 3-4 minutes and let the chicken cook.\n\n\n" +
                "4.Cook till chicken is done. Serve hot with rice or naan.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
    }

