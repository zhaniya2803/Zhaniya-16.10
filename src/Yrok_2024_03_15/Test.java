package Yrok_2024_03_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // ascii -127 нету кирилицы
        //unicode -
//        char symbol = 'A';
//        String srt = "C";
//        System.out.println((byte)symbol);
//        System.out.println(srt.hashCode());

//        Map<String, String> stateCapitals = new HashMap<>();
//        stateCapitals.put("Russia", "Moscow");
//        stateCapitals.put("France", "Paris");
//        stateCapitals.put("Germany","Berlin");

        Map<String, Double> currencies = new HashMap<>();
        currencies.put("USD", 447.61);
        currencies.put("EUR", 487.96);
        currencies.put("GBP", 570.92);

        System.out.print("Введите сумму в тенге:");
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextDouble();
        System.out.print("Введите Валюту:");
//        for ();
        String currency = scanner.next();
        if (currencies.containsKey(currency)) {
            System.out.println(sum + " в " + currency + " составляет: " +  (sum / currencies.get(currency)));
        }else {
            System.out.println("Валюта не найдена!");
        }
    }
}
