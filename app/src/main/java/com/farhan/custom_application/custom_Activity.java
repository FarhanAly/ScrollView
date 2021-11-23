package com.farhan.custom_application;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom_Activity extends BaseAdapter {
    Context context;
    String[]Name;
    String[]Subtitle;
    int[]Image;
    LayoutInflater inflater;

    public custom_Activity(Context context, String[] name, String[] subtitle, int[] image) {
        this.context = context;
        Name = name;
        Subtitle = subtitle;
        this.Image = image;
        inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return Name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       convertView=inflater.inflate(R.layout.sample_layout,null);

        TextView title=convertView.findViewById(R.id.textview1);
        TextView subtitle=convertView.findViewById(R.id.textview2);
        ImageView image=convertView.findViewById(R.id.image1);


        title.setText(Name[position]);
        subtitle.setText(Subtitle[position]);
        image.setImageResource(Image[position]);

        return convertView;
    }
}
