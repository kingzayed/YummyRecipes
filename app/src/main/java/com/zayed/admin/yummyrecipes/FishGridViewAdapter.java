package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class FishGridViewAdapter extends BaseAdapter {

    private GridView gridView;
    private int [] FishImages;
    private String [] FishNames;
    private Context context;

    public FishGridViewAdapter(Context context, int[] fishImages, String[] fishNames) {
        this.context = context;
        this.FishImages = fishImages;
        this.FishNames = fishNames;
    }

    @Override
    public int getCount() {
        return FishImages.length;
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
            view = LayoutInflater.from(context).inflate(R.layout.layout_fish,null);
        }
        else
        {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(FishImages[position]);
        textView = (TextView)view.findViewById(R.id.textfish);
        textView.setText(FishNames[position] + "");
        textView.setTextSize(20);


        return view;
    }
}
