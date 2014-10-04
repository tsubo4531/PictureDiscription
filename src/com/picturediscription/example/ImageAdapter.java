package com.picturediscription.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ImageAdapter extends ArrayAdapter<Integer> {
    private Context mContext;
    private LayoutInflater mInflater;

    public ImageAdapter(Context context, Integer[] objects) {
            super(context, 0, objects);
            mContext = context;
            mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    
    // ImageViewに対応するビットマップを表示
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                    convertView = mInflater.inflate(R.layout.gallery_item, parent, false);
            }
            imageView = (ImageView) convertView.findViewById(R.id.gallery_image_view);
            imageView.setImageResource(getItem(position));

            return convertView;
    }
}

