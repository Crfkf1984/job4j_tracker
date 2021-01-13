package ru.job4j.poly;

public class Bus implements Vehicle{
//    @Override
//    public void go() {
//        int pointa = 23;
//        int pointb = 25;
//        int allway = pointa + pointb;
//    }
//
//    @Override
//    public void passengers(int temp) {
//         int exita = 10;
//         int exitb = 5;
//         int allexit = exita + exitb;
//    }
//
//    @Override
//    public int fillup(int full) {
//        int price;
//        int fulla = 12;
//        int fullb = 10;
//        int cost = 2;
//        int allfull = fulla + fullb;
//        return price = allfull * cost;
//    }

    @Override
    public void move() {
        System.out.println(getClass().getName() + " едет по дороге");
    }
}
