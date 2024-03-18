package Yrok_2024_03_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, List<Integer>> holidays = new HashMap<>();
        holidays.put("January", List.of(1, 2, 7));

        List<Integer> days = new ArrayList<>();
        days.add(8);
        days.add(21);
        days.add(22);
        days.add(23);
        days.add(25);
        holidays.put("March", days);
        for (String holiday : holidays.keySet()) {
            System.out.println(holiday);
            for (Integer day : holidays.get(holiday)) {
                System.out.println("- " + day);
            }
        }


    }
}
