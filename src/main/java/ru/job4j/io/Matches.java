package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        boolean when = true;
        String name1 = "Андрей";
        String name2 = "Сергей";
;        int rsl = 11;
        int igrock1 = 0;
        int igrock2 = 0;
        while (rsl > 0) {
            if (when) {
                System.out.println("Берите спички, " + name1);
                igrock1++;
                when = false;
            } else {
                System.out.println("Берите спички, " + name2);
                igrock2++;
                when = true;
            }
            Scanner res = new Scanner(System.in);
            int select = Integer.valueOf(res.nextLine());
            if (select <= 3 && select > 0) {
                rsl = rsl - select;
                System.out.println("Осталось " + rsl);
            } else {
                System.out.println("Вы нарушаете правила, попробуйте еще !!!");
                when = when == true ? false : true;
            }
        }

         String res = when == true  ? name2 : name1;
        System.out.println("Победа присуждается : " + res);
    }
}
