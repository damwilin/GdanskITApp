package com.wili.android.gdanskit;

/**
 * Created by Damian on 5/20/2017.
 */

public class Item {
    private String name;
    private String localization;
    private String geoCoords;
    private int logoResource;
    private String website;

    public Item(String name, String localization, int logoResource, String website, String geoCoords) {
        this.name = name;
        this.localization = localization;
        this.logoResource = logoResource;
        this.website = website;
        this.geoCoords = geoCoords;
    }

    public String getName() {
        return name;
    }

    public String getLocalization() {
        return localization;
    }

    public int getLogoResource() {
        return logoResource;
    }

    public String getWebsite() {
        return website;
    }

    public String getGeo() {
        return "geo:0,0?q=" + geoCoords + "(" + name + ")";
    }

}
