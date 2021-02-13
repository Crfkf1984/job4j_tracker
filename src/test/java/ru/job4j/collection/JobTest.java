package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void jobDescByNamevozrastanie() {
        Job sisadmin = new Job("Sisadmin", 1);
        Job uborshik = new Job("Uborshik", 2);
        List<Job> job = Arrays.asList(sisadmin, uborshik);
        Collections.sort(job, new JobDescByName());
        List<Job> expected = Arrays.asList(sisadmin, uborshik);
        assertThat(job, is(expected));
    }

    @Test
    public void jobDescByNameubivanie() {
        Job pecar = new Job("Pecar", 1);
        Job sluga = new Job("Sluga", 2);
        List<Job> job = Arrays.asList(pecar, sluga);
        Collections.sort(job, new JobDescByNameubiv());
        List<Job> expected = Arrays.asList(sluga, pecar);
        assertThat(job, is(expected));
    }

    @Test
    public void jobDescByPriorityvozrastanie() {
        Job pecar = new Job("Pecar", 1);
        Job sluga = new Job("Sluga", 2);
        List<Job> job = Arrays.asList(pecar, sluga);
        Collections.sort(job, new JobDescByPriority());
        List<Job> expected = Arrays.asList(pecar, sluga);
        assertThat(job, is(expected));
    }

    @Test
    public void jobDescByPriorityubivanie() {
        Job pecar = new Job("Pecar", 1);
        Job sluga = new Job("Sluga", 2);
        List<Job> job = Arrays.asList(pecar, sluga);
        Collections.sort(job, new JobDescByPriorityubivanie());
        List<Job> expected = Arrays.asList(sluga, pecar);
        assertThat(job, is(expected));
    }

    @Test
    public void jobDescByPriorityvozrastaniewhen2komp() {
        Job pecar = new Job("Pecar", 1);
        Job sluga = new Job("Sluga", 1);
        List<Job> job = Arrays.asList(pecar, sluga);
        Collections.sort(job, new JobDescByPriority().thenComparing(new JobDescByName())) ;
        List<Job> expected = Arrays.asList(pecar, sluga);
        assertThat(job, is(expected));
    }

    @Test
    public void jobDescByPriorityubivaniewhen2komp() {
        Job pecar = new Job("Pecar", 1);
        Job sluga = new Job("Sluga", 1);
        List<Job> job = Arrays.asList(pecar, sluga);
        Collections.sort(job, new JobDescByPriorityubivanie().thenComparing(new JobDescByNameubiv()));
        List<Job> expected = Arrays.asList(sluga, pecar);
        assertThat(job, is(expected));
    }

}