package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String pila;
    private String narcoz;
    private String schpritz;
    private int timeoperation;

    public Surgeon(String pila, String narcoz, String schpritz, int timeoperation) {
        super(pila, narcoz, schpritz, timeoperation);
    }

// public Builder operation() {};

}
