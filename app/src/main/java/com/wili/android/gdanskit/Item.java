package com.wili.android.gdanskit;

import android.content.res.Resources;
import android.support.annotation.NonNull;

/**
 * Created by Damian on 5/20/2017.
 */

public class Item implements Comparable<Item> {
    //Add member variables
    private int nameRes;
    private int localizationRes;
    private int geoCoordsRes;
    private int logoResource;
    private int websiteRes;

    //Constructor
    public Item(int name, int localization, int logoResource, int website, int geoCoords) {
        this.nameRes = name;
        this.localizationRes = localization;
        this.logoResource = logoResource;
        this.websiteRes = website;
        this.geoCoordsRes = geoCoords;
    }

    public String getName() {
        return getString(nameRes);
    }

    public String getLocalizationRes() {
        return getString(localizationRes);
    }

    public int getLogoResource() {
        return logoResource;
    }

    public String getWebsiteRes() {
        return getString(websiteRes);
    }

    public String getGeo() {
        return "geo:0,0?q=" + getString(geoCoordsRes) + "(" + getName() + ")";
    }

    //Compare by item nameRes
    @Override
    public int compareTo(@NonNull Item o) {
        return this.getName().toLowerCase().compareTo(o.getName().toLowerCase());
    }

    private String getString(int resourceID) {
        return Resources.getSystem().getString(resourceID);
    }
}
