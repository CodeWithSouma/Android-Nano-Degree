package com.example.kolkatatourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


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
        container = (ViewGroup) inflater.inflate(R.layout.fragment_hotels, container, false);

        final String[] nameOfTheHotel = getResources().getStringArray(R.array.name_of_the_hotel);
        String[] addressOfTheHotel = getResources().getStringArray(R.array.address_of_the_hotel);
        int [] images = {R.drawable.westin_kolkata_rajarhat,R.drawable.pride_plaza,R.drawable.lalit_great,R.drawable.jw_marriott,R.drawable.hayatt_regency};



        ListView hotelsListView = container.findViewById(R.id.hotels_list_view);
        HotelAdapter adapter = new HotelAdapter(getActivity(),nameOfTheHotel,addressOfTheHotel,images);
        hotelsListView.setAdapter(adapter);

        hotelsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+nameOfTheHotel[position], Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return container;
    }


}
