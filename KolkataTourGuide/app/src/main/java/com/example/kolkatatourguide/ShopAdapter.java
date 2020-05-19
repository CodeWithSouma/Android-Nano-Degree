package com.example.kolkatatourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

class ShopAdapter extends BaseAdapter {
    private Context context;
    private String[] nameOfTheMall;
    private String[] addressOfTheMall;
    private int[] images;

    public ShopAdapter(Context activity, String[] nameOfTheMall, String[] addressOfTheMall, int[] images) {
        this.context = activity;
        this.nameOfTheMall = nameOfTheMall;
        this.addressOfTheMall = addressOfTheMall;
        this.images = images;
    }

    @Override
    public int getCount() {
        return nameOfTheMall.length;
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
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.shoping_adapter_layout,parent,false);
        }
        ImageView shopImage = convertView.findViewById(R.id.shop_image);
        TextView shopName = convertView.findViewById(R.id.shop_name);
        TextView shopAddress = convertView.findViewById(R.id.shop_address);

        shopImage.setImageResource(images[position]);
        shopName.setText(nameOfTheMall[position]);
        shopAddress.setText(addressOfTheMall[position]);

        return convertView;
    }
}
