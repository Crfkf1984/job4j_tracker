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
        int list = new Item(2, "Petr").compareTo(
        new Item(1, "Ivan"));
        int expected= 0;
        assertThat(list,is(expected));
    }
}