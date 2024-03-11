package Yrok_17_11_2023;

public class Library {
    Book availableBook;

    void lendBookStudent (Student student){
        if (availableBook != null && student.borrowedBook == null) {
            student.borrowedBook = availableBook;
            System.out.println("Cтудент " + student.name + " взял книгу " + availableBook.title);
            student.history += student.borrowedBook.title;
            availableBook = null;
        }else {
            System.out.println("Условие отрицательное");
        }
    }

    void returnBookStudent (Student student) {
        if (student.borrowedBook != null && availableBook == null) {
            availableBook = student.borrowedBook;
            System.out.println("Cтудент " + student.name + " вернул книгу " + availableBook.title);
            student.history += student.borrowedBook.title;
            student.borrowedBook = null;
        }else {
            System.out.println("Условие отрицательное");
        }

    }

    void lendBookTeacher (Teacher teacher){
        if (availableBook != null && teacher.borrowedBook == null) {
            teacher.borrowedBook = availableBook;
            availableBook = null;
            teacher.history =" ";
        }else {
            System.out.println("Условие отрицательное");
        }
    }

    void returnBookTeacher (Teacher teacher) {
        if (teacher.borrowedBook != null && availableBook == null) {
            availableBook = teacher.borrowedBook;
            teacher.borrowedBook = null;
            teacher.history =" ";
        }else {
            System.out.println("Условие отрицательное");
        }

    }
}
