package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    private final List<Item> items = new ArrayList<Item>(100);
    private int ids = 1;
    private int size = 0;

    public List<Item> add(Item item) {
        item.setId(ids++);
        items.add(item);
        return items;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> resmassiv = new ArrayList<Item>(size);
        int zicle = 0;
        for (int index = 0; index < size; index++) {
            Item res = items.get(index);
            if (res.getName().equals(key)) {
               resmassiv.add(res);
               zicle++;
            }
        }
        return resmassiv;
    }
    public boolean replace(int id, Item item) {
     int index = indexOf(id);
     boolean rsl = index != -1;
     if (rsl) {
         items.set(index,item);
         item.setId(id);
         return rsl;
     }

     return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
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
           items.remove(items);
           size--;
           return rsl;
       }
       return rsl;

    }
}