package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        boolean when = true;
        String name1 = "Андрей";
        String name2 = "Сергей";
        int rsl = 11;
        while (rsl > 0) {
            if (when) {
                System.out.println("Берите спички, " + name1);
                when = false;
            } else {
                System.out.println("Берите спички, " + name2);
                when = true;
            }
            Scanner res = new Scanner(System.in);
            int select = Integer.valueOf(res.nextLine());
            if (select <= 3 && select > 0) {
                rsl = rsl - select;
                System.out.println("Осталось " + rsl);
            } else {
                System.out.println("Вы нарушаете правила, попробуйте еще !!!");
                 when = true ? false : true;
//                if (when == true) {
//                    when = false;
//                } else if (when == false) {
//                    when = true;
//                }
            }
        }
        String res = true ? name2 : name1;
        System.out.println("Победа присуждается : " + res);
    }
}
