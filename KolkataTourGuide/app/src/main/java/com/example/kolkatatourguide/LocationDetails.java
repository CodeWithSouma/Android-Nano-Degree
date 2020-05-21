package com.example.kolkatatourguide;

import android.content.Context;

import java.util.ArrayList;

public  class LocationDetails {
    private String locationName;
    private String address;
    private int imageResourceId;

    public LocationDetails(String locationName, String address,int imageResourceId) {
        this.locationName = locationName;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }



    public String getLocationName() {
        return locationName;
    }

    public String getAddress() {
        return address;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }



}
