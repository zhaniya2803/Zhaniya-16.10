import java.util.Scanner;
public class Yrok_30_10_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(number + " * " + i + " = " + number*i);
//        }

//        System.out.println("Введите три проверки: ");
//        int number = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int number3 = scanner.nextInt();
//        if (number <= number2 && number<=number3){
//            System.out.println(number);
//        } else if (number2<= number3 && number2<= number) {
//            System.out.println(number2);
//        } else {
//            System.out.println(number3);
//        }

//        System.out.println("Введите число: ");
//        int number = scanner.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= number ; i++) {
////            /factorial = factorial + i*factorial;
//            factorial *= i;
////            /System.out.println(factorial);
//        }
//        System.out.println(factorial);
//
//        System.out.println("Введите число: ");
//        int counter = 0;
//        int number = scanner.nextInt();
//        for (int i = 2; i < number ; i++) {
//            if (number % 1 ==0) {
//                counter += 1;
//            }
//            if (counter == 0) {
//                System.out.println(number + "простое число");
//            } else {
//                System.out.println(number + "- не является простом числом");
//            }
//        }
//        int days = 30;
//        int seria = 3;
//        for (int i = 1; i <= days ; i++) {
//            System.out.println( "\nДень " + i + " ");
//            for (int j = 1; j <= seria; j++) {
//                System.out.print("Серия" + j + " ");
//            }
//        }
//        System.out.println("\nУра! Вы прокачали и Java, и английский!");

        int flatsNumber = 5;
        int floorNumber = 10;
        int a = 0;
        for (int i = 1; i <= floorNumber; i++) {
            System.out.println( "Этаж " + i);
            for (int j = 1; j <= flatsNumber ; j++) {
                a += 1 ;
//                int b = (i-1) * flatsNumber +1;
                System.out.println( " квартира " + a + " - доставлено");
            }
        }






    }
}
