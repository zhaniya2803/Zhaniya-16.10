package Yrok_04_12_2023;

public class FootballMatch extends SportEvent {
    int amountOfPlayers;

    @Override
    void displey () {
        System.out.println("Начало события: " + name);
        System.out.println("Дата провидения " + date);
        System.out.println("Место: " + plase);
        System.out.println("Количество играков: " + amountOfPlayers);
        System.out.println();
    }
}
