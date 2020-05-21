package com.example.kolkatatourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hotels extends Fragment {

    public Hotels() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//      this is my new code

        container = (ViewGroup) inflater.inflate(R.layout.fragment_hotels, container, false);
        final String[] nameOfTheHotel = getResources().getStringArray(R.array.name_of_the_hotel);
        String[] addressOfTheHotel = getResources().getStringArray(R.array.address_of_the_hotel);
        int [] images = {R.drawable.westin_kolkata_rajarhat,R.drawable.pride_plaza,R.drawable.lalit_great,R.drawable.jw_marriott,R.drawable.hayatt_regency};

        ArrayList<LocationDetails> hotels = new ArrayList<LocationDetails>();
        for (int i=0; i<nameOfTheHotel.length; i++)
            hotels.add(new LocationDetails(nameOfTheHotel[i],addressOfTheHotel[i],images[i]));


        ListView hotelsListView = container.findViewById(R.id.hotels_list_view);
        LocationDetailsAdapter adapter = new LocationDetailsAdapter(getActivity(),R.layout.location_details_adapter_layout,hotels);
        hotelsListView.setAdapter(adapter);

        //listener
        hotelsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+nameOfTheHotel[position], Toast.LENGTH_SHORT).show();
            }
        });

        return container;

    }


}
