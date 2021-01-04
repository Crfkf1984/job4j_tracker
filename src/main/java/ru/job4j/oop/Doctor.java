package ru.job4j.oop;

public class Doctor extends Profession {
    private String tabletki;
    private String stetoskop;
    private String rezept;
    private int timepriem;

    public Doctor(String tabletki, String stetoskop, String rezept, int timepriem) {
        super(tabletki, stetoskop, rezept);
        this.rezept = rezept;
    }
// public Surgeon osmotr() {};
}
