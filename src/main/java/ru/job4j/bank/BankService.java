package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Модель класса описывающая банковскую систему.
 * @author KOTOVICH SERGEY
 * @version 1.0
 */

public class BankService {

    /**
     * Хранение данных пользователя и счета осуществляется в коллекции HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();


    /**
     * Метод добавляет нового пользователя, также делает проверку,
     * если такой пользователь есть, то не добавляет его
     * @param user заявка на нового пользователя
     */
    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    /**
     * Метод добавляет новый счет пользователю
     * Находит пользователя в системе по номеру паспорта
     * Проверяет есть ли у него уже такой счет с теми же реквизитами,
     * если есть, то не добавляет этот ему счет
     * Если нет, такого счета добавляет
     * @param passport содержит данные номера паспорта пользователя
     * @param account содержит данные реквизитов счета и баланса
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * Метод, который позволяет находить пользователя по номеру паспорта
     * @param passport хранит в себе номер паспорта пользователя
     * @return возвращает пользователя, если находит по номеру паспорта или
     * возвращает null если не находит
     */

    public User findByPassport(String passport) {
        for (User res : users.keySet()) {
            if (res.getPassport().equals(passport)) {
                return res;
            }
        }
        return null;
    }

    /**
     * Метод позволяет находить реквизит счета пользователя
     * Сперва ноходит пользователя по паспорту, потом у  этого пользователя
     * ищет нужный реквизит счета, если находит, то возвращает данные
     * реквизита счета и баланса, если нет возвращает null
     * @param passport хранит номер паспорта пользователя
     * @param requisite хранит реквизит счета пользователя
     * @return возвращает реквизит счета и баланс пользователя
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод осуществляет перевод денежных средств между счетами пользователя
     * Проверяет есть ли достаточный баланс для перевода между счетами, если есть, то переводит,
     * если нет не дает переводить
     * Списывает средства с одного счета на другой
     * Находит счета и проверяет, являются ли они валидными, если он их находит, что они есть у него
     * делает перевод
     * @param srcPassport хранит номер паспорта пользователя
     * @param srcRequisite хранит реквизит счета пользователя
     * @param destPassport хранит номер паспорта пользователя
     * @param destRequisite хранит реквизит счета пользователя
     * @param amount хранит сумму которую нужно перевести
     * @return возвращает тру если перевод удался и ложь, если нет
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account account1 = findByRequisite(destPassport, destRequisite);
        if (account != null && account1 != null && account1.getBalance() >= amount) {
            Double ok = account.getBalance() + account1.getBalance();
            Double res = account.getBalance() - amount;
            account1.setBalance(ok);
        }
        return rsl;
    }
}
