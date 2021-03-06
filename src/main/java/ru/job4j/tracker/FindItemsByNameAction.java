package ru.job4j.tracker;
import java.util.List;

public class FindItemsByNameAction implements UserAction {
    private final Output out;

    public FindItemsByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name ?";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Find items by name ?");
        List<Item> items = tracker.findByName(name);
        if (items.size() != 0) {
            for (Item item
                    : items) {
                out.println(item);
            }

        } else {
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
