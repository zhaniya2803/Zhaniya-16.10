package Yrok_2024_05_20;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        LocalDate now1 = LocalDate.now();
//        LocalDate date = LocalDate.of(2026, 9, 12);
//        System.out.println(Period.between(now, date));
//        System.out.println(ChronoUnit.DAYS.between(now, date));

//        LocalDate firstLesson = LocalDate.of(2023, 10, 16);
//        Period age = Period.between(firstLesson, now1);
//        System.out.println("C первого урока прошло: ");
//        System.out.println("Месяцев:" + age.getMonths());
//        System.out.println("Дней: " + age.getDays());


        LocalTime localTime = LocalTime.of(15, 45);
        LocalTime now2 = LocalTime.now();
        Duration duration = Duration.between(localTime, now2);
        System.out.println(duration.toHours());



    }
}
