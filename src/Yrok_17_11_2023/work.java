package Yrok_17_11_2023;

public class work {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book();
        book.id = 1;
        book.title = "1984";
        book.author = "George Orwell";

        library.availableBook = book;

        Student student = new Student();
        student.id = 1;
        student.name = "Dima";

        Teacher teacher = new Teacher();
        teacher.name = "Artur";
        teacher.subject = "English";
        teacher.id = 5;


        library.lendBookStudent(student);;
        student.display();

        library.returnBookStudent(student);
        student.display();


    }
}
