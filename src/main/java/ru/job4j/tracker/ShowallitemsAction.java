package ru.job4j.tracker;

import java.util.ArrayList;

public class ShowallitemsAction implements UserAction{
    private final Output out;

    public ShowallitemsAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Find all Name? ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ArrayList<Item> items = tracker.findAll();
        for (Item i :
                items) {
            out.println(i);
        }
        return true;
    }
}
