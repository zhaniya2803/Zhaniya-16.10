import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Yrok_03_11_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Введите пароль: ");
//            String password = scanner.next();
//            if (password.equals("admin")){
//                System.out.println("Доступ разрешен.");
//                break;
//            }
//                System.out.println("Неправильный пароль ");
//        }

//        System.out.print("Введите пароль: ");
//        String password = scanner.next();
//        while (!password.equals("admin")) {
//            System.out.println("Неправильный пароль");
//            System.out.print("Введите пароль: ");
//            password = scanner.next();
//        }
//            System.out.println("Доступ разрешен.");

//        System.out.println("""
//                1. Американо
//                2. Капучино
//                3. Латте
//                0. Завершить""");
//        System.out.println("\nВыберите напиток: ");
//        int a = scanner.nextInt();
//        while (a != 0){
//            if (a == 1){
//                System.out.println("Вы выбрали: Американо");
//            }else if (a == 2) {
//                System.out.println("Вы выбрали: Капучино");
//            }
//            else if (a == 3) {
//                System.out.println("Вы выбрали: Латте");
//            }
//            System.out.println("Меню:\n1.Американо\n2.Капучино\n3.Латте\n0.Завершить");
//            System.out.println("\nВыберите напиток: ");
//            a = scanner.nextInt();
//        }System.out.println("Завершить");

        System.out.print("Введите число: ");
        Random random = new Random();
        int generalNumber = random.nextInt(1, 101);

        while (true) {
            int input = scanner.nextInt();
            if (input == generalNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (input > generalNumber){
                System.out.println("Заданное число МЕНЬШЕ");
            } else {
                System.out.println("Заданное число БОЛЬШЕ");
            }
            System.out.print("Введите число: ");
        }

//        System.out.print("Введите число: ");
//        Random random = new Random();
//        int generalNumber = random.nextInt(1, 101);
//        int input = scanner.nextInt();
//        for (int i = 1; i <= 10 ; i++) {
//            if (input > generalNumber) {
//                System.out.println("Заданное число МЕНЬШЕ");
//            } else if (input < generalNumber) {
//                System.out.println("Заданное число БОЛЬШЕ");
//            }else {
//                System.out.println("Вы угадали!");
//                break;
//            }
//            input = scanner.nextInt();
//        }







    }
}
