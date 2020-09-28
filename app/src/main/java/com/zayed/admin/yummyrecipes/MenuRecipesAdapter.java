package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MenuRecipesAdapter extends BaseAdapter {

    private int [] MenuImages;
    private MenuRecipesAdapter menuAdapter;
    private String [] MenuNames;
    private Context context;
    private ListView MenuListview;

    public MenuRecipesAdapter(Context context,int[] menuimages,String[] menunames)
    {
        this.context = context;
        this.MenuImages = menuimages;
        this.MenuNames = menunames;
    }

    @Override
    public int getCount() {
        return MenuImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ImageView mimageView;
        TextView textView;

        if(convertView == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.layout_menu,null);
        }
        else
        {
            view = convertView;
        }
        mimageView = (ImageView)view.findViewById(R.id.imageview);
        mimageView.setImageResource(MenuImages[position]);
        textView = (TextView)view.findViewById(R.id.menunames);
        textView.setText(MenuNames[position]+"");
        textView.setTextSize(25);
        return view;
    }
}

