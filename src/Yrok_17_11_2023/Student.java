package Yrok_17_11_2023;

public class Student {
    String name;
    int id;
    String history = " ";
    Book borrowedBook;

    void display () {
        System.out.println("Имя: " + name);
        System.out.println("Номер студенческого билета: " + id);
        if (borrowedBook != null) {
            System.out.println("Текущая книга: " + borrowedBook.title);
        } else {
            System.out.println("Текущая книга: null" );
        }
        System.out.println("История: " + history);

    }
}
