package com.wili.android.gdanskit;

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
        companies.add(new Item("Intel", "Juliusza Słowackiego 173", R.drawable.logo_intel, "http://www.intel.com/content/www/us/en/jobs/locations/poland.html", "54.380635, 18.484273"));
        companies.add(new Item("Amazon", "Aleja Grunwaldzka 472", R.drawable.logo_amazon, "http://gdansk-amazon.com/", "54.402884, 18.571840"));
        companies.add(new Item("Comarch S.A.", "Aleja Grunwaldzka 103a", R.drawable.logo_comarch, "http://comarch.pl", "54.377891, 18.608608"));
        companies.add(new Item("Spartez", "Norwida 2", R.drawable.logo_spartez, "http://spartez.com", "54.383966, 18.592229"));
        companies.add(new Item("Lufthansa", "Norwida 2", R.drawable.logo_lufthansa, "http://lhsystems.pl", "54.371281, 18.628679"));
        companies.add(new Item("Wirtualna Polska", "Traugutta 115c", R.drawable.logo_wp, "http://wp.pl", "54.369584, 18.608203"));
        companies.add(new Item("Sygnity", "Norwida 4", R.drawable.logo_sygnity, "http://sygnity.pl", "54.383644, 18.591645"));
        companies.add(new Item("IHS Markit", "Jaśkowa Dolina 15", R.drawable.logo_ihs, "http://ihsgdansk.com", "54.374789, 18.604347"));
        companies.add(new Item("Kainos", "Jana z Kolna 11", R.drawable.logo_kainos, "http://kainos.pl", "54.359918, 18.646896"));
        companies.add(new Item("Dynatrace", "Aleja Grunwaldzka 411", R.drawable.logo_dynatrace, "http://gdansk.dynatrace.pl", "54.399043, 18.576568"));
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
        academies.add(new Item("Infoshare Academy", "Aleja Grunwaldzka 472B", R.drawable.logo_infoshare, "http://infoshareacademy.com", "54.403219, 18.569890"));
        academies.add(new Item("Software Development Academy", "Aleja Zwycięstwa 96/98", R.drawable.logo_sda, "http://sdacademy.pl/kursy-trojmiasto/", "54.496816, 18.537886"));
        academies.add(new Item("ALX", "Wały Piastowskie 1", R.drawable.logo_alx, "https://www.alx.pl/", "54.358871, 18.646458"));
        academies.add(new Item("Code Skills", "Wały Piastowskie 1", R.drawable.logo_codeskills, "http://codeskills.pl/", "54.358871, 18.646458"));
        academies.add(new Item("Code:me", "Lęborska 3b", R.drawable.logo_codeme, "http://codeme.pl/", "54.404697, 18.576197"));
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
        coworking.add(new Item("Współpracownia", "Jaśkowa Dolina 60", R.drawable.logo_wspolpracownia, "http://wspolpracownia.pl/", "54.373165, 18.602939"));
        coworking.add(new Item("IKIMASA", "Aleja Grunwaldzka 138", R.drawable.logo_ikimasa, "http://ikimasa.pl", "54.373165, 18.602939"));
        coworking.add(new Item("Business Link", "Aleja Grunwaldzka 472", R.drawable.logo_bs, "http://blpoland.com/trojmiasto/", "54.402876, 18.571894"));
        coworking.add(new Item("O4 Coworking", "Aleja Grunwaldzka 472", R.drawable.logo_o4, "http://o4.network/pl/", "54.402876, 18.571894"));
        coworking.add(new Item("Regus", "Aleja Grunwaldzka 411", R.drawable.logo_regus, "http://www.regus.pl/coworking-space/gdansk", "54.399292, 18.576187"));
        coworking.add(new Item("Concept Space", "plac Górnośląski 21", R.drawable.logo_conceptspace, "http://www.conceptspace.pl/", "54.484304, 18.537087"));
        coworking.add(new Item("Inkubator Starter", "Lęborska 3B", R.drawable.logo_starter, "http://www.inkubatorstarter.pl/", "54.404700, 18.576024"));
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
        events.add(new Item("Tech Talk", "Aleja Grunwaldzka 472B", R.drawable.logo_techtalk, "https://web.facebook.com/pg/codilime/events/?ref=page_internal", "54.403178, 18.569837"));
        events.add(new Item("Fuck Up Nights", "Aleja Grunwaldzka 472B", R.drawable.logo_fuckup, "http://trojmiasto.fuckupnights.pl/", "54.404728, 18.576016"));
        events.add(new Item("Infoshare", "Żaglowa 11", R.drawable.logo_infoshare, "http://infoshare.pl/", "54.386483, 18.634967"));
        events.add(new Item("Hacker:space", "Aleja Grunwaldzka 4/3, 103", R.drawable.logo_hackerspace, "http://hs3.pl/calendar/", "54.374401, 18.619419"));
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
