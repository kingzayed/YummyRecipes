package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MuttonGridView extends Activity {

    private int [] MuttonGridImage = {R.drawable.muttoncutleta,R.drawable.muttonseekh,R.drawable.muttonkarahi,R.drawable.muttonkeema,R.drawable.muttonkorma,R.drawable.roganjosh,R.drawable.muttonbiryania,R.drawable.muttonpuloa};
    private String [] MuttonGridNames = {"Cutlet Kebab","Seekh Kebab","Mutton Karahi","Mutton Keema","Mutton Korma","Rogan Josh","Mutton Biryani","Mutton Pulao"};
    private GridView gridView;
    private MuttonGridAdapter muttonGridAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mutton);

        gridView = (GridView)findViewById(R.id.muttongrid);
        muttonGridAdapter = new MuttonGridAdapter(this,MuttonGridImage,MuttonGridNames);
        gridView.setAdapter(muttonGridAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(MuttonGridView.this,CutletKebab.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(MuttonGridView.this,SeekhKebabrecipes.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(MuttonGridView.this,MuttonkarahiRecipes.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(MuttonGridView.this,MuttonKeemaRecipes.class);
                        startActivity(intent3);
                        break;

                    case 4:

                    Intent intent4 = new Intent(MuttonGridView.this,MuttonKorma.class);
                    startActivity(intent4);
                    break;

                    case 5:
                        Intent intent5 = new Intent(MuttonGridView.this,RoganJoshRecipes.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(MuttonGridView.this,MuttonBiryani.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(MuttonGridView.this,MuttonPuloaRecipes.class);
                        startActivity(intent7);
                        break;
                }

            }
        });
    }
}

