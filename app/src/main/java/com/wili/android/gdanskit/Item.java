package com.wili.android.gdanskit;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.support.annotation.NonNull;

/**
 * Created by Damian on 5/20/2017.
 */

public class Item {
    //Add member variables
    private int nameRes;
    private int localizationRes;
    private int geoCoords;
    private int logoResource;
    private int websiteRes;

    //Constructor
    public Item(int name, int localization, int logoResource, int website, int geoCoords) {
        this.nameRes = name;
        this.localizationRes = localization;
        this.logoResource = logoResource;
        this.websiteRes = website;
        this.geoCoords = geoCoords;
    }

    public int getName() {
        return nameRes;
    }

    public int getLocalization() {
        return localizationRes;
    }

    public int getLogoResource() {
        return logoResource;
    }

    public int getWebsite() {
        return websiteRes;
    }

    public int getGeo() {
        return geoCoords;
    }
}
