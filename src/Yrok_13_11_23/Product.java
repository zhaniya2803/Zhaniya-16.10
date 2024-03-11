package Yrok_13_11_23;

public class Product {
    String name;
    double price;

    void compareWithOtherProduct (Product product) {
        if (price < product.price) {
            System.out.println("Товар " + name + " дешевле чем " + product.name );
        } else if (product.price < price) {
            System.out.println("Товар " + name + " дороже чем " + product.name);
        }else {
            System.out.println("Товары имеют одинаковую стоимость");
        }
    }

}
