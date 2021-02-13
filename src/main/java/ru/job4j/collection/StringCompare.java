package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("");
        String[] right = o2.split("");
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                char left1 = o1.charAt(i);
                char right1 = o1.charAt(j);
                int rsl = Character.compare( left1, right1);
            }
        }

        return rsl;
    }
}
