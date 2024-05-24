package Yrok_2024_05_24;
import java.util.HashMap;
import java.util.Map;

public class Test {
    static Map<String, String> timeZones = new HashMap<>();

    public static void main(String[] args) {
        fillTimeZones();

        whatTime("Лондон");
        // Сейчас в городе Лондон 17:18
    }

    static void whatTime(String city) {
//        HashMap <String, String> key = new HashMap<>;
//        key.get(city);
    }

    static void fillTimeZones() {
        timeZones.put("Лондон", "Europe/London");
        timeZones.put("Токио", "Asia/Tokyo");
        timeZones.put("Берлин", "Europe/Berlin");
        timeZones.put("Сидней", "Australia/Sydney");
        timeZones.put("Сан-Франциско", "America/Los_Angeles");
        timeZones.put("Париж", "Europe/Paris");
        timeZones.put("Рио-де-Жанейро", "America/Sao_Paulo");
        timeZones.put("Каир", "Africa/Cairo");
        timeZones.put("Сеул", "Asia/Seoul");
        timeZones.put("Шанхай", "Asia/Shanghai");
    }

}
