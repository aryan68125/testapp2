package com.aditya.testapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Adapter extends BaseAdapter {
    private Context mContext;

    //constructor
    public Adapter(Context c)
    {

        mContext = c;
    }

    @Override
    public int getCount() {

        return mThumbIds.length;
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
    public View getView(int position, View convertView, ViewGroup viewGroup) { //setting the view for the layout
        ImageView imageView;
        if(convertView == null)
        {  //setting the attributes of the images in the grid layout how the image will be shown in the gridView
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8,8,8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        //setting image resources for the gridView
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    // keep all images in an array images
    public Integer[] mThumbIds = {   //array for images that will be shown in the grid view
            R.drawable.delete, R.drawable.divide, R.drawable.exchange, R.drawable.minus
    };
}
