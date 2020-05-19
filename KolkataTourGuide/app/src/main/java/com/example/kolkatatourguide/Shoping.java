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
public class Shoping extends Fragment {

    public Shoping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container = (ViewGroup) inflater.inflate(R.layout.fragment_shoping, container, false);

        final String[] nameOfTheMall = getResources().getStringArray(R.array.name_of_the_mall);
        String[] addressOfTheMall = getResources().getStringArray(R.array.description_of_the_mall);
        int [] images = {R.drawable.quest_mall,R.drawable.south_city_mall,R.drawable.city_center,R.drawable.mani_square_mall,R.drawable.acropolis_mall};



        ListView shopListView = container.findViewById(R.id.shop_list_view);
        ShopAdapter adapter = new ShopAdapter(getActivity(),nameOfTheMall,addressOfTheMall,images);
        shopListView.setAdapter(adapter);

        shopListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+nameOfTheMall[position], Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return container;
    }
}
