package ru.job4j.search;
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < this.persons.size(); i++) {
            if (persons.get(i).getName().equals(key)) {
                return result.;
            } else if (persons.get(i).getSurname().equals(key)) {
                return result.;
            } else if (persons.get(i).getAddress().equals(key)) {
                return result.add();
            } else if (persons.get(i).getPhone().equals(key)) {
                return result.add();
            }
        }
        return result;
    }
}
