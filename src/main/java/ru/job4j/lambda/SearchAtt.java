package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getSize() > 100) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getName().contains("bug")) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filters(Attachment value) {
        List<Attachment> rsl = new ArrayList<>();
        if (value.getSize() != 0) {
            Predicate<Attachment> predicate = value -> value.getSize() > 100;
            rsl.add(value);
            return rsl;
        }else if (value != null) {
            Predicate<Attachment> predicate1 = value -> value.getName().contains("bug");
            rsl.add(value);
            return rsl;
        }
    }
}
