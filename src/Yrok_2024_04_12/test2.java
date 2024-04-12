package Yrok_2024_04_12;

import java.util.function.Predicate;

public class test2 {
    public static void main(String[] args) {
        Predicate<User> isValidationUser = (user) -> {
            if (user.name().isBlank() || user.age()<=0){
                return false;
            }
            return true;
        };

        User user = new User("Almat", 25);
        boolean result = isValidationUser.test(user);
        System.out.println(result);
    }
}

record User(String name, int age){

}
