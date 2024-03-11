package Yrok_04_12_2023;

public class TennisMatch extends SportEvent {
    int court;

    @Override
    void displey () {
        System.out.println("Начало события: " + name);
        System.out.println("Дата провидения " + date);
        System.out.println("Место: " + plase);
        System.out.println("Корд №: " + court);
        System.out.println();
    }
}
