package com.example.home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ServiceImageAdapter extends BaseAdapter {

    private Context mContext;
    private int[] mServiceImages;

    public ServiceImageAdapter(Context context, int[] serviceImages) {
        mContext = context;
        mServiceImages = serviceImages;
    }

    @Override
    public int getCount() {
        return mServiceImages.length;
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
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(40, 40, 40, 40);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mServiceImages[position]);
        return imageView;
    }
}
