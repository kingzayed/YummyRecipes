package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MuttonKorma extends Activity {

    private ImageView imageView;
    private TextView textName;
    private TextView textingredients;
    private TextView textPreparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_muttonkorma);


        imageView = (ImageView)findViewById(R.id.imageview);
        textName = (TextView)findViewById(R.id.textname);
        textingredients = (TextView)findViewById(R.id.ingredients);
        textPreparation = (TextView) findViewById(R.id.Preparation);


        String para = "1.Take 1 tbsp of ghee and fry the ginger and garlic paste.\n\n\n" +
                "2.Then add the green cardamom, cinnamon stick, cloves, bay leaves, whole black peppers\n\n\n" +
                "3.and a pinch of Javitri.\n\n\n" +
                "4.After a few minutes, add the mutton till the color turns white. Add salt.\n\n\n" +
                "5.Take 3 onions cut lengthwise, and fry them in vegetable oil till they turn brown.\n\n\n" +
                "6.Add the yoghurt with red chillies mix, as well as brown onion paste to the meat. Add 2 cups of water, and let the meat cook on medium heat.\n\n\n" +
                "7.Just before the meat is done, add the cashew nut paste.\n\n\n" +
                "8.For a lovely last step, add the rose water and saffron.";
        textPreparation.setText(para);
        textPreparation.setMovementMethod(new ScrollingMovementMethod());
    }
}
