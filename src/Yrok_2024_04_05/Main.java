package Yrok_2024_04_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Comparator<Product> productByNameComparator = new Comparator<>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.name().compareTo(p2.name());
//            }
//        };
//
//        Comparator<Product> productByPriceComparatorOfIncreasing = new Comparator<>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return Double.compare(p1.price(), p2.price());
//            }
//        };
//        Comparator<Product> productByPriceComparatorOfDescending = new Comparator<>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return Double.compare(p2.price(), p1.price());
//            }
//        };
//
//        Comparator<Product> productByExpiringDurationOfIncreasing = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return Double.compare(p1.expiringDuration(), p2.expiringDuration());
//            }
//        };
//        Comparator<Product> productByExpiringDurationOfDescendin = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return Double.compare(p2.expiringDuration(), p1.expiringDuration());
//            }
//        };
//
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Молоко", 450, 20));
//        products.add(new Product("Йогурт", 250, 14));
//        products.add(new Product("Творожный сыр", 980, 30));
//        products.add(new Product("Сырок", 210, 90));
//        products.add(new Product("Кифир", 500, 14));
//
//        products.sort(productByNameComparator);
//        for (Product product : products){
//            System.out.println(product);
//        }
//
    }
}
//
//record Product(String name, double price, int expiringDuration){
//}