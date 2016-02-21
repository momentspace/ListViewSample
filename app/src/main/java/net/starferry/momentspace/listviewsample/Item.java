package net.starferry.momentspace.listviewsample;

/**
 * Created by もめんと on 2016/02/20.
 */
public class Item {
    protected String name;
    protected int index;
    protected String value;

    public Item(int index, String name, String value) {
        this.index = index;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
