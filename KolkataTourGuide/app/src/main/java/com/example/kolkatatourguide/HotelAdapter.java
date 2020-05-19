package com.example.kolkatatourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

class HotelAdapter extends BaseAdapter {
    private Context context;
    private String[] nameOfTheHotel;
    private String[] addressOfTheHotel;
    private int[] images;
    public HotelAdapter(Context activity, String[] nameOfTheHotel, String[] addressOfTheHotel, int[] images) {
        this.context = activity;
        this.nameOfTheHotel = nameOfTheHotel;
        this.addressOfTheHotel = addressOfTheHotel;
        this.images = images;
    }

    @Override
    public int getCount() {
        return nameOfTheHotel.length;
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
            convertView = layoutInflater.inflate(R.layout.hotels_adapter_layout,parent,false);
        }
        ImageView hotelImage = convertView.findViewById(R.id.hotel_image);
        TextView hotelName = convertView.findViewById(R.id.hotel_name);
        TextView hotelAddress = convertView.findViewById(R.id.hotel_address);

        hotelImage.setImageResource(images[position]);
        hotelName.setText(nameOfTheHotel[position]);
        hotelAddress.setText(addressOfTheHotel[position]);
        return convertView;
    }
}
