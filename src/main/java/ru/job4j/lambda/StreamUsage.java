package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, -2, 3, -4);
        List<Integer> bug = num.stream().filter(
                nums-> nums >= 1).collect(Collectors.toList());
        System.out.println(bug);
    }
}
