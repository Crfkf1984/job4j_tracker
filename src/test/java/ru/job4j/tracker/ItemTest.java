package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void sortvozrastanie() {
        List<Integer> list = Arrays.asList(5, 4, 3, 1, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(Item.vozrastanie(list), is(expected));
    }

    @Test
    public void sortubivanie() {
        List<Integer> list = Arrays.asList(1, 3, 2,4,5);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertThat(Item.ubivanie(list), is(expected));
    }

}