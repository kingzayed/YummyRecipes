package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ButterScotch extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_buterscotch);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1 cup firmly packed brown sugar \n" +
                "2.2 tablespoons butter \n" +
                "3.1 tablespoon vanilla 1 \n" +
                "4.1/2 cups whipping cream \n" +
                "5.2 cups half-and-half (light cream)\n" +
                "6.6 large egg yolks";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1\n" +
                "In a 1- to 2-quart pan over medium heat, stir brown sugar, butter, and vanilla until butter is melted, sugar is dissolved, and mixture is bubbly, 3 to 4 minutes. Whisk in 1/2 cup whipping cream until smooth; remove butterscotch mixture from heat.\n" +
                "\n" +
                "2\n" +
                "In a 3- to 4-quart pan over medium-high heat, combine remaining 1 cup whipping cream and the half-and-half; bring to a simmer.\n" +
                "\n" +
                "3\n" +
                "Meanwhile, in a bowl, beat egg yolks to blend. Whisk 1/2 cup of the warm cream mixture into egg yolks, then pour egg yolk mixture into pan with cream. Stir constantly over low heat just until mixture is slightly thickened, 2 to 4 minutes. Immediately remove from heat.\n" +
                "\n" +
                "4\n" +
                "Pour through a fine strainer into a clean bowl and whisk in butterscotch mixture. Chill until cold, stirring occasionally, about 2 hours; or cover and chill up to 1 day.\n" +
                "\n" +
                "5\n" +
                "Freeze mixture in an ice cream maker according to manufacturer's instructions. Serve softly frozen, or transfer ice cream to an airtight container and freeze until firm, at least 6 hours or up to 1 week.";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}

