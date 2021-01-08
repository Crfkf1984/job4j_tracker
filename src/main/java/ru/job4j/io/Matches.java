package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        String name1 = "Андрей";
        String name2 = "Сергей";
;        int rsl = 11;
        int igrock1 = 0;
        int igrock2 = 0;
        while (rsl > 0) {
            System.out.println("Берите спички, " + name1);
            Scanner res = new Scanner(System.in);
            int select = Integer.valueOf(res.nextLine());
            if (select <= 3) {
                rsl = rsl - select;
                 igrock1++;
                System.out.println("Осталось " + rsl);
            } else {
                System.out.println("Вы нарушаете правила, ход переходит другому !!!");
            }
            System.out.println("Берите спички," + name2);
            int select1 = Integer.valueOf(res.nextLine());
            if (select1 <= 3) {
                rsl = rsl - select1;
                igrock2++;
                System.out.println("Осталось " + rsl);
            } else {
                System.out.println("Вы нарушаете правила, ход переходит другому !!!");
            }
        }

        String res = igrock1 > igrock2 ? name1 : name2;
        System.out.println("Победа присуждается : " + res);
    }
}
