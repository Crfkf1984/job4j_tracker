package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        String[] left1 = left.split("\\.");
        String[] right1 = right.split("\\.");
        for (int i = 0; i <left.length() ; i++) {
            for (int j = 0; j < right.length(); j++) {
                int left2 = Integer.parseInt(left1[i]);
                int right2 = Integer.parseInt(right1[j]);
                rsl = left.compareTo(right);
                //return rsl;
            }
        }
        return rsl;
    }
}
