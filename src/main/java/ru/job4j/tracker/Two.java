package ru.job4j.tracker;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Two implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
