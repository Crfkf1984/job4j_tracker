package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        if (index == 0) {
            products[0] = products[1];
            products[1] = null;
            return products;
        } else {
            products[1] = null;
            return products;
        }

    }
}
