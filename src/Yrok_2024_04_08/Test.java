package Yrok_2024_04_08;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Bag<Vegetables> bag = new Bag<>();
        bag.addVegetable(new Tomato(500));
        bag.addVegetable(new Celery(1000));
//        bag.addVegetable(new Apple(350));

    }
}
class Bag<V> {
    private final List<V> vegetables;
    public Bag() {
        vegetables = new ArrayList<>();
    }
    public void addVegetable(V vegetable){
        vegetables.add(vegetable);
    }
}

abstract class Vegetables {
    double price;

    public Vegetables(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Tomato extends Vegetables {

    public Tomato(double price) {
        super(price);
    }
}

class Celery extends Vegetables {

    public Celery(double price) {
        super(price);
    }
}

class Apple {
    double price;
}
