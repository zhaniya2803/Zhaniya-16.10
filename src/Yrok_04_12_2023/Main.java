package Yrok_04_12_2023;

import Yrok_17_11_2023.Book;

public class Main {
    public static void main(String[] args) {
        SportEvent sportEvent = new SportEvent();
        sportEvent.name = "Play";
        sportEvent.plase = "Actana";
        sportEvent.date = "12.01.23";
        sportEvent.displey();

        FootballMatch footballMatch = new FootballMatch();
        footballMatch.name = "Astana - Almaty";
        footballMatch.date = "01.12.23";
        footballMatch.plase = "Astana";
        footballMatch.amountOfPlayers = 22;
        footballMatch.displey();

        TennisMatch tennisMatch = new TennisMatch();
        tennisMatch.name = "Tennis";
        tennisMatch.date = "5.01.24";
        tennisMatch.plase = "Italy";
        tennisMatch.court = 6;
        tennisMatch.displey();

        Marathon marathon = new Marathon();
        marathon.name = "Marathon";
        marathon.date = "12.07.24";
        marathon.plase = "China";
        marathon.distance = 200;
        marathon.displey();

    }
}
