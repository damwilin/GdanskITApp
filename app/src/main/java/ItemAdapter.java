import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wili.android.gdanskit.R;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Damian on 5/20/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Activity context, ArrayList<Item> itemsList) {
        super(context, 0, itemsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        Item currentItem = getItem(position);

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
        //Find the View that shows website
        TextView website = (TextView) listItemView.findViewById(R.id.website);
        //Set website from current item to that view
        website.setText(currentItem.getWebsite());

        return listItemView;
    }
}
