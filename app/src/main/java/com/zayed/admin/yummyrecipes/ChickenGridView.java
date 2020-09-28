package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ChickenGridView extends Activity {


    private GridView gridView;
    private int [] ChickenMenuImages = {R.drawable.chickenlollipopa,R.drawable.chickencrsipya,R.drawable.chickensixfivea,R.drawable.chickentikka,R.drawable.tandoorichicken,R.drawable.butterchickena,R.drawable.chickenhandi,R.drawable.chickenkofta,R.drawable.chickenkormaa,R.drawable.chickenbiryania};
    private String [] ChickenMenuNames = {"Chicken Lollipop","Chicken Crispy","Chicken 65","Chicken Tikka","Chicken Tandoori","Butter Chicken","Chicken Handi","Chicken Kofta","Chicken Korma","Chicken Biryani"};
    private ChickenGridAdapter chickenGridAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chicken);


        gridView = (GridView)findViewById(R.id.chickengrid);
        chickenGridAdapter = new ChickenGridAdapter(this,ChickenMenuImages,ChickenMenuNames);
        gridView.setAdapter(chickenGridAdapter);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(ChickenGridView.this,ChickenlollipopRecipes.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(ChickenGridView.this,ChickenCrispyRecipes.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(ChickenGridView.this,ChickenSixtyFive.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(ChickenGridView.this,ChickenTikkaRecipes.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(ChickenGridView.this,ChickenTandooriRecipes.class);
                        startActivity(intent4);
                        break;

                    case  5:
                        Intent intent5 = new Intent(ChickenGridView.this,ButterChickenRecipes.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(ChickenGridView.this,ChickenHandiRecipes.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(ChickenGridView.this,ChickenKoftaRecipes.class);
                        startActivity(intent7);
                        break;

                    case 8:
                        Intent intent8 = new Intent(ChickenGridView.this,ChickenKormaRecipes.class);
                        startActivity(intent8);
                        break;

                    case 9:
                        Intent intent9 = new Intent(ChickenGridView.this,ChickenBiryaniRecipes.class);
                        startActivity(intent9);
                        break;

                }


            }
        });

    }

}
