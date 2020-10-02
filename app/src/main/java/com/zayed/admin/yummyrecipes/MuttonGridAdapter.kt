package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MuttonGridAdapter extends BaseAdapter {

    private int [] MuttonGridImages;
    private String [] MuttonGridNames;
    private Context context;
    private GridView gridView;



    public MuttonGridAdapter(Context context,int[] muttonGridImage, String[] muttonGridNames) {

        this.context = context;
        this.MuttonGridImages = muttonGridImage;
        this.MuttonGridNames = muttonGridNames;
    }

    @Override
    public int getCount() {
        return MuttonGridImages.length;
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
            view = LayoutInflater.from(context).inflate(R.layout.layout_mutton,null);
        }
        else {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(MuttonGridImages[position]);
        textView = (TextView)view.findViewById(R.id.muttonnames);
        textView.setText(MuttonGridNames[position]+ "");
        textView.setTextSize(20);

        return view;
    }
}
