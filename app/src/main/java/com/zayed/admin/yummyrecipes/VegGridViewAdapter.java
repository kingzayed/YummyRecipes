package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class VegGridViewAdapter extends BaseAdapter {

    private int [] VegImages;
    private String [] VegNames;
    private Context context;

    public VegGridViewAdapter(Context context,int[] vegImages, String[] vegNames) {
        this.context = context;
        this.VegImages = vegImages;
        this.VegNames = vegNames;
    }

    @Override
    public int getCount() {
        return VegImages.length;
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
            view = LayoutInflater.from(context).inflate(R.layout.layout_veg,null);
        }
        else
        {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(VegImages[position]);
        textView = (TextView)view.findViewById(R.id.vegtext);
        textView.setText(VegNames[position] + "");
        textView.setTextSize(20);



        return view;
    }
}
