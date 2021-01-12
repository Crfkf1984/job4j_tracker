package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {
    public static void main(String[] args) {
        Item formatdate = new Item(1, "Petr");
        Item zajavka = new Item();
        Tracker find = new Tracker();
        find.add(formatdate);
        System.out.println(find.findById(1));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        LocalDateTime poluchaemznachenie = formatdate.getCreated();
        String currentDateTimeFormat = poluchaemznachenie.format(formatter);
        System.out.println("Текущая дата : " + currentDateTimeFormat);

        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }

        public void init(Scanner scanner, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                System.out.print("Select: ");
                int select = Integer.valueOf(scanner.nextLine());
                if (select == 0) {
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                } else if (select == 1) {
                    System.out.println("=== Find all Name? ===");
                    Item item = new Item();
                    Item[] items = tracker.findAll(item);
                    System.out.println(items);
                } else if (select == 2) {
                    int id = ;
                    Item item = tracker.findById(id);
                  tracker.replace(id, item);
                } else if (select == 3) {

                } else if (select == 4) {
                    System.out.println("=== Find by id Name? ===");
                    System.out.println("Enter id");
                    int id = Integer.valueOf(scanner.nextLine());
                    tracker.findById(id);
                } else if (select == 5) {

                }else if (select == 6) {
                    run = false;
                }
            }
            }

        private void showMenu() {
            System.out.println("Menu."+ System.lineSeparator()
            + "0. Add new Item" + System.lineSeparator() +
            "1. Show all items" + System.lineSeparator() +
            "2. Edit item" + System.lineSeparator() +
            "3. Delete item" + System.lineSeparator() +
            "4. Find item by Id" + System.lineSeparator() +
            "5. Find items by name" + System.lineSeparator()
            + "6. Exit Program" + System.lineSeparator() +
            "Select:" + System.lineSeparator());
            /* добавить остальные пункты меню. */
        }
}
