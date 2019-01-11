package com.example.acer.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private View view;

    public GridViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 130;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            view = new View(context);
            view = inflater.inflate(R.layout.layout_item, null);
        } else {
            view = convertView;
        }

        return view;
    }
}
