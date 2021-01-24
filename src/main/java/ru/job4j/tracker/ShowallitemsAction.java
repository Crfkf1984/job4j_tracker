package ru.job4j.tracker;

public class ShowallitemsAction implements UserAction{
    @Override
    public String name() {
        return "=== Find all Name? ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item i :
                items) {
            System.out.println(i);
        }
        return true;
    }
}
