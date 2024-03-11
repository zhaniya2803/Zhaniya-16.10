package Yrok_04_12_2023;

public class Marathon extends SportEvent {
    int distance;

    @Override
    void displey () {
        System.out.println("Начало события: " + name);
        System.out.println("Дата провидения " + date);
        System.out.println("Место: " + plase);
        System.out.println("Дистанция: " + date + "м");
        System.out.println();
    }
}
