package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item formatdate = new Item(1, "Petr");
        Item zajavka = new Item();
        Tracker find = new Tracker();
        find.add(zajavka);
        System.out.println(find.findById(1));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        LocalDateTime poluchaemznachenie = formatdate.getCreated();
        String currentDateTimeFormat = poluchaemznachenie.format(formatter);
        System.out.println("Текущая дата : " + currentDateTimeFormat);

    }
}
