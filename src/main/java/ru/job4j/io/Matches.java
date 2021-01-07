package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int rsl = 11;
        while (rsl > 0) {
            System.out.println("Берите спички!");
            Scanner res = new Scanner(System.in);
            int select = Integer.valueOf(res.nextLine());
            rsl = rsl - select;
            System.out.println("Осталось " + rsl);
        }
    }
}
