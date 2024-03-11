import java.util.Scanner;

public class Yrok_27_10_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите температуру воздуха: ");
//        String name = scanner.next( );
//        System.out.println("Hello " + name);

//        System.out.print("Введит е температуру воздуха: ");
//        int a = scanner.nextInt();
//        System.out.println("Температура воздуха "+ a +"С");
//
//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//        System.out.println("Введите третье число: ");
//        int c = scanner.nextInt();
//        System.out.println( "Среднее значение: " + (a+b+c)/3);

//        System.out.println("Введите столицу Австралии: ");
//        String a = scanner.next();
//        if ( a .equals("Канберра")){
//            System.out.println("Правильный ответ");
//        } else {
//            System.out.println("Ваш ответ: " + a);
//            System.out.println("Правильный ответ: Канберра");
//        }

//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//        System.out.println("Введите оператор (+, -, *, /): ");
//        String c = scanner.next();
//        if(c .equals("*")){
//            System.out.println(a * b);
//        } else if (c .equals("/")){
//            System.out.println(a / b);
//        }else if (c .equals("-")){
//            System.out.println(a - b);
//        }else if (c .equals("+")){
//            System.out.println(a + b);
//        } else {
//            System.out.println("Оператор не найдет");
//        }
//        int total = 0;
//        System.out.println("Введите количество : ");
//        int amount = scanner.nextInt();
//        for (int i = 1; i <= amount; i++) {
//            System.out.println("Введите число: ");
//            int number = scanner.nextInt();
//            total += number;
//        }
//        System.out.println(total);
//
        System.out.println( "Введите число: ");
        int total = 0;
        int number = scanner.nextInt();
        for (int i = 3; i <= number ; i++) {
            if (i % 3 == 0){
                System.out.print( i + " ");
               total += i;
            }
        }

        System.out.println(" \nСумма всех чисел " + total);



    }
}
