package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class BreakfastGridView extends Activity {

    private GridView gridView;
    private int [] BreakfastMenuImages = {R.drawable.alooparatha,R.drawable.idli,R.drawable.sabudanakhichdi,R.drawable.pohaa,R.drawable.omlet,R.drawable.eggbhurji,R.drawable.dosa,R.drawable.misalpav};
    private String [] BreakfastMenuNames = {"Aloo Paratha","Idli","Sabudana Khichri","Poha","Omlette","Egg Bhurji","Masala Dosa","Misal Pav"};
    private BreakfastGridViewAdapter breakfastGridViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_breakfast);


        gridView = (GridView)findViewById(R.id.breakfastgrid);
        breakfastGridViewAdapter = new BreakfastGridViewAdapter(this,BreakfastMenuImages,BreakfastMenuNames);
        gridView.setAdapter(breakfastGridViewAdapter);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(BreakfastGridView.this,AlooParatha.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(BreakfastGridView.this,Idli.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(BreakfastGridView.this,SabudanaKhirchdi.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(BreakfastGridView.this,Poha.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(BreakfastGridView.this,Omlette.class);
                        startActivity(intent4);
                        break;

                    case  5:
                        Intent intent5 = new Intent(BreakfastGridView.this,FryEgg.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(BreakfastGridView.this,MasalaDosa.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(BreakfastGridView.this,MisalPav.class);
                        startActivity(intent7);
                        break;
                }


            }
        });

    }
}
