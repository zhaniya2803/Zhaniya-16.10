package Yrok_17_11_2023;

public class Teacher {
    int id;
    String name;
    String subject;
    String history = " ";
    Book borrowedBook;

    void display () {
        System.out.println("Имя: " + name);
        System.out.println("ID:  " + id);
        System.out.println("");
        if (borrowedBook != null) {
            System.out.println("Текущая книга:" + borrowedBook);
        } else {
            System.out.println("Текущая книга: null" );
        }
    }


}
