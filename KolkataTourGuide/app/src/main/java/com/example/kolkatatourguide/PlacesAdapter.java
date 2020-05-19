package com.example.kolkatatourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;

class PlacesAdapter extends BaseAdapter {
    private Context context;
    private  String[] nameOfThePlace;
    private String[] addressOfThePlace;
    private int[] images;



    public PlacesAdapter(Context activity, String[] nameOfThePlace, String[] addressOfThePlace, int[] images) {
        this.context = activity;
        this.nameOfThePlace = nameOfThePlace;
        this.addressOfThePlace = addressOfThePlace;
        this.images = images;
    }

    @Override
    public int getCount() {
        return nameOfThePlace.length;
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
           convertView = layoutInflater.inflate(R.layout.places_adapter_layout,parent,false);
       }
        ImageView placeImage = convertView.findViewById(R.id.place_image);
        TextView placeName = convertView.findViewById(R.id.place_name);
        TextView placeAddress = convertView.findViewById(R.id.place_address);

       placeImage.setImageResource(images[position]);
       placeName.setText(nameOfThePlace[position]);
       placeAddress.setText(addressOfThePlace[position]);

        return convertView;
    }

}
