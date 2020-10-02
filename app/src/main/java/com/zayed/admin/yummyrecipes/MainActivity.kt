package com.zayed.admin.yummyrecipes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private ListView MenuListview;
    private MenuRecipesAdapter menuAdapter;
    private int [] MenuImages = {R.drawable.chickenimage,R.drawable.mutton,R.drawable.veg,R.drawable.fish,R.drawable.chinese,R.drawable.burger,R.drawable.sweetdish,R.drawable.breakfast,R.drawable.icecream};
    private String [] MenuNames = {"Chicken","Mutton","Vegeterians","Seafood","Chinese","Quick Bites","Deserts","Breakfast","Ice Cream"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MenuListview = (ListView)findViewById(R.id.list);
        menuAdapter = new MenuRecipesAdapter(this,MenuImages,MenuNames);
        MenuListview.setAdapter(menuAdapter);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-2134930141935380~1111527653");




    MenuListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position)
            {
                case 0:
                    Intent intent = new Intent(MainActivity.this,ChickenGridView.class);
                    startActivity(intent);
                    break;

                case 1:
                    Intent intent1 = new Intent(MainActivity.this,MuttonGridView.class);
                    startActivity(intent1);
                    break;


                case 2 :
                    Intent intent2 = new Intent(MainActivity.this,VegGridView.class);
                    startActivity(intent2);
                    break;

                case 3:
                    Intent intent3 = new Intent(MainActivity.this,FishGridView.class);
                    startActivity(intent3);
                    break;

                case 4:
                    Intent intent4 = new Intent(MainActivity.this,ChineseGridView.class);
                    startActivity(intent4);
                    break;

                case  5:
                    Intent intent5 = new Intent(MainActivity.this,JunkFoodGridView.class);
                    startActivity(intent5);
                    break;


                case 6:
                    Intent intent7 = new Intent(MainActivity.this,DesertsGridView.class);
                    startActivity(intent7);
                    break;


                case 7:
                    Intent intent6 = new Intent(MainActivity.this,BreakfastGridView.class);
                    startActivity(intent6);
                    break;

                case 8:
                    Intent intent8 = new Intent(MainActivity.this,IceCreamGridView.class);
                    startActivity(intent8);
                    break;

            }
        }
    });


    }

    @Override
    public void onBackPressed() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            //your_activity.finish();......(1)
                            //otherwise use your code..
                            Intent intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);

                        }
                    })

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();

        }
}

