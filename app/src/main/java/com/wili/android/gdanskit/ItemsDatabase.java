package com.wili.android.gdanskit;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Damian on 5/20/2017.
 */

public class ItemsDatabase {
    //Add member variables
    private static ArrayList<Item> companies;
    private static ArrayList<Item> academies;
    private static ArrayList<Item> coworking;
    private static ArrayList<Item> events;

    private static void initializeCompanies() {
        //initialize companies
        companies = new ArrayList<Item>();
        //Add all items to companies
        companies.add(new Item(R.string.intel, R.string.intel_location, R.drawable.logo_intel, R.string.intel_web, R.string.intel_geo));
        companies.add(new Item(R.string.amazon, R.string.amazon_location, R.drawable.logo_amazon, R.string.amazon_web, R.string.amazon_geo));
        companies.add(new Item(R.string.comarch, R.string.comarch_location, R.drawable.logo_comarch, R.string.comarch_web, R.string.comarch_geo));
        companies.add(new Item(R.string.spartez, R.string.spartez_location, R.drawable.logo_spartez, R.string.spartez_web, R.string.spartez_geo));
        companies.add(new Item(R.string.lufthansa, R.string.lufthansa_location, R.drawable.logo_lufthansa, R.string.lufthansa_web, R.string.lufthansa_geo));
        companies.add(new Item(R.string.wp, R.string.wp_location, R.drawable.logo_wp, R.string.wp_web, R.string.wp_geo));
        companies.add(new Item(R.string.sygnity, R.string.sygnity_location, R.drawable.logo_sygnity, R.string.sygnity_web, R.string.sygnity_geo));
        companies.add(new Item(R.string.ihs, R.string.ihs_location, R.drawable.logo_ihs, R.string.ihs_web, R.string.ihs_geo));
        companies.add(new Item(R.string.kainos, R.string.kainos_location, R.drawable.logo_kainos, R.string.kainos_web, R.string.kainos_geo));
        companies.add(new Item(R.string.dynatrace, R.string.dynatrace_location, R.drawable.logo_dynatrace, R.string.dynatrace_web, R.string.dynatrace_geo));
    }

    public static ArrayList<Item> getCompanies() {
        if (companies == null) {
            initializeCompanies();
            //Sort all companies
            Collections.sort(companies);
        }
        return companies;
    }

    private static void initializeAcademies() {
        //initialize all academies
        academies = new ArrayList<Item>();
        //add all items to acedemies
        academies.add(new Item(R.string.infoshare, R.string.infoshare_location, R.drawable.logo_infoshare, R.string.infoshare_web, R.string.infoshare_geo));
        academies.add(new Item(R.string.sda, R.string.sda_location, R.drawable.logo_sda, R.string.sda_web, R.string.sda_geo));
        academies.add(new Item(R.string.alx, R.string.alx_location, R.drawable.logo_alx, R.string.alx_web, R.string.alx_geo));
        academies.add(new Item(R.string.codes, R.string.codes_location, R.drawable.logo_codeskills, R.string.codes_web, R.string.codes_geo));
        academies.add(new Item(R.string.cm, R.string.cm_location, R.drawable.logo_codeme, R.string.cm_web, R.string.cm_geo));
    }

    public static ArrayList<Item> getAcademies() {
        if (academies == null) {
            initializeAcademies();
            //Sort academies by name
            Collections.sort(academies);
        }
        return academies;
    }

    private static void initializeCoworking() {
        //Initialize coworking
        coworking = new ArrayList<Item>();
        //Add all items to coworking
        coworking.add(new Item(R.string.wspol, R.string.wspol_location, R.drawable.logo_wspolpracownia, R.string.wspol_web, R.string.wspol_geo));
        coworking.add(new Item(R.string.ikimasa, R.string.ikimasa_location, R.drawable.logo_ikimasa, R.string.ikimasa_web, R.string.ikimasa_geo));
        coworking.add(new Item(R.string.bl, R.string.bl_location, R.drawable.logo_bs, R.string.bl_web, R.string.bl_geo));
        coworking.add(new Item(R.string.o4, R.string.o4_location, R.drawable.logo_o4, R.string.o4_web, R.string.o4_geo));
        coworking.add(new Item(R.string.regus, R.string.regus_location, R.drawable.logo_regus, R.string.regus_web, R.string.regus_geo));
        coworking.add(new Item(R.string.starter, R.string.starter_location, R.drawable.logo_starter, R.string.starter_web, R.string.starter_geo));
    }

    public static ArrayList<Item> getCoworking() {
        if (coworking == null) {
            initializeCoworking();
            //Sort coworking by name
            Collections.sort(coworking);
        }
        return coworking;
    }

    private static void initializeEvents() {
        //Initialize events
        events = new ArrayList<Item>();
        //Add all items to events
        events.add(new Item(R.string.tt, R.string.tt_location, R.drawable.logo_techtalk, R.string.tt_web, R.string.tt_geo));
        events.add(new Item(R.string.fun, R.string.fun_location, R.drawable.logo_fuckup, R.string.fun_web, R.string.fun_geo));
        events.add(new Item(R.string.info, R.string.info_location, R.drawable.logo_infoshare, R.string.info_web, R.string.info_geo));
        events.add(new Item(R.string.hs, R.string.hs_location, R.drawable.logo_hackerspace, R.string.hs_web, R.string.hs_geo));
    }

    public static ArrayList<Item> getEvents() {
        if (events == null) {
            initializeEvents();
            //Sort events by name
            Collections.sort(events);
        }
        return events;
    }


}
