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
public class Places extends Fragment {



    public Places() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        container = (ViewGroup) inflater.inflate(R.layout.fragment_places, container, false);

        final String[] nameOfThePlace = getResources().getStringArray(R.array.name_of_the_place);
        String[] addressOfThePlace = getResources().getStringArray(R.array.address_of_the_place);
        int [] images = {R.drawable.victoria,R.drawable.hawrah,R.drawable.balur,R.drawable.eden,R.drawable.dakhinaswar};



        ListView placesListView = container.findViewById(R.id.places_list_view);
        PlacesAdapter adapter = new PlacesAdapter(getActivity(),nameOfThePlace,addressOfThePlace,images);
        placesListView.setAdapter(adapter);

        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+nameOfThePlace[position], Toast.LENGTH_SHORT).show();
            }
        });


        // Inflate the layout for this fragment
        return container;

    }


}
