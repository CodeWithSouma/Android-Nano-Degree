package com.example.kolkatatourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LocationDetailsAdapter extends ArrayAdapter<LocationDetails> {


    public LocationDetailsAdapter(@NonNull Activity context, int resource, ArrayList<LocationDetails> location) {
        super(context, resource,location);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_details_adapter_layout, parent, false);
        }

        LocationDetails location = getItem(position);
        ImageView locationImage = convertView.findViewById(R.id.location_image);
        TextView locationName = convertView.findViewById(R.id.location_name);
        TextView addressOfTheLocation = convertView.findViewById(R.id.address_of_the_location);

        locationImage.setImageResource(location.getImageResourceId());
        locationName.setText(location.getLocationName());
        addressOfTheLocation.setText(location.getAddress());

        return convertView;
    }
}
