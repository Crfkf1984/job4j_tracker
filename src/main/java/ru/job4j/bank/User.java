package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель класса описывающая данные пользователя.
 * @author KOTOVICH SERGEY
 * @version 1.0
 */

public class User {

    /**
     * Основные поля класса, которые хранят в себе номер паспорта и ФИО пользователя
     */
    private String passport;
    private String username;

    /**
     * Конструктор класса, который инициализирует поля класса
     * @param passport поле класса, которое хранит в себе данные номера паспорта пользователя
     * @param username поле класса, которое хранит в себе ФИО пользователя
     */

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод, через который можно обратиться к полю класса паспорт
     * @return возвращает данные поля паспорта
     */

    public String getPassport() {
        return passport;
    }

    /**
     * Метод, через который можно переназначить данные поля паспорта
     * @param passport хранит в себе данные номера паспорта
     */

    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод, через который можно обратиться к полю класса ФИО
     * @return возвращает данные поля ФИО
     */

    public String getUsername() {
        return username;
    }

    /**
     * Метод, через который можно переназначить данные поля ФИО
     * @param username хранит в себе данные поля ФИО
     */

    public void setUsername(String username) {
        this.username = username;
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
