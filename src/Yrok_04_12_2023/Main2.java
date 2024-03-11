package Yrok_04_12_2023;

public class Main2 {
    public static void main(String[] args) {
        Player player = new Player();

        Team team = new Team();
        team.name = "ghfgh";

        team.players[1] = new Player();
        team.players[1].name = "Almat";
        team.players[1].age = 27;
        team.players[1].nationality = "Kazakh";

        team.players[2] = new Player();
        team.players[2].name = "Baga";
        team.players[2].age = 28;
        team.players[2].name = "Kazakh";

//        team.display();

    }
}
