package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Tracker {
    private static Tracker instance = null;
    private final List<Item> items = new ArrayList<>(100);
    private int ids = 1;

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

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
        List<Item> resmassiv = new ArrayList<>();
        //int zicle = 0;
        for (Item res : items) {
            if (res.getName().equals(key)) {
               resmassiv.add(res);
               //zicle++;
            }
        }
        return resmassiv;
    }

 public boolean replace(int id, Item item) {
     int index = indexOf(id);
     boolean rsl = index != -1;
     if (rsl) {
         items.set(index, item);
         return rsl;
     }

     return rsl;
 }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tracker tracker = (Tracker) o;
        return ids == tracker.ids
                && Objects.equals(items, tracker.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, ids);
    }

    public boolean delete(int id) {
       int index = indexOf(id);
       boolean rsl = index != -1;
       if (index != -1) {
           items.remove(index);
       }
       return rsl;

    }
}