package Yrok_27_11_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько товара хотите добавить? ");
        Product[] products = new Product[scanner.nextInt()];
        for (int i = 0; i < products.length; i++) {
            Product product = new Product();
            System.out.print("Введите название товара: ");
            product.name = scanner.next();
            scanner.nextLine();
            System.out.print("Введите стоимость товара: ");
            product.price = scanner.nextInt();
            products[i] = product;
        }
        System.out.println("Товары: ");
//        for (int i = 0; i < products.length; i++) {
//            System.out.println(products[i].name + " " + products[i].price);
//        }
//        for (Product p: products) {
//            System.out.println(p.name + " " + p.price);
//        }
        displayProduct(products);
    }
    static void displayProduct (Product [] products) {
        for (Product p: products) {
            System.out.println(p.name + " " + p.price);
        }
    }
}
