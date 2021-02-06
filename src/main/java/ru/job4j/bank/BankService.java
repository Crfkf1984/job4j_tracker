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
            if (!users.get(user).contains(account.getRequisite())) {
                users.put(user, new ArrayList<Account>());
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
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}
