package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
                if (value[i] == key) {
                    return  i;
                }
            }
        if (rsl == -1) {
            throw new ElementNotFoundException("ElementNotFound!");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] el = {"Petr", "Arsentiev", "Programmist"};
       try {
           System.out.println("Элемент строки = " + indexOf(el, "Programmist"));
       } catch (ElementNotFoundException e) {
           e.printStackTrace();
       }
    }
}
