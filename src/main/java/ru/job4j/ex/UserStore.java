package ru.job4j.ex;
import java.lang.String;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
           for (User user :
                   users) {
               if (users[0].getUsername().equals(login)) {
                   return user;
               }
           }
       throw new UserNotFoundException("Пользователь к сожалению не найден!");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((!user.isValid()) || (user.getUsername().length() <= 3))  {
            throw new UserInvalidException("Пользователь не валидный!");
    }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (user != null) {
                System.out.println(user.getUsername());
            }
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException a) {
            a.printStackTrace();
            //System.out.println(" Пользователь не валидный!");
        } catch (UserNotFoundException d) {
            d.printStackTrace();
            //System.out.println("Пользователь к сожалению не найден!");
        }


    }
}
