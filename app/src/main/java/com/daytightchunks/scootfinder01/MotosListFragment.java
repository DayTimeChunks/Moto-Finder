package com.daytightchunks.scootfinder01;

// import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.bumptech.glide.Glide;

/**
 * Created by DayTightChunks on 22/12/2016.
 */

public class MotosListFragment extends Fragment {

    public MotosListFragment() {
        // required empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_moto_list, container, false);

        ArrayList<Moto> cures = new ArrayList<Moto>();
        cures.add(new Moto("F-XC4578", "Friedriech St. 160, 60782 Frankfurt am Main", "Yugo-1234", "378 m", "23%", R.mipmap.ic_motorcycle_black_24dp, R.drawable.ic_battery_charging_full_black_24dp));
        cures.add(new Moto("HH-KJ4578", "Friedriech St. 160, 60782 Frankfurt am Main", "Ecoo-4099", "402 m", "100%", R.mipmap.ic_motorcycle_black_24dp, R.drawable.ic_battery_charging_full_black_24dp));
        cures.add(new Moto("WI-PM4578", "Friedriech St. 160, 60782 Frankfurt am Main", "Yugo-7850", "423 m", "90%", R.mipmap.ic_motorcycle_black_24dp, R.drawable.ic_battery_charging_full_black_24dp));
        cures.add(new Moto("K-PA4578", "Friedriech St. 160, 60782 Frankfurt am Main", "Motit-7734", "500 m", "56%", R.mipmap.ic_motorcycle_black_24dp, R.drawable.ic_battery_charging_full_black_24dp));
        cures.add(new Moto("KS-MN8978", "Friedriech St. 160, 60782 Frankfurt am Main", "Yugo-594", "800 m", "70%", R.mipmap.ic_motorcycle_black_24dp, R.drawable.ic_battery_charging_full_black_24dp));
        cures.add(new Moto("F-1234578", "Friedriech St. 160, 60782 Frankfurt am Main", "Ecoo-8764", "1.1 km", "27%", R.mipmap.ic_motorcycle_black_24dp, R.drawable.ic_battery_charging_full_black_24dp));
        cures.add(new Moto("F-1234578", "Friedriech St. 160, 60782 Frankfurt am Main", "Yugo-3394", "1.2 km", "33%", R.mipmap.ic_motorcycle_black_24dp, R.drawable.ic_battery_charging_full_black_24dp));

        MotoAdapter adapter = new MotoAdapter(getActivity(), cures, R.color.light_background);

        ListView listView = (ListView) rootView.findViewById(R.id.moto_list);

        listView.setAdapter(adapter);
        return rootView;

    }

    @Override
    public void onStop() { super.onStop(); }
}
