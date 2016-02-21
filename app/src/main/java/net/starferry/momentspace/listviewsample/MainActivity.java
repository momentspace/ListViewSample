package net.starferry.momentspace.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> items = new ArrayList<Item>();
//        items.add(new Item(1, "TestItem1", "Value1"));
//        items.add(new Item(2, "TestItem2", "Value2"));
//        items.add(new Item(3, "TestItem3", "Value3"));
//        items.add(new Item(4, "TestItem4", "Value4"));
//        items.add(new Item(5, "TestItem5", "Value5"));


        ItemAdapter adapter = new ItemAdapter(this, items);
        ListView lv = (ListView) findViewById(R.id.itemView);
        lv.setEmptyView(findViewById(R.id.empty));
        lv.setAdapter(adapter);
    }
}
