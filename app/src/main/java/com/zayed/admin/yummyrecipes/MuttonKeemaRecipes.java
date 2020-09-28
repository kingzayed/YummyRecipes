package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MuttonKeemaRecipes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_keema);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String para = "1.Marinate the mince with all the marinating ingredients. .\n\n\n" +
                "2.Leave overnight in the fridge or at least for four to five hours.\n\n\n" +
                "Cooking the Qeema:\n\n\n" +
                "1.Add the curd and onions to the marinated mince an hour before cooking.\n\n\n" +
                "2.Heat oil and add cloves and cardamoms, allowing them to crackle for a minute or two.\n\n\n" +
                "3.Now add the marinated mince. Stir it for a few minutes on medium flame and then leave on low flame till done.\n\n\n" +
                "4.Do not use the pressure cooker. As it is a dry dish, let the excess water from the marination evaporate fully.\n\n\n" +
                "5.After the qeema is cooked, prepare to smoke it.\n\n\n" +
                "6.Light a small piece of coal over the stove flame, then place it on an onion slice, pour a few drops of oil on the live coal so it smokes.\n\n\n" +
                "7.Then, leave the smoking coal over the mince and cover the cooking pot with a lid. Let it remain there for a few minutes.\n\n\n" +
                "8.We sometimes use a long deep spoon, place the smoking coal on it and close the lid. It adds an exceptional smoked aroma.\n\n\n" +
                "9.Garnish with fresh coriander leaves, onions rings, chopped green chillies, finely shredded ginger strips and a sprinkling of garam masala.\n\n\n" +
                "10.A squeeze of lemon juice adds a bit of tanginess.";
        textPreparation.setText(para);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
