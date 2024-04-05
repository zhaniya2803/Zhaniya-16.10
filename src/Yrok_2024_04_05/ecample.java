package Yrok_2024_04_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ecample {
    public static void main(String[] args) {
        Comparator<Film> filmComparator = new Comparator<>() {
            @Override
            public int compare(Film fistFilm, Film secondFilm) {
                return Double.compare(secondFilm.rating(), fistFilm.rating());
            }
        };
        List<Film> films = new ArrayList<>();
        films.add(new Film("film1", 9.1, 2000));
        films.add(new Film("film2", 8.1, 2005));
        films.add(new Film("film3", 7.1, 2013));
    }
}
record  Film (String titile, double rating, int year){
}

