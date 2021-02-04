package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (citizen != null) {
            citizens.put(citizen.getPassport(), citizen);
        } else {
            return rsl = true;
        }
        return rsl;
    }


    public Citizen get(String passport) {
        if (citizens.containsKey(passport)) {
            Citizen res = citizens.get(passport);
            return res;
        }
        return null;
    }
}
