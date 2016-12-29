package com.daytightchunks.scootfinder01;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DayTightChunks on 26/12/2016.
 *
 */

public class MotoAdapter extends ArrayAdapter<Moto> {
    /**
     * State, need a color background only.
     */
    private int mColorResourceID;

    /**
     * Constructor (i.e. how to instatiate)
     */
    public MotoAdapter(Context context, ArrayList<Moto> motos, int colorResourceID) {
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, motos);
        mColorResourceID = colorResourceID;
    }

    /**
     * Methods
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     *                    Note: You should check that this view is non-null and of an appropriate type before using.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    // When scrolling, getView gets initiated
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get an instance of the LayoutInflater (a child of View)
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View listItemView = convertView;
        if (listItemView == null) {

            // Specify the XML to inflate & Use the returned View
            listItemView = inflater.inflate(R.layout.moto_item, parent, false);
            /** View method: inflate(int resource, ViewGroup root, boolean attachToRoot) */
        }

        // Get the data item associated with the specified position in the data set.
        Moto currentMoto = getItem(position);

        //long currentCureID = getItemId(position);
        //System.out.print("Current Cure ID: " + currentCureID);
        //Log.v("current cure", );


        // Create a java TextView for the Title & Subtitle associated to the recycled listItemView
        TextView plateTextView = (TextView) listItemView.findViewById(R.id.licence_plate);
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        TextView motoIDTextView = (TextView) listItemView.findViewById(R.id.moto_id);
        TextView distanceTextView = (TextView) listItemView.findViewById(R.id.distance);
        TextView batteryTextView = (TextView) listItemView.findViewById(R.id.battery_level);

        ImageView iconMotoView = (ImageView) listItemView.findViewById(R.id.moto_icon);
        ImageView iconBatteryView = (ImageView) listItemView.findViewById(R.id.battery_icon);

        // Get the text in the data item by using its own methods.
        plateTextView.setText(currentMoto.getLicencePlate());
        addressTextView.setText(currentMoto.getAddress());
        motoIDTextView.setText(currentMoto.getMotoID());
        distanceTextView.setText(currentMoto.getDistance());
        batteryTextView.setText(currentMoto.getBatteryLevel());


        // if (!(currentMoto.getmMotoIconID() > 0)) {
        //    iconView.setVisibility(View.GONE);
        // }
        //Log.v("Word adapter", "image id value: " + currentWord.getImageResourceId());
        //Log.v("Word adapter", "not image id value: " + (!(currentWord.getImageResourceId() > 0 ) ));

        iconMotoView.setImageResource(currentMoto.getMotoIconID());
        iconBatteryView.setImageResource(currentMoto.getBatteryIconID());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.one_moto_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
