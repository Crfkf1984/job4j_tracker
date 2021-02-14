package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String name) {
         desc = name;
    }

    public static void main(String[] args) {
        String issue = "Hello World !";
        Fix item = new Fix(issue);
    }
}
