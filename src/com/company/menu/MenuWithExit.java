package com.company.menu;

import java.util.Arrays;

public class MenuWithExit extends Menu{
//    public MenuWithExit(InputOutput inputOutput, Item[] items) {
//        super(inputOutput, Arrays.asList(items, new ExitItem(inputOutput)).toArray(new Item[]{}));
//    }
    public MenuWithExit(InputOutput inputOutput, Item[] items) {
        super(inputOutput, items);
        this.items = Arrays.copyOf(items, items.length + 1);
        this.items[items.length] = new ExitItem(inputOutput);
    }

}
