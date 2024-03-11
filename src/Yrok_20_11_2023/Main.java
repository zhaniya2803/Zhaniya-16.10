package Yrok_20_11_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        numbers[1] = 2;
//        int[] numbers2 = {23, 45, 6 , 7 ,78};
//        System.out.println(Arrays.toString(numbers));

//        int [] products = new int[5];
//        products[0] = 120;
//        products[1] = 40;
//        products[2] = 60;
//        products[3] = 80;
//        products[4] = 100;
//
//        System.out.println(Arrays.toString(products));

//        String[] cities = {"Astana","London","Omsk","Ekibastuz","Almaty"};
//
//        String[] countries = new String[5];
//        countries[0] = "Kazakhstan";
//        countries[1] = "USA";
//        countries[2] = "India";
//        countries[3] = "China";
//        countries[4] = "England";

//        Scanner scanner = new Scanner(System.in);
//        String[] currencies = {"USD", "EUR", "JPY", "KZT"};
//        System.out.println("""
//                1. USD
//                2. EUR
//                3. JPY
//                4. KZT """);
//        int

//        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};
//                expenses[2] += 450;
//        System.out.println("Новое значение расходов за среду " + expenses[2] + " тенге.");
//        System.out.println("Самые большие расходы были во вторник, пятницу и субботу");
//        double sum = expenses[1] + expenses[4] + expenses[5];
//        System.out.println("Всего вы потратили в эти дни: " + sum + " тенге.");

//        System.out.println(Arrays.toString(expenses));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите индекс дня, траты за который вы хотите отредактировать: ");
//       int day = scanner.nextInt();
//        System.out.println("введите новую сумму: ");
//        expenses[day - 1]=scanner.nextInt();
//        System.out.println(Arrays.toString(expenses));
//
        String[] dishes = {"Ризотто", "Тартар", "Шурпа", "Панна-котта", "Сашими"}; // Массив
        System.out.println("Вы продегустировали пять блюд.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите индекс блюда, которое хотите переместить:");
        System.out.println("0-Ризотто");
        System.out.println("1-Тартар");
        System.out.println("2-Шурпа");
        System.out.println("3-Панна-котта");
        System.out.println("4-Сашими");

        int firstIndex = scanner.nextInt();

        System.out.println("Введите позицию, на которую хотите его переместить, от 0 до 4:");
        int secondIndex = scanner.nextInt();
        String swap = dishes[firstIndex];
        dishes[firstIndex] = dishes[secondIndex];
        dishes[secondIndex] = swap;

        System.out.println("Ваш рейтинг блюд:");
        System.out.println(dishes[0]);
        System.out.println(dishes[1]);
        System.out.println(dishes[2]);
        System.out.println(dishes[3]);
        System.out.println(dishes[4]);



    }
}
