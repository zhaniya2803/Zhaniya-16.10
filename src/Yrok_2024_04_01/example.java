package Yrok_2024_04_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("Milk", 850, List.of("1", "2", "3")));
        productList.add(new Product("Apple", 450, List.of("5")));
        productList.add(new Product("book", 5000, List.of()));
        productList.add(new Product("toy", 3000, List.of("1", "2", "8", "7")));
        productList.add(new Product("Tea", 1500, List.of("8","10")));

        Collections.sort(productList);
        System.out.println(productList);
        System.out.println();
        System.out.println(productList.get(0));
        System.out.println(productList.get(productList.size()-1));

    }
}
