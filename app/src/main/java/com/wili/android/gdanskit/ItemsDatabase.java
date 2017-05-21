package com.wili.android.gdanskit;

import java.util.ArrayList;

/**
 * Created by Damian on 5/20/2017.
 */

public class ItemsDatabase {
    private static ArrayList<Item> companies;

    private static void initializeCompanies() {
        companies = new ArrayList<Item>();
        companies.add(new Item("Intel", "Juliusza Słowackiego 173", R.drawable.logo_intel, "http://www.intel.com/content/www/us/en/jobs/locations/poland.html", "54.3806544,18.4820779,17"));
        companies.add(new Item("Amazon", "Aleja Grunwaldzka 472", R.drawable.logo_amazon, "http://gdansk-amazon.com/", "54.4029028,18.5696496,17"));
    }

    public static ArrayList<Item> getCompanies() {
        if (companies == null)
            initializeCompanies();
        return companies;
    }

}
