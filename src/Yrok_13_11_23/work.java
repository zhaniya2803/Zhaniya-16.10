package Yrok_13_11_23;

public class work {
    public static void main(String[] args) {
        Account account = new Account();
        account.ower = "Dima";
        account.add(2500);

        Product product = new Product();
        product.name = "Milk";
        product.price = 420;

        Product product1 = new Product();
        product1.name = "Хлопья";
        product1.price = 700;

        Product product2 = new Product();
        product2.name = "Хлеб";
        product2.price = 420;

        account.pay(product);
        account.pay(product1);
        account.pay(product2);
        account.display();

//        product.compareWithOtherProduct(product1);
//        product1.compareWithOtherProduct(product);
//        product2.compareWithOtherProduct(product);

    }
}
