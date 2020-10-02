package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MisalPav extends Activity {
    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_misalpav);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "For paste of gravy/sauce:\n\n" +
                "1.2 Tbsp Oil\n\n" +
                "2.1 tsp Ginger paste\n\n" +
                "3.1 tsp Garlic paste\n\n" +
                "4.1 Cup Onion, chopped\n\n" +
                "5.1 Cup Tomato, chopped\n\n" +
                "6.3/4 Cup Coconut, grated\n\n" +
                "To make gravy/sauce (Kat in Marathi):\n\n" +
                "1.3 Tbsp Oil\n\n" +
                "2.Spice Paste (as above)\n\n" +
                "3.To taste Salt\n\n" +
                "4.1 tsp Red chilly paste\n\n" +
                "5.1 tsp Garam masala\n\n" +
                "6.1/2 tsp Turmeric powder\n\n" +
                "7.1 tsp Cumin-coriander powder\n\n" +
                "8.1/2 tsp Cinnamon & clove powder\n\n" +
                "9.3 Cups Water (or as required to adjust the consistency)\n\n" +
                "To make usal:\n\n" +
                "1.3 Tbsp Oil\n\n" +
                "2.1 tsp Garlic paste\n\n" +
                "3.1 tsp Ginger paste\n\n" +
                "4.1/2 tsp Hing (asafoetida)\n\n" +
                "5.1 1/2 Cups Steamed matki (moth) (soaked overnight)\n\n" +
                "6.1 Cup Potato (cut into square pieces), boiled\n\n" +
                "7.1/2 tsp Turmeric powder\n\n" +
                "8.1 tsp Garam masala\n\n" +
                "9.1/2 tsp Cinnamon-clove powder\n\n" +
                "10.1 Lime juice\n\n" +
                "11.3 Cups Water (or as required)\n\n" +
                "12.To taste Salt\n\n" +
                "For garnishing:\n\n" +
                "1.Onion, chopped\n\n" +
                "2.Mix dry farsan\n\n" +
                "3.Coriander, chopped\n\n" +
                "4.To serve with: Paav, slice of lemon";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "Prepare paste:\n\n\n" +
                "1.Heat oil in a pan. Add ginger paste, garlic paste and chopped onion.\n\n\n" +
                "2.Saute till the onion is transculent.\n\n\n" +
                "3.Now add chopped tomatoes and grated coconut. Mix well and saute it for few minutes.\n\n\n" +
                "4.Allow the mixture to cool then grind it into a smooth paste.\n\n\n" +
                "Prepare gravy/sauce ('Kat' in Marathi):\n\n\n" +
                "1.Heat oil in a pan. Add the ready paste into oil and saute it for about 2 minutes.\n\n\n" +
                "2.Now add salt, red chilly powder, garam masala, turmeric powder, cumin-coriander powder, clove-cinnamon powder and mix it.\n\n\n" +
                "3.Add water and cook till the mixture starts leaving oil.\n\n\n" +
                "4.Transfer it in a bowl and keep it aside.\n\n\n" +
                "Prepare Usal:\n\n\n" +
                "1.Heat oil in a pan. Add ginger paste, garlic paste and asafoetida.\n\n\n" +
                "2.Saute it for a minute and add soaked & boiled sprouts along with potatoes. Mix it well.\n\n\n" +
                "3.Now add salt, turmeric powder, garam masala, clove-cinnamon powder and lime juice.\n\n\n" +
                "4.Add water to it and cook it for about 8-10 minutes.\n\n\n" +
                "5.Transfer it in a separate bowl.\n\n\n" +
                "Prepare Misal:\n\n\n" +
                "1.Take a serving bowl. First pour ready usal in the bowl and then pour the red gravy over it.\n\n\n" +
                "2.Thereafter, add finely chopped onion and farsan to the mixture.\n\n\n" +
                "3.Garnish it with chopped coriander. Serve it with pav and a slice of lemon";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
