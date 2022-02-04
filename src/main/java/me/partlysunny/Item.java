package me.partlysunny;

import java.util.ArrayList;
import java.util.List;

public class Item {

    //Contains things like stars, enchants, potato books etc.
    private List<Item> components = new ArrayList<>();
    private int price = 0;
    private final String baseId;

    public Item(String baseItemId) {
        this.baseId = baseItemId;
    }

    public void addComponent(Item component) {
        this.components.add(component);
        updatePrice();
    }

    private void updatePrice() {
        price = 0;
        price += ItemInfoRetriever.getPriceOf(baseId);
        for (Item c : components) {
            price += c.getPrice();
        }
    }

    public int getBasePrice() {
        return 0;
    }

    public int getPrice() {
        return price;
    }

}
