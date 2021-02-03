package ru.job4j.tracker;
import org.junit.Test;

import java.lang.String;

import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.hamcrest.core.Is.is;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = Tracker.getInstance();
        StartUI.createItem(input, tracker);
        List<Item> created = tracker.findAll();
        Item expected = new Item("Fix PC");
        assertThat(created.get(0).getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = Tracker.getInstance();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), /* id сохраненной заявки в объект tracker. */
                "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whendeteleItem() {
        Tracker tracker = Tracker.getInstance();
        Item item = new Item("item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        StartUI.deteleItem(new StubInput(answers), tracker);
        Item res = tracker.findById(item.getId());
        Item expected = null;
        assertThat(res, is(expected));

    }

    @Test
    public void whenCreateItem() {
        Output out = new ConsoleOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = Tracker.getInstance();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem1() {
        Output out = new ConsoleOutput();
        Tracker tracker = Tracker.getInstance();
        /* Добавим в tracker новую заявку */
        List<Item> item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", "1", "New item name", "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(1).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = Tracker.getInstance();
        /* Добавим в tracker новую заявку */
        List<Item> item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(1), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = Tracker.getInstance();
        UserAction[] actions = {
                new ExitProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "0.  === Exit Program?=== " + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindItemByIdAction() {
        String ln = System.lineSeparator();
        Output out = new StubOutput();
        Tracker tracker = Tracker.getInstance();
        /* Добавим в tracker новую заявку */
        List<Item> item = tracker.add(new Item("item"));
        List<Item> replacedName = item;
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        UserAction[] actions = {
                new FindItemByIdAction(out),
                new ExitProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("0. === Find item by Id? ===" + ln +
                "1.  === Exit Program?=== " + ln +
                tracker.findAll().get(0) + ln +
                "0. === Find item by Id? ===" + ln +
                "1.  === Exit Program?=== " + ln));
    }


    @Test
    public void whenShowallitemsAction() {
        Output out = new StubOutput();
        Tracker tracker = Tracker.getInstance();
        /* Добавим в tracker новую заявку */
        List<Item> item = tracker.add(new Item("item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new ShowallitemsAction(out),
                new ExitProgramAction(out)
        };
        String ln = System.lineSeparator();
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "0. === Find all Name? ===" + ln
                        + "1.  === Exit Program?=== " + ln
                        + tracker.findAll().get(0) + ln
                        + "0. === Find all Name? ===" + ln
                        + "1.  === Exit Program?=== " + ln)
        );
    }

    @Test
    public void whenFindItemsByNameAction() {
        Output out = new StubOutput();
        Tracker tracker = Tracker.getInstance();
        /* Добавим в tracker новую заявку */
        List<Item> item = tracker.add(new Item("item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[]{"0", "item", "1"}
        );
        UserAction[] actions = {
                new FindItemsByNameAction(out),
                new ExitProgramAction(out)
        };
        String ln = System.lineSeparator();
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "0. Find items by name ?" + ln
                        + "1.  === Exit Program?=== " + ln
                        + tracker.findAll().get(0) + ln
                        + "0. Find items by name ?" + ln
                        + "1.  === Exit Program?=== " + ln)
        );
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"7", "0"}
        );
        Tracker tracker = Tracker.getInstance();
        UserAction[] actions = {
                new ExitProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                                "0.  === Exit Program?=== %n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "0.  === Exit Program?=== %n"
                )
        ));

    }
}