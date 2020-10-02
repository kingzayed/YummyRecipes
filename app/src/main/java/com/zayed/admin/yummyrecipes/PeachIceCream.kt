package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class PeachIceCream extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_peachesicecream);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.4 cups ripe peaches, peeled, pitted, and cut into 1/2-inch pieces (about 6 medium peaches)\n" +
                "2.1/2 teaspoon lemon juice\n" +
                "3.1/2 cup granulated sugar\n" +
                "4.2 cups heavy cream\n" +
                "5.1 (14 ounce) can sweetened condensed milk";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.Stir the peaches, lemon juice, and sugar in a medium-sized bowl to combine.\n Set aside until a syrup accumulates in the bowl, about 1 hour.\n Add the peaches and syrup to a blender and pulse until almost pureed, just enough to break down the large pieces.\n Transfer puree to a medium saucepan. Heat over medium-high heat until reduced and thickened, about 5 minutes; stir occasionally.\n Transfer to a bowl and refrigerate until cold, about 2 hours.\n" +
                "2.Add the heavy cream to a large bowl. Using an electric mixer beat until stiff peaks form. Turn the speed to low and slowly pour in the condensed milk. Turn the speed back up to high and beat until thickened.\n" +
                "3.Transfer 2 cups of the whipped cream to a separate bowl. Add in the puree and mix until well combined. Fold into the remaining whipped cream. Transfer to a freezer-safe container and freeze for at least 6 hours.\n";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}

