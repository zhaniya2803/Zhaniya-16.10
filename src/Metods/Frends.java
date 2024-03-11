package Metods;

public class Frends {
    void fromFriendsCount(int friends){
        if (friends == 0) {
            System.out.println("У вас нет друзей");
        } else if (friends == 1) {
            System.out.println("У вас " + friends + " друг");
        } else if (friends == 3 || friends == 4 || friends == 2) {
            System.out.println("У вас " + friends + " другa");
        } else if (friends < 0) {
            System.out.println("Ошибка");
        } else {
            System.out.println("У вас " + friends + " друзей");
        }
    }
}
