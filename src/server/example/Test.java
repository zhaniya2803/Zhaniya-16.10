package server.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Random;

public class Test {
    static final int PORT = 8080;
    public static void main(String[] args) throws IOException {

        HttpServer httpServer = HttpServer.create(new InetSocketAddress(PORT),0);
        httpServer.createContext("/day", new WeekHandler());
        httpServer.createContext("/count", new CounterHandler());

        httpServer.createContext("/user", Test::getUsersHandler);


        httpServer.start();
    }
    static void getUsersHandler(HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200, 0);

        User user1 = new User("firstUser", 20);
        User user2 = new User("secondUser", 21);
        User user3 = new User("thirdUser", 22);
        User user4 = new User("fourthUser", 23);

        List<User> users = List.of(user1, user2, user3, user4);

        String response = users.toString();
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}

record User(String name, int age) {
    // TODO
    @Override
    public String toString() {
        return "{" +
                "\"name\":" + "\""+name + "\"" +"," +
                "\"age\": " + age +
                "}";
    }
}



class WeekHandler implements HttpHandler{

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        httpExchange.sendResponseHeaders(200,0);
        Random random = new Random();
        String[] daysOFWeek = {"MON", "TUE","WED","THU","FRI","SAT","SUM"};
        int randomIndex = random.nextInt(daysOFWeek.length);
        String response = daysOFWeek[randomIndex];
        try (OutputStream os = httpExchange.getResponseBody()){
            os.write(response.getBytes());
        }

    }
}

class CounterHandler implements HttpHandler{
    int start = 1;
    @Override
    public void handle(HttpExchange countExchange) throws IOException {
        countExchange.sendResponseHeaders(200,0);
        String response = "Hit: " + start;
        start++;
        try (OutputStream os = countExchange.getResponseBody()){
            os.write(response.getBytes());
        }

    }
}
class HelloHandler implements HttpHandler{
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        //200
       exchange.sendResponseHeaders(200,0);
       String response = "Hello world";

       try (OutputStream os = exchange.getResponseBody()){
          os.write(response.getBytes());
       }
    }
}
