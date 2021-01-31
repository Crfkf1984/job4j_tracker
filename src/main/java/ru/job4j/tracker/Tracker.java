package ru.job4j.tracker;

import java.util.Arrays;

public final class Tracker {
    private static Tracker instance = null;

    private Tracker() {

    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] resmassiv = new Item[size];
        int zicle = 0;
        for (int index = 0; index < size; index++) {
            Item res = items[index];
            if (res.getName().equals(key)) {
               resmassiv[zicle] = res;
               zicle++;
            }
        }
        resmassiv = Arrays.copyOf(resmassiv, zicle);
        return resmassiv;
    }
    public boolean replace(int id, Item item) {
     int index = indexOf(id);
     boolean rsl = index != -1;
     if (rsl) {
         items[index] = item;
         item.setId(id);
         return rsl;
     }

     return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
       int index = indexOf(id);
       boolean rsl = index != -1;
       if(rsl) {
           int start = index + 1;
           int distPos = index;
           int length = size - index;
           System.arraycopy(items, start, items, distPos, length);
           items[size - 1] = null;
           size--;
           return rsl;
       }
       return rsl;

    }
}