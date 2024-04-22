package Yrok_2024_04_22;

import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
//        Files.createFile(Paths.get("resources1/input.txt"));

//        Writer writer = new FileWriter("resources1/input.txt");
//
////        for (int i = 0; i <= 23; i++) {
////            for (int j = 0; j < 60; j++) {
////                if (i < 10) {
////                    System.out.print("0");
////                }
////                System.out.print(i + ":");
////                if (j < 10) {
////                    System.out.print("0");
////                }
////                System.out.println(j);
////            }
////        }
//
//
//        for (int hour = 0; hour < 24; hour++) {
//            String formattedHour = (hour < 10 ? "0" : "") + hour;
//            for (int minute = 0; minute < 60; minute++) {
//                String formatterMinute = (minute < 10 ? "0" : "") + minute;
//                writer.write(String.format("%s:%s\n", formattedHour, formatterMinute));
//            }
//        }
//        writer.close();
        Writer writer = new FileWriter("resources1/user.json");
//        User user = new User("someUser",19);
//        writer.write("{" + "\"name\"" + ": " + "\"" + user.getName() + "\"" + ", " + "\"age\"" + ": " + user.getAge() + "}");
//        writer.close();

        List<User> users = List.of(
                new User("User1",15),
                new User("User2",16),
                new User("User3",17),
                new User("User4",18)
        );


        writer.write("[");
        for (User u : users) {

            writer.write("{" + "\"name\"" + ": " + "\"" + u.getName() + "\"" + ", " + "\"age\"" + ": " + u.getAge() + "}");
            writer.write(", ");
        }
        writer.write("]");
        writer.close();


    }
}

class User{
    private  String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
