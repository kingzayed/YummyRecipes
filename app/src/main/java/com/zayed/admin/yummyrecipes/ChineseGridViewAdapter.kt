package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ChineseGridViewAdapter extends BaseAdapter {

    private int [] ChineseImages;
    private String [] ChineseNames;
    private GridView gridView;
    private Context context;

    public ChineseGridViewAdapter(Context context, int[] chineseImages, String[] chineseNames) {
        this.context = context;
        this.ChineseImages = chineseImages;
        this.ChineseNames = chineseNames;
    }

    @Override
    public int getCount() {
        return ChineseImages.length;
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
            view = LayoutInflater.from(context).inflate(R.layout.layout_chinese,null);
        }
        else
        {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(ChineseImages[position]);
        textView = (TextView)view.findViewById(R.id.textchinese);
        textView.setText(ChineseNames[position] + "");
        textView.setTextSize(20);

        return view;
    }
}
