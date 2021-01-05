package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleancode = new Book("Prince", 141);
        Book book2 = new Book("Harry Potter", 312);
        Book book3 = new Book("Ring", 212);
        Book book4 = new Book("Black dog", 144);
        Book[] allbooks = new Book[4];
        allbooks[0] = cleancode;
        allbooks[1] = book2;
        allbooks[2] = book3;
        allbooks[3] = book4;
        Book tempt = allbooks[0];
        allbooks[0] = allbooks[3];
        allbooks[3] = tempt;
        for (int index = 0; index < allbooks.length; index++) {
            Book konteiner = allbooks[index];
            System.out.println(konteiner.getName() + " - " + konteiner.getStranizi());
        }

        for (int index = 0; index < allbooks.length; index++) {
            Book onlycleanbook = allbooks[index];
            if (onlycleanbook.equals(cleancode)) {
                System.out.println(" сравнивываем ссылочные типы");
                System.out.println(onlycleanbook.getName() + " - " + onlycleanbook.getStranizi());
            }
        }
    }
}
