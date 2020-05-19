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
public class Hospital extends Fragment {

    public Hospital() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container = (ViewGroup) inflater.inflate(R.layout.fragment_hospital, container, false);

        final String[] nameOfTheHospital = getResources().getStringArray(R.array.name_of_the_hospital);
        String[] addressOfTheHospital = getResources().getStringArray(R.array.address_of_the_hospital);
        int [] images = {R.drawable.fortis_hospital,R.drawable.medica_superspecialty,R.drawable.columbia_asia,R.drawable.bhagirathi_neotia,R.drawable.sri_aurobindo};



        ListView hospitalListView = container.findViewById(R.id.hospital_list_view);
        HospitalAdapter adapter = new HospitalAdapter(getActivity(),nameOfTheHospital,addressOfTheHospital,images);
        hospitalListView.setAdapter(adapter);

        hospitalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+nameOfTheHospital[position], Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return container;
    }
}
