package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public static void main(String[] args) {
        Item formatdate = new Item(1, "Petr");
        //Item zajavka = new Item();
        Tracker find = Tracker.getInstance();
        find.add(formatdate);
        System.out.println(find.findById(1));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        LocalDateTime poluchaemznachenie = formatdate.getCreated();
        String currentDateTimeFormat = poluchaemznachenie.format(formatter);
        System.out.println("Текущая дата : " + currentDateTimeFormat);

        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = Tracker.getInstance();
        UserAction[] actions = {new CreateAction(output), new ShowallitemsAction(output),
                new ReplaceAction(output), new DeleteAction(output),
                new FindItemByIdAction(output), new FindItemsByNameAction(output),
                new ExitProgramAction(output)};

        new StartUI(output).init(input, tracker, actions);

    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int id = input.askInt("Enter to id edit item");
        String name = input.askStr("Enter to name edit item");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item: ? ===");
        int id = input.askInt("=== Enter to item ===");
        if (tracker.delete(id)) {
            System.out.println("Заявка найдена и удалена !");
        } else {
            System.out.println("Такой заявки нет!");
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
            boolean run = true;
            while (run) {
                this.showMenu(actions);
                int select = input.askInt("Select: ");
                if (select < 0 || select >= actions.length) {
                    out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                    continue;
                }
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            }
            }

        private void showMenu(UserAction[] actions) {
            for (int index = 0; index < actions.length; index++) {
                out.println(index + ". " + actions[index].name());
            }

        }
}
