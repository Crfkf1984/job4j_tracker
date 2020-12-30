package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String eng = "рекой!";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic song = new DummyDic();
        String sey = song.engToRus();
        System.out.println("Песня льется " + sey);
    }
}
