package net.starferry.momentspace.listviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by もめんと on 2016/02/20.
 */
public class ItemAdapter extends BaseAdapter {

    protected Context context;
    protected LayoutInflater inflater;
    protected List<Item> items;

    public ItemAdapter(Context context, List<Item> items)
    {
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_view, parent, false);

        ((TextView) convertView.findViewById(R.id.editText)).setText(String.valueOf(items.get(position).getIndex()));
        ((TextView) convertView.findViewById(R.id.editText2)).setText(items.get(position).getName());
        ((TextView) convertView.findViewById(R.id.editText3)).setText(items.get(position).getValue());

        return convertView;
    }
}
