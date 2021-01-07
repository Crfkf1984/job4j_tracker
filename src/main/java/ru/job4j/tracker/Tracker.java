package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll(Item znachenie) {
        Item[] findall = new Item[items.length];
        int kopiaitems = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                findall[kopiaitems++] = item;
                break;
            }
        }
        return findall;
    }

    public Item[] findByName(String key) {
        Item[] resmassiv = new Item[items.length];
        int zicle = 0;
        for (int index = 0; index < items.length; index++) {
            Item res = items[index];
            if (res.getName().equals(key)) {
               resmassiv[zicle] = res;
               zicle++;
            }
        }
        resmassiv = Arrays.copyOf(resmassiv, zicle);
        return resmassiv;
    }
}