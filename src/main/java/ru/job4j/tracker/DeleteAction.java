package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "=== Delete item: ? ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("=== Enter to item ===");
        if (tracker.delete(id)) {
            System.out.println("Заявка найдена и удалена !");
        } else {
            System.out.println("Такой заявки нет!");
        }
        return true;
    }
}
