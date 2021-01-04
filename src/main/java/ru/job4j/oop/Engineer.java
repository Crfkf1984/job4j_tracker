package ru.job4j.oop;
import java.time.LocalDate;

public class Engineer extends Profession {
    private String lineika;
    private String chertesch;
    private String educationstroitelja;
    private LocalDate daystroitelstwa;

    public Engineer(String name, String surname, String education, String lineika) {
        super(name, surname, education);
    }


 // public Programmer resjob() {};
}
