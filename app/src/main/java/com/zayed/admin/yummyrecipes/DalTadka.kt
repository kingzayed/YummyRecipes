package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class DalTadka extends Activity {
    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daltakka);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1/2 Cup Chana Dal\n\n" +
                "2.1/2 Cup Toor Dal\n\n" +
                "3.1/2 tsp Turmeric Powder\n\n" +
                "4.1/2 tsp Salt\n\n" +
                "5.1 Cup Water\n\n" +
                "For Gravy:\n\n" +
                "1.2 Tbsp Oil\n\n" +
                "2.1 tsp Cumin seeds\n\n" +
                "3.1 tsp Ginger-Garlic paste\n\n" +
                "4.1 Onion, chopped\n\n" +
                "5.1 Tomato, chopped\n\n" +
                "6.1/4 tsp Salt\n\n" +
                "7.1 tsp Coriander Powder\n\n" +
                "8.1/2 tsp Garam Masala\n\n" +
                "9.1 Green chilli, chopped\n\n" +
                "10.1/2 Cup Dal Water\n\n" +
                "11.1/2 tsp Kasoori Methi\n\n" +
                "For Tadka:\n\n" +
                "1.2 Tbsp Oil\n\n" +
                "2.1/2 tsp Cumin Seeds\n\n" +
                "3.1 tsp Garlic, chopped\n\n" +
                "4.2 Red whole chillis\n\n" +
                "5.1/2 tsp Ginger\n\n" +
                "6.1/2 tsp Red chilli powder\n\n" +
                "7.2 Tbsp Coriander leaves";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.In a bowl soak chana dal for 2 hours.Punjabi Dal Tadka\n\n\n" +
                "2.Similarly in another bowl soak toor dal.Punjabi Dal Tadka\n\n\n" +
                "3.After soaking, put both in a pressure cooker adding salt, turmeric powder and water.Punjabi Dal Tadka\n\n\n" +
                "4.Pressure cook the dals for about 5-8 minutes (3-4 whistles) until both are cooked completely.\n\n\n" +
                "To Prepare Gravy:\n\n\n" +
                "1.Heat oil in a pan and add cumin seeds.Punjabi Dal Tadka\n\n\n" +
                "2.When they crackle add ginger garlic paste and mix well.Punjabi Dal Tadka\n\n\n" +
                "3.Add onion and cook until it appears golden pink.Punjabi Dal Tadka\n\n\n" +
                "4.Now add tomatoes, mix and cook a little more.Punjabi Dal Tadka\n\n\n" +
                "5.Then add salt, coriander powder, garam masala, and green chilli to it and cook for a minute.Punjabi Dal Tadka\n\n\n" +
                "6.Add dal water which persisted after boiling the dal and kasoori methi along with it.Punjabi Dal Tadka\n\n\n" +
                "7.Pour the boiled dal in this onion tomato gravy and let it boil on sim.Punjabi Dal Tadka\n\n\n" +
                "8.Add more water if required.\n\n\n" +
                "To Prepare Tadka:\n\n\n" +
                "1.In a pan heat oil and add cumin seeds. Let it crackle.Punjabi Dal Tadka\n\n\n" +
                "2.Add garlic, red whole chillis, and ginger. Cook for few seconds.Punjabi Dal Tadka\n\n\n" +
                "3.Put red chilli powder and coriander leaves. Mix well.Punjabi Dal Tadka\n\n\n" +
                "4.Pour the tadka over the cooked dal.Punjabi Dal Tadka\n\n\n" +
                "5.Punjabi Dal Tadka is ready. Serve it hot with roti, naan or jeera rice.Punjabi Dal Tadka";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
