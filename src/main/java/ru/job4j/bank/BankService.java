package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user))
        users.put(user,new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
            if (user != null) {
                if (!users.get(user).contains(account)) {
                    users.get(user).add(account);
                }
            }
    }

    public User findByPassport(String passport) {
        for (User res : users.keySet()) {
           if (res.getPassport().equals(passport)) {
               return res;
           }
        }
        return null;
    }

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

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
//        User user = findByPassport(srcPassport);
//        User user1 = findByPassport(destPassport);
        Account account = findByRequisite(srcPassport,srcRequisite);
        Account account1 = findByRequisite(destPassport, destRequisite);
        if (account != null && account1 != null && account1.getBalance() >= amount) {
            Double ok = account.getBalance() + account1.getBalance();
            Double res = account.getBalance() - amount;
            account1.setBalance(ok);
        }
        return rsl;
    }
}
