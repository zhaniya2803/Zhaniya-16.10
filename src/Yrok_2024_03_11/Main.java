package Yrok_2024_03_11;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("""
                    Выберите действие:
                    1. Добавить задачу
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход"""
            );
            int number = Integer.parseInt(scanner.nextLine());
            checkIsNotNumber(number);
            if (number == 1) {
                System.out.println("Введите задачу для планирования:");
                String task = scanner.nextLine();
                list.add(task);
                System.out.println();
            } else if (number == 2) {
                System.out.println("Список задач: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i+1 + ". " + list.get(i));
                }
                System.out.println();
            } else if (number == 3) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i+1 + ". " + list.get(i));
                }
                System.out.println("Удалить задачу: ");
                int option = Integer.parseInt(scanner.nextLine());
                if (option >= 1 && option <= list.size()) {
                   list.remove(option - 1);
                }else System.out.println("Число не корретное");
                System.out.println();
            } else if (number == 0) {
                return;
            }
        }

    }

    private static void checkIsNotNumber(int number){
        if (number >= 4) {
            System.out.println();
            System.out.println("Введите корректное число");
            System.out.println();
        }
    }



}
