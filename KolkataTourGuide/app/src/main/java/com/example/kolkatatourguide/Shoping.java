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
public class Shoping extends Fragment {

    public Shoping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



   // this is my new code
        container = (ViewGroup) inflater.inflate(R.layout.fragment_shoping, container, false);

        final String[] nameOfTheMall = getResources().getStringArray(R.array.name_of_the_mall);
        String[] addressOfTheMall = getResources().getStringArray(R.array.description_of_the_mall);
        int [] images = {R.drawable.quest_mall,R.drawable.south_city_mall,R.drawable.city_center,R.drawable.mani_square_mall,R.drawable.acropolis_mall};

        ArrayList<LocationDetails>shopingMall = new ArrayList<LocationDetails>();
        for (int i =0; i<nameOfTheMall.length; i++)
            shopingMall.add(new LocationDetails(nameOfTheMall[i],addressOfTheMall[i],images[i]));

        ListView shopListView = container.findViewById(R.id.shop_list_view);
        LocationDetailsAdapter adapter = new LocationDetailsAdapter(getActivity(),R.layout.location_details_adapter_layout,shopingMall);
        shopListView.setAdapter(adapter);

        //listener
        shopListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+nameOfTheMall[position], Toast.LENGTH_SHORT).show();
            }
        });

        return container;
    }
}
