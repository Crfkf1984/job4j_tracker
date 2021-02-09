package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TwoTest {
    @Test
    public void sortubivanie() {
        List <Integer> list =  Arrays.asList ( 1 , 3 , 2 , 4 , 5 );
        List<Integer> expected= Arrays.asList ( 5 , 4 , 3 , 2 , 1 );
        assertThat(Two.ubivanie(list),is(expected));
    }
}