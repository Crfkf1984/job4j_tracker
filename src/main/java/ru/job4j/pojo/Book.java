package ru.job4j.pojo;

public class Book {
    private String name;
    private int stranizi;

    public Book(String name, int stranizi) {
        this.name = name;
        this.stranizi = stranizi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStranizi() {
        return stranizi;
    }

    public void setStranizi(int stranizi) {
        this.stranizi = stranizi;
    }
}
