package Yrok_2024_03_18;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Excample {
    static Map<String, List<Integer>> subjects = new HashMap<>(){{
        put("математика", List.of(90, 50, 40, 80));
        put("английский язык", List.of(90, 50, 20, 30));
    }};

    public static void main(String[] args) {
        System.out.println("Ввдите предмет: ");
        Scanner scanner = new Scanner(System.in);
        String subject = scanner.nextLine();
        showScores(subject);
    }

    static void showScores(String subject) {
        for(Map.Entry<String, List<Integer>> entry : subjects.entrySet()) {
            String key = entry.getKey();
            if (subject.equals(key)) {
                System.out.println(subject + " " + subjects.get(key));
                double average = 0;
                List<Integer> scores = entry.getValue();
                for (Integer i : subjects.get(key)) {
                    average += i;
                }
                System.out.println("Среднее значение: " +  average/ scores.size());
            }
        }
    }
}
