package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> predicate = value -> value.getSize() > 100;
        return filters(list, predicate);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> predicate = value -> value.getName().contains("bug");
        return filters(list, predicate);
    }

    public static List<Attachment> filters(List<Attachment> list,  Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att)) {
                rsl.add(att);
                return rsl;
            }
        }
        return rsl;
    }
}
