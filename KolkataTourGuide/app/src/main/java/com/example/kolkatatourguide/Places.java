package com.example.kolkatatourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Places extends Fragment {



    public Places() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


      // this is my new code
        container = (ViewGroup) inflater.inflate(R.layout.fragment_places, container, false);

        final String[] nameOfThePlace = getResources().getStringArray(R.array.name_of_the_place);
        String[] addressOfThePlace = getResources().getStringArray(R.array.address_of_the_place);
        int [] images = {R.drawable.victoria,R.drawable.hawrah,R.drawable.balur,R.drawable.eden,R.drawable.dakhinaswar};
        ArrayList<LocationDetails> placesDetails = new ArrayList<LocationDetails>();


        for (int i=0;i<nameOfThePlace.length;i++)
            placesDetails.add(new LocationDetails(nameOfThePlace[i],addressOfThePlace[i],images[i]));



        LocationDetailsAdapter adapter = new LocationDetailsAdapter(getActivity(),R.layout.location_details_adapter_layout,placesDetails);
        ListView placesListView = container.findViewById(R.id.places_list_view);
        placesListView.setAdapter(adapter);

        //listener
        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+nameOfThePlace[position], Toast.LENGTH_SHORT).show();
            }
        });

        return container;
    }


}
