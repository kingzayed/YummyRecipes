package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class DesertsGridViewAdapter extends BaseAdapter {

    private GridView gridView;
    private int [] DesertImages;
    private String [] DesertsNames;
    private Context context;

    public DesertsGridViewAdapter(Context context, int[] desertsImages, String[] desertsName) {
        this.context = context;
        this.DesertImages = desertsImages;
        this.DesertsNames = desertsName;
    }

    @Override
    public int getCount() {
        return DesertImages.length;
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

        if(convertView == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.layout_deserts,null);
        }
        else {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(DesertImages[position]);
        textView = (TextView)view.findViewById(R.id.textdeserts);
        textView.setText(DesertsNames[position] + "");
        textView.setTextSize(20);
        return view;
    }
}
