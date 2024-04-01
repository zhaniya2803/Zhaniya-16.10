package Yrok_2024_04_01;

import java.util.List;

public class Product implements Comparable<Product>{
    private String name;
    private int price;
    private List<String> reviews;


    public Product(String name, int price, List<String> reviews) {
            this.name = name;
            this.price = price;
            this.reviews = reviews;
        }

        @Override
        public int compareTo(Product product) {
            return reviews.size() - product.reviews.size();
        }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", reviews=" + reviews +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }
}

