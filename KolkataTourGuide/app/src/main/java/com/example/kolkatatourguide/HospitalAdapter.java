package com.example.kolkatatourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

class HospitalAdapter extends BaseAdapter {
    private Context context;
    private String[] nameOfTheHospital;
    private String[] addressOfTheHospital;
    private int[] images;
    public HospitalAdapter(Context activity, String[] nameOfTheHospital, String[] addressOfTheHospital, int[] images) {
        this.context = activity;
        this.nameOfTheHospital = nameOfTheHospital;
        this.addressOfTheHospital = addressOfTheHospital;
        this.images = images;
    }

    @Override
    public int getCount() {
        return nameOfTheHospital.length;
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
            convertView = layoutInflater.inflate(R.layout.hospital_adapter_layout,parent,false);
        }
        ImageView hospitalImage = convertView.findViewById(R.id.hospital_image);
        TextView hospitalName = convertView.findViewById(R.id.hospital_name);
        TextView hospitalAddress = convertView.findViewById(R.id.hospital_address);

        hospitalImage.setImageResource(images[position]);
        hospitalName.setText(nameOfTheHospital[position]);
        hospitalAddress.setText(addressOfTheHospital[position]);

        return convertView;
    }
}
