package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class LobsterTails extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lobstertails);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.1 whole lobster (weighing approx. 500 grams)\n\n" +
                "2.100 gms mushrooms\n\n" +
                "3.8 gms garlic\n\n" +
                "4.10 gms red onion\n\n" +
                "5.50 ml fresh cream\n\n" +
                "6.1 egg yolk\n\n" +
                "7.60 ml cognac\n\n" +
                "10.10 gm thyme\n\n" +
                "11.A pinch of nutmeg\n\n" +
                "12.10 - 20 gms Parmesan cheese\n\n" +
                "13.20 - 30 gms Gruyere cheese";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Split the lobster length-wise into two parts and clean the head thoroughly under cold running water.\n\n\n" +
                "2.Scope all the meat from the lobster and clean. Keep the shell aside for finishing in the oven.\n\n\n" +
                "3.Now dice the Lobster meat. In another pan sauté the garlic and onion & later add the sliced mushrooms.\n\n\n" +
                "4.After the mushroom has slightly dried out add in the lobster meat and de-glaze with 30 ml Cognac.\n\n\n" +
                "5.In another pan, add the rest of the Cognac to the fresh cream and one egg yolk, grate the nutmeg and mix well.\n\n\n" +
                "6.Add this mixture to the pan containing lobster and mix well, mix in the thyme now.\n\n\n" +
                "7.Get the pan off the flame and mix well till it turns thick. Fill the cleaned empty shell of the lobster with this mixture that has been prepared.\n\n\n" +
                "8.Top up the lobster with Gruyère cheese and Parmesan cheese. Finish in a medium hot oven for 4 minutes.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
