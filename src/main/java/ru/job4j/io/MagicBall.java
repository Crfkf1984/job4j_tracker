package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Хочешь узнать, станешь ли ты программистом или нет?");
        Scanner entertext = new Scanner(System.in);
        String text = entertext.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да");
        } else if (answer == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть!!!");
        }
    }
}
