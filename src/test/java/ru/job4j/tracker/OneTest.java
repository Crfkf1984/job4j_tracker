package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class OneTest {
    @Test
    public void sortvozrastanie() {
    List <Integer> list =  Arrays.asList ( 5 , 4 , 3 , 1 , 2 );
    List<Integer> expected= Arrays.asList ( 1 , 2 , 3 , 4 , 5 );
    assertThat(One.vozrastanie(list),is(expected));
}

}