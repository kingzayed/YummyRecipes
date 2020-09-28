package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class IceCreamGridViewAdapter extends BaseAdapter {

    private int [] IceCreamMenuImages;
    private String [] IceCreamMenuNames;
    private Context context;
    private GridView gridView;


    public IceCreamGridViewAdapter(int[] iceCreamMenuImages, String[] iceCreamMenuNames, Context context) {
        IceCreamMenuImages = iceCreamMenuImages;
        IceCreamMenuNames = iceCreamMenuNames;
        this.context = context;
    }

    @Override
    public int getCount() {
        return IceCreamMenuImages.length;
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
            view = LayoutInflater.from(context).inflate(R.layout.layout_icecream,null);
        }
        else
        {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(IceCreamMenuImages[position]);
        textView = (TextView)view.findViewById(R.id.icecreamname);
        textView.setText(IceCreamMenuNames[position]+ "");
        textView.setTextSize(20);
        return view;
    }

}

