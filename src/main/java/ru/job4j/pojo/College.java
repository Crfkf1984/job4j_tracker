package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Иван");
        student.setSurname("Иванов");
        student.setPatronymic("Иванович");
        student.setDate(LocalDate.now());

        System.out.println(student.getName() + System.lineSeparator() + student.getSurname()
        + System.lineSeparator() + student.getPatronymic() + System.lineSeparator()
        + student.getDate());
    }
}
