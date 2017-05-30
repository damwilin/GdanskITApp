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

import butterknife.BindView;
import butterknife.ButterKnife;

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
        ViewHolder holder;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        final Item currentItem = getItem(position);
        final Context context = getContext();
        holder = new ViewHolder(listItemView);
        //Set image resource from current item
        holder.logo.setImageResource(currentItem.getLogoResource());
        //Set name from current item to that view
        holder.name.setText(context.getString(currentItem.getName()));
        //Set localization from current item to that view
        holder.localization.setText(context.getString(currentItem.getLocalization()));
        //Set OnClickListener on that View
        holder.localizationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(currentItem);
            }
        });
        //Set OnClickListener on that View
        holder.websiteIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWebsite(context.getString(currentItem.getWebsite()));
            }
        });
        return listItemView;
    }

    //Open map intent for current item location
    private void showMap(Item item) {
        //Get current context
        //Get Uri from current coord
        Context context = listItemView.getContext();
        String coords = readGeo(item, context);
        Uri gmmIntentUri = Uri.parse(coords);
        //Create intent
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(context.getPackageManager()) != null)
            context.startActivity(mapIntent);
    }

    private String readGeo(Item item, Context context) {
        return "geo:0,0?q=" + context.getString(item.getGeo()) + "(" + context.getString(item.getName()) + ")";
    }

    private void showWebsite(String url) {
        Uri webpage = Uri.parse(url);
        Context context = listItemView.getContext();
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(context.getPackageManager()) != null)
            context.startActivity(intent);
    }

    static class ViewHolder {
        @BindView(R.id.logo)
        ImageView logo;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.localization)
        TextView localization;
        @BindView(R.id.localization_icon)
        ImageView localizationIcon;
        @BindView(R.id.website_icon)
        ImageView websiteIcon;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }

    }

}
