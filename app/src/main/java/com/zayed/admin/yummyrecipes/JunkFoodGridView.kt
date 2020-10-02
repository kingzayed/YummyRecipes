package com.zayed.admin.yummyrecipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class JunkFoodGridView extends Activity {

    private int [] JunkImages = {R.drawable.vegburger,R.drawable.chickenburger,R.drawable.chickenswarma,R.drawable.frenchfries,R.drawable.cheesepizza,R.drawable.bbqchickenpizza,R.drawable.jalapenopoppers,R.drawable.chickensandwich};
    private GridView gridView;
    private String [] JunkNames = {"Veg Burger","Chicken Burger","Chicken shawarma","French Fries","Cheese Mozzarella Pizza","BBQ Chicken Pizza","Veg Jalapeno Poppers","Chicken Sandwich"};
    private JunkFoodGridViewAdapter junkFoodGridViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_junkfood);

        gridView = (GridView)findViewById(R.id.junkgrid);
        junkFoodGridViewAdapter = new JunkFoodGridViewAdapter(this,JunkImages,JunkNames);
        gridView.setAdapter(junkFoodGridViewAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(JunkFoodGridView.this,VegBurger.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(JunkFoodGridView.this,ChickenBurger.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(JunkFoodGridView.this,ChickenShawarma.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(JunkFoodGridView.this,FrenchFries.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(JunkFoodGridView.this,CheesePizza.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(JunkFoodGridView.this,ChickenPizza.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(JunkFoodGridView.this,VegJalapenoPoppers.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(JunkFoodGridView.this,ChickenSandwiches.class);
                        startActivity(intent7);
                        break;

                }
            }
        });
    }
}
