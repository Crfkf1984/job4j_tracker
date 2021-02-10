package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class OneTest {
    @Test
    public void sortubivanie() {
    List<Integer> list = Arrays.asList(
                new Item("Petr").compareTo(
                new Item("Ivan"))
    );
    List<Integer> expected= Arrays.asList(0);
    assertThat(list,is(expected));
}

}