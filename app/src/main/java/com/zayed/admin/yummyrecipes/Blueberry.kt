package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Blueberry extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_blueberry);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String ing = "1.4 cups fresh or frozen blueberries\n" +
                "2.2 cups sugar\n" +
                "3.2 tablespoons water\n" +
                "4.4 cups half-and-half cream";
        textingredients.setText(ing);
        textingredients.setMovementMethod(new ScrollingMovementMethod());


        String prepare = "1.In a large saucepan, combine the blueberries, sugar and water. Bring to a boil.\n Reduce heat; simmer, uncovered, until sugar is dissolved and berries are softened.\n Press mixture through a fine-mesh strainer into a bowl; discard pulp.\n Stir in cream. Cover and refrigerate overnight.\n" +
                "2.Fill cylinder of ice cream freezer two-thirds full; freeze according to the manufacturer’s directions. \n(Refrigerate any remaining mixture until ready to freeze.)\n Transfer ice cream to freezer containers, allowing headspace for expansion.\n Freeze until firm, 2-4 hours. Repeat with any remaining ice cream mixture.\n";
        textPreparation.setText(prepare);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}

