package Yrok_24_11_2023;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String [] colors = {"Красный", "Синий", "Зеленый", "Желтый", "Черный"};

//        for (String color : colors) {
//            System.out.println(color);
//        }

//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }

//        int [] numbers = {90, 20, 3, 50};
//        System.out.println(Arrays.toString(numbers));
//        int sum = 0;

//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println("Сумма всех чисел массива: ");
//        System.out.println(sum);

//        for (int number : numbers) {
//            sum += number;
//        }
//        System.out.println("Сумма всех чисел массива: " + sum);

        Random random = new Random();
        int [] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(1, 100);
//        }
//        System.out.println(Arrays.toString(numbers));
//        double sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        System.out.println("Сумма всех чисел массива: " + sum);
//        System.out.println("Среднее значение: " + sum/ numbers.length);

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 100);
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Сумма всех чисел массива: " + sum);
        System.out.println("Среднее значение: " + sum/ numbers.length);





    }
}
