package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class FishGridView extends Activity {

    private GridView gridView;
    private int [] FishImages = {R.drawable.salmonfry,R.drawable.surmaicurry,R.drawable.skilletsalmon,R.drawable.prawncurry,R.drawable.malabharfish,R.drawable.lobstertail,R.drawable.grilledsalmon,R.drawable.bajafishtacos};
    private String [] FishNames = {"Salmon Fry","Surmai Curry","Skillets Salmon","Prawn Curry","Malabhar Fish","Lobster Tails","Grilled Salmon","Baja Tacos"};
    private FishGridViewAdapter fishGridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fish);

        gridView = (GridView)findViewById(R.id.fishgrid);
        fishGridViewAdapter = new FishGridViewAdapter(this,FishImages,FishNames);
        gridView.setAdapter(fishGridViewAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(FishGridView.this,SalmonFryRecipes.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(FishGridView.this,SurmaiCurryRecipes.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(FishGridView.this,SkilletSalmon.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(FishGridView.this,PrawnCurry.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(FishGridView.this,MalabharFish.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(FishGridView.this,LobsterTails.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(FishGridView.this,GrilledSalmon.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(FishGridView.this,BajaTacos.class);
                        startActivity(intent7);
                        break;
                }
            }
        });
    }
}
