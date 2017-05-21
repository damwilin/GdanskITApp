package com.wili.android.gdanskit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Damian on 5/20/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    private View listItemView;

    public ItemAdapter(Activity context, ArrayList<Item> itemsList) {
        super(context, 0, itemsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        final Item currentItem = getItem(position);

        //Find the View that shows logo
        ImageView logo = (ImageView) listItemView.findViewById(R.id.logo);
        //Set image resource from current item
        logo.setImageResource(currentItem.getLogoResource());
        //Find the View that shows name
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        //Set name from current item to that view
        name.setText(currentItem.getName());
        //Find the View that shows localization
        TextView localization = (TextView) listItemView.findViewById(R.id.localization);
        //Set localization from current item to that view
        localization.setText(currentItem.getLocalization());
        //Find the View that shows localization icon
        ImageView localizationIcon = (ImageView) listItemView.findViewById(R.id.localization_icon);
        //Set OnClickListener on that View
        localizationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(currentItem.getGeo());
            }
        });
        //Find the View that shows website icon
        ImageView websiteIcon = (ImageView) listItemView.findViewById(R.id.website_icon);
        //Set OnClickListener on that View
        websiteIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWebsite(currentItem.getWebsite());
            }
        });
        return listItemView;
    }

    //Open map intent for current item location
    private void showMap(String coord) {
        //Get current context
        Context context = listItemView.getContext();
        //Get Uri from current coord
        Uri gmmIntentUri = Uri.parse(coord);
        //Create intent
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(context.getPackageManager()) != null)
            context.startActivity(mapIntent);
    }

    private void showWebsite(String url) {
        Uri webpage = Uri.parse(url);
        Context context = listItemView.getContext();
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(context.getPackageManager()) != null)
            context.startActivity(intent);
    }

}
