package ru.job4j.ex;
import java.lang.IllegalArgumentException;

public class Fact {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        if (n > 0) {
            throw new IllegalArgumentException("n меньше 0 - это не допустимо!");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
