package com.zayed.admin.yummyrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class JunkFoodGridViewAdapter extends BaseAdapter {

    private GridView gridView;
    private int [] JunkImages;
    private String [] JunkNames;
    private Context context;


    public JunkFoodGridViewAdapter(Context context, int[] junkImages, String[] junkNames) {
        this.context = context;
        this.JunkImages = junkImages;
        this.JunkNames = junkNames;
    }

    @Override
    public int getCount() {
        return JunkImages.length;
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
            view = LayoutInflater.from(context).inflate(R.layout.layout_junkfood,null);
        }
        else
        {
            view = convertView;
        }
        imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(JunkImages[position]);
        textView = (TextView)view.findViewById(R.id.textjunk);
        textView.setText(JunkNames[position] + "");
        textView.setTextSize(20);

        return view;
    }
}
