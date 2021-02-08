package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Item implements Comparator<Item> {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {

    }

    public Item(String name) {
     this.name = name;
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name) {
    this.id = id;
    this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created=" + created +
                '}';
    }

    @Override
    public int compare(Item o1, Item o2) {
        return 0;
    }

    public static List<Integer> vozrastanie(List<Integer> item) {
        Collections.sort(item);
        return item;
    }

    public static List<Integer> ubivanie(List<Integer> item) {
        Collections.sort(item, Collections.reverseOrder());
        return item;
    }
}