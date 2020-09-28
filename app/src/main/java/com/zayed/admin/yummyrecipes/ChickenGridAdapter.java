package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenGridAdapter extends BaseAdapter {

    private int [] ChickenMenuImages;
    private String [] ChickenMenuNames;
    private Context context;
    private GridView gridView;

    public ChickenGridAdapter(Context context, int[] chickenMenuImages,String [] chickenMenuNames) {
        this.context = context;
        this.ChickenMenuImages = chickenMenuImages;
        this.ChickenMenuNames = chickenMenuNames;
    }

    @Override
    public int getCount() {
        return ChickenMenuImages.length;
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
            view = LayoutInflater.from(context).inflate(R.layout.layout_chicken,null);
        }
        else
        {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(ChickenMenuImages[position]);
        textView = (TextView)view.findViewById(R.id.chickennames);
        textView.setText(ChickenMenuNames[position]+ "");
        textView.setTextSize(20);

        return view;
    }
}
