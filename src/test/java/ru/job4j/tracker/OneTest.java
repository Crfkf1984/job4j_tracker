package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class OneTest {
    @Test
    public void sortubivanie() {
    List<Item> list = Arrays.asList(
                    new Item("Petr"),
                            new Item("Ivan"));
        Collections.sort(list, new One());
    List<Item> expected= Arrays.asList(new Item("Petr"),
            new Item("Ivan"));
    assertThat(list,is(expected));
}

}
