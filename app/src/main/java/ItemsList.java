import com.wili.android.gdanskit.R;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Damian on 5/20/2017.
 */

public class ItemsList {
    public static ArrayList<Item> companies;

    private void FillLibrary() {
        companies = new ArrayList<Item>();
        companies.add(new Item("Intel", "Juliusza Słowackiego 173", R.drawable.logo_intel, "http://www.intel.com/content/www/us/en/jobs/locations/poland.html"));
        companies.add(new Item("Amazon", "Aleja Grunwaldzka 472", R.drawable.logo_amazon, "http://gdansk-amazon.com/"));
    }

}
