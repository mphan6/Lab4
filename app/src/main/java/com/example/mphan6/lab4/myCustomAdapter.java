package com.example.mphan6.lab4;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Special ArrayAdapter for our custom list layout
 * Created by mphan6 on 9/29/2016.
 */
public class myCustomAdapter extends BaseAdapter {
    String[] descriptions;
    int[] images;
    Context context;

    public myCustomAdapter(MainActivity mainActivity, String[] descriptionList, int[] imageList, String[] urlList){
        context = mainActivity;
        images = imageList;
        descriptions = descriptionList;
    }
    @Override
    public int getCount() {
        return descriptions.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        View row;
        //a LayoutInflator is a class that creates a java object from the xml layout
        //we get a LayoutInflator from the Framework by calling the following method
        LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //use the layoutinflator to create a new view of the correct type
        row = inflator.inflate(R.layout.custlistview, null);
        //get textview and set
        TextView textView = (TextView) row.findViewById(R.id.textView);
        textView.setText(descriptions[i]);
        //get imageview and set its source image
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
        imageView.setImageResource(images[i]);

        row.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(context, descriptions[i], Toast.LENGTH_LONG).show();
            }
        });

        return row;
    }
}
