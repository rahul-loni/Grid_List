package com.example.list_grid_project;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    public int [] images={
            R.drawable.bal,
            R.drawable.dip,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.log,
            R.drawable.bal,
            R.drawable.dip,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.log,
            R.drawable.bal,
            R.drawable.dip,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.log};

    public ImageAdapter (Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(context);
        imageView.setScaleType(imageView.getScaleType());
        imageView.setImageResource(images[i]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        return imageView;
    }
}
