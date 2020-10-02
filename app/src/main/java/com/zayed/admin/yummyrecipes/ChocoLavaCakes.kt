package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ChocoLavaCakes extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chocolava);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.135 Gram Dark chocolate\n\n" +
                "2.95 Gram Butter\n\n" +
                "3.100 Gram Icing sugar\n\n" +
                "4.2 each Egg yolks + whole eggs\n\n" +
                "5.35 Gram Flour\n\n";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Pre heat the oven at 200 degrees.\n\n\n" +
                "2.In a microwaveable bowl add chocolate and butter. Melt it. (You can melt using the double boiler method too.)\n\n\n" +
                "3.In another bowl whisk together sugar and eggs.\n\n\n" +
                "4.Mix together the chocolate-butter mixture with the sugar-eggs mixture.\n\n\n" +
                "5.Fold in the flour.\n\n\n" +
                "6.Strain the mixture to remove any lumps.\n\n\n" +
                "7.Keep this in the fridge for 5-7 minutes to chill.\n\n\n" +
                "8.Pour the batter in greased ramekins.\n\n\n" +
                "9.Bake for 9-10 minutes.\n\n\n" +
                "10.Serve with whipped cream / vanilla ice cream or fresh fruits.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
