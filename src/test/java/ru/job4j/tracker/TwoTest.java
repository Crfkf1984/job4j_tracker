package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TwoTest {
    @Test
    public void sortvozrastanie() {
        List<Item> list = Arrays.asList(new Item(2, "Petr"),
                new Item(1, "Ivan"));
        Collections.sort(list, new Two());
        int expected = 1;
        assertThat(list.get(0).getId(), is(expected));
    }
}