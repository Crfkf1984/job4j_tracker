package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
          for (int i = 0; i < o1.length(); i++) {
              int left = o1.charAt(i);
              int right = o2.charAt(i);
              rsl = Integer.compare(left, right);
              if (rsl > 0) {
                  return rsl;
              } else if (rsl < 0) {
                  return rsl;
              }
          }
        return rsl;

    }
}
