package ru.job4j.tracker;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class One implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
    public static List<Integer> vozrastanie(List<Integer> one) {
        Collections.sort(one);
        return one;
    }
}
