package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class BreakfastGridViewAdapter extends BaseAdapter {

    private int [] BreakfastMenuImages;
    private String [] BreakfastMenuNames;
    private Context context;
    private GridView gridView;



    public BreakfastGridViewAdapter(Context context, int[] breakfastMenuImages, String[] breakfastMenuNames) {
        this.context = context;
        this.BreakfastMenuImages =breakfastMenuImages;
        this.BreakfastMenuNames = breakfastMenuNames;
    }

    @Override
    public int getCount() {
        return BreakfastMenuImages.length;
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
        ImageView imageView;
        TextView textView;

        if (convertView == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.layout_breakfast,null);
        }
        else
        {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(BreakfastMenuImages[position]);
        textView = (TextView)view.findViewById(R.id.breakfastnames);
        textView.setText(BreakfastMenuNames[position]+ "");
        textView.setTextSize(20);
        return view;
    }

}
