package me.partlysunny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Setup {

    private final List<Item> setup = new ArrayList<>();

    public Setup(Item... items) {
        setup.addAll(Arrays.asList(items));
    }

    public List<Item> getSetup() {
        return setup;
    }

    public int getPrice() {
        int price = 0;
        return price;
    }

}
