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
public class Hospital extends Fragment {

    public Hospital() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       // this is my new code
        container = (ViewGroup) inflater.inflate(R.layout.fragment_hospital, container, false);

        final String[] nameOfTheHospital = getResources().getStringArray(R.array.name_of_the_hospital);
        String[] addressOfTheHospital = getResources().getStringArray(R.array.address_of_the_hospital);
        int [] images = {R.drawable.fortis_hospital,R.drawable.medica_superspecialty,R.drawable.columbia_asia,R.drawable.bhagirathi_neotia,R.drawable.sri_aurobindo};

        ArrayList<LocationDetails>hospital = new ArrayList<LocationDetails>();
        for (int i=0; i<nameOfTheHospital.length;i++)
            hospital.add(new LocationDetails(nameOfTheHospital[i],addressOfTheHospital[i],images[i]));

        ListView hospitalListView = container.findViewById(R.id.hospital_list_view);
        LocationDetailsAdapter adapter = new LocationDetailsAdapter(getActivity(),R.layout.location_details_adapter_layout,hospital);
        hospitalListView.setAdapter(adapter);

        //listener
        hospitalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+nameOfTheHospital[position], Toast.LENGTH_SHORT).show();
            }
        });

        return container;
    }
}
