import java.net.URL;

/**
 * Created by Damian on 5/20/2017.
 */

public class Item {
    private String name;
    private String localization;
    private int logoResource;
    private String website;

    public Item(String name, String localization, int logoResource, String website) {
        this.name = name;
        this.localization = localization;
        this.logoResource = logoResource;
        this.website = website;
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
}
