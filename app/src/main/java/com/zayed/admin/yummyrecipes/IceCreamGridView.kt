package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class IceCreamGridView extends Activity {

    private GridView gridView;
    private int [] IceCreamMenuImages = {R.drawable.peach,R.drawable.nutella,R.drawable.stawberry,R.drawable.vanilla,R.drawable.mango,R.drawable.blueberry,R.drawable.buterscotch,R.drawable.kulfi};
    private String [] IceCreamMenuNames = {"Peaches","Cream Nutella","Stawberry","Vanilla","Mango","Blueberry","Butterscotch","Kulfi"};
    private IceCreamGridViewAdapter iceCreamGridViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_icecream);


        gridView = (GridView)findViewById(R.id.icecreamgrid);
        iceCreamGridViewAdapter = new IceCreamGridViewAdapter(IceCreamMenuImages, IceCreamMenuNames, this);
        gridView.setAdapter(iceCreamGridViewAdapter);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(IceCreamGridView.this,PeachIceCream.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(IceCreamGridView.this,Nutella.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(IceCreamGridView.this,Stawberry.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(IceCreamGridView.this,Vanilla.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(IceCreamGridView.this,Mango.class);
                        startActivity(intent4);
                        break;

                    case  5:
                        Intent intent5 = new Intent(IceCreamGridView.this,Blueberry.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(IceCreamGridView.this,ButterScotch.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(IceCreamGridView.this,Kulfi.class);
                        startActivity(intent7);
                        break;
                }


            }
        });

    }
}

