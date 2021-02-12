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
        Item petr =  new Item("Petr");
        Item ivan = new Item("Ivan");
    List<Item> list = Arrays.asList(
            petr, ivan);
        Collections.sort(list, new One());
    List<Item> expected = Arrays.asList(petr, ivan);
    assertThat(list, is(expected));
}

}
