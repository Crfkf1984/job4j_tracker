package ru.job4j.oop;

public class Dentist extends Doctor {
    private String burmaschine;
    private String skalpel;
    private String pinzet;
    private int timeprozedur;

    public Dentist(String burmaschine, String skalpel, String pinzet, int timeprozedur) {
        super(burmaschine, skalpel, pinzet, timeprozedur);
    }

// public Profession chistkazuba() {};
}
