package Yrok_01_12_23;

public class Perfomer {
    String name;
    Song [] soungs;

    void add (Song song) {
        for (int i = 0; i < soungs.length; i++) {
            if (soungs[i] == null) {
                soungs[i] = song;
            }
        }
        System.out.println("Песня добавлена");
    }
}
