package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель класса описывающая данные счета пользователя.
 * @author KOTOVICH SERGEY
 * @version 1.0
 */

public class Account {

    /**
     * Основные поля класса, которые хранят в себе реквизиты счета и его баланс
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор класса, который инициализирует поля класса
     * @param requisite поле класса, которое хранит в себе данные реквизита счета
     * @param balance поле класса, которое хранит в себе баланс счета
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод, через который можно обратиться к полю класса реквизит
     * @return возвращает данные поля реквизит
     */

    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод, через который можно переназначить данные поля реквизит
     * @param requisite хранит в себе данные реквизита счета
     */

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод, через который можно обратиться к полю класса баланс
     * @return возвращает данные поля баланс
     */

    public double getBalance() {
        return balance;
    }

    /**
     * Метод, через который можно переназначить данные поля баланс
     * @param balance хранит в себе данные баланса счета
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод, который сравнивывает содержимое 2 объектов класса между собой
     * @param o Объект класса, который нужно сравнить
     * @return возвращает результат сравнения 2 данных объектов класса
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
