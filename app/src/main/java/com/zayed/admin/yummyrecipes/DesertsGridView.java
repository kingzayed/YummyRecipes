package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class DesertsGridView extends Activity {

    private int [] DesertsImages = {R.drawable.gulabjamun,R.drawable.rasmalai,R.drawable.rasgulla,R.drawable.pancakes,R.drawable.fruitsalad,R.drawable.donuts,R.drawable.chocalatelava,R.drawable.carrotshalwa,R.drawable.badamkheer,R.drawable.malpua};
    private String [] DesertsName = {"Gulab Jamun","Rasmalai","Rasgulla","Pancakes","Fruit Salad","Donuts","Choco Lava Cake","Carrots Halwa","Badam Kheer","Malpua"};
    private GridView gridView;
    private DesertsGridViewAdapter desertsGridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_deserts);

        gridView = (GridView)findViewById(R.id.desertgrid);
        desertsGridViewAdapter = new DesertsGridViewAdapter(this,DesertsImages,DesertsName);
        gridView.setAdapter(desertsGridViewAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(DesertsGridView.this,GulabJamun.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(DesertsGridView.this,Rasmali.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(DesertsGridView.this,Rasgulla.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(DesertsGridView.this,Pancakes.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(DesertsGridView.this,FruitsSalads.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(DesertsGridView.this,Donuts.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(DesertsGridView.this,ChocoLavaCakes.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(DesertsGridView.this,CarrotsHalwa.class);
                        startActivity(intent7);
                        break;

                    case 8:
                        Intent intent8 = new Intent(DesertsGridView.this,BadamKheer.class);
                        startActivity(intent8);
                        break;

                    case 9:
                        Intent intent9 = new Intent(DesertsGridView.this,Malpua.class);
                        startActivity(intent9);
                        break;


                }
                }

        });
    }
}
