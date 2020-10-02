package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ChineseGridView extends Activity {

    private int [] ChineseImages = {R.drawable.vegspringroll,R.drawable.machurian,R.drawable.creamsoup,R.drawable.chowmeinchicken,R.drawable.chickenhakkanoodles,R.drawable.chickenfriedrice};
    private String [] ChineseNames = {"Veg Spring Roll","Veg Manchurian","Chicken Soup","Chow Mein Chicken","Chicken Hakka Noodles","Chicken Fried Rice"};
    private GridView gridView;
    private ChineseGridViewAdapter chineseGridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chinese);

        gridView = (GridView)findViewById(R.id.chinesegrid);
        chineseGridViewAdapter = new ChineseGridViewAdapter(this,ChineseImages,ChineseNames);
        gridView.setAdapter(chineseGridViewAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(ChineseGridView.this,VegSpringRoll.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(ChineseGridView.this,VegMachurian.class);
                        startActivity(intent1);
                        break;


                    case 2:
                        Intent intent2 = new Intent(ChineseGridView.this,CreamChickenSoup.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(ChineseGridView.this,ChowMeinChicken.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(ChineseGridView.this,ChickenHakkaNoodles.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(ChineseGridView.this,ChickenFriedRice.class);
                        startActivity(intent5);
                        break;
                }
            }
        });


    }
}
