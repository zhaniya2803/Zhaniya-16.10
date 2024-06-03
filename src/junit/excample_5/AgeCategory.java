package junit.excample_5;

public class AgeCategory {
    // Данный метод должен возвращать строку ссылаясь на переданный возраст
    public String getCategory(int age) {
        if (age<0) {
            throw new IllegalArgumentException("Число меньше 0");
        }
        if (age<=12) {
            return ("Ребенок");
        } else if (age>12 && age<=17) {
            return ("Подросток");
        }else if (age>17 && age<=64) {
            return ("Взрослый");
        }else {
            return ("Пенсионер");
        }

    }
}