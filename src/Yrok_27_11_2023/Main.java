package Yrok_27_11_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        City [] cities = new City[4];
        City city = new City();
        city.name = "Astana";
        cities[0] = city;

        city = new City();
        city.name = "Almaty";
        cities[1] = city;

        city = new City();
        city.name = "Ekibastuz";
        cities[2] = city;

        city = new City();
        city.name = "Karaganda";
        cities[3] = city;

//        for (City c : cities) {
//            System.out.println(c.name);
//        }

        displayCity(cities);

    }

    static void displayCity (City [] cities) {
        for (City c : cities) {
            System.out.println(c.name);
        }
    }
}
