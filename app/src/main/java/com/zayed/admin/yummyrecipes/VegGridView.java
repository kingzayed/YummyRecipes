package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class VegGridView extends Activity {

    private GridView gridView;
    private int [] VegImages = {R.drawable.alootikkia,R.drawable.vegcrispy,R.drawable.vegcutleta,R.drawable.pavbhajia,R.drawable.palakpannera,R.drawable.matarpannera,R.drawable.malaikoftaa,R.drawable.daltadka,R.drawable.chanamasala,R.drawable.beancurry};
    private String [] VegNames = {"Aloo Tikki","Veg Crispy","Veg Cutlet","Pav Bhaji","Palak Panner","Matar Panner","Malai Kofta","Dal Tadka","Chana Masala","Bean Curry"};
    private VegGridViewAdapter vegGridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_veg);

        gridView = (GridView)findViewById(R.id.veggrid);
        vegGridViewAdapter = new VegGridViewAdapter(this,VegImages,VegNames);
        gridView.setAdapter(vegGridViewAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(VegGridView.this,AlooTikkiRecipes.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(VegGridView.this,VegCrispyRecipes.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(VegGridView.this,VegCutlet.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(VegGridView.this,PavBhajiRecipes.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(VegGridView.this,PalakPanner.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(VegGridView.this,MatarPanner.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(VegGridView.this,MalaiKofta.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(VegGridView.this,DalTadka.class);
                        startActivity(intent7);
                        break;

                    case 8:
                        Intent intent8 = new Intent(VegGridView.this,ChanaMasala.class);
                        startActivity(intent8);
                        break;

                    case 9:
                        Intent intent9 = new Intent(VegGridView.this,BeanCurry.class);
                        startActivity(intent9);
                        break;

                }

            }
        });


    }
}
