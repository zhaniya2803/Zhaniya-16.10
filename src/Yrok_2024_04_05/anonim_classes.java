package Yrok_2024_04_05;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class anonim_classes {
    public static void main(String[] args) {
        List<Category> categories = new ArrayList<>();

        Category dairy = new Category("Молочные продукты");
        dairy.addProduct(new Product("Кефир", 420, 7));
        dairy.addProduct(new Product("Творог", 900, 5));
        dairy.addProduct(new Product("Сметана", 600, 2));
        categories.add(dairy);

        Category fruits = new Category("Фрукты");
        fruits.addProduct(new Product("Бананы", 1280, 5));
        fruits.addProduct(new Product("Яблоки", 900, 50));
        fruits.addProduct(new Product("Ананасы", 3800, 24));
        categories.add(fruits);

        Category vegetables = new Category("Овощи");
        vegetables.addProduct(new Product("Помидоры", 420, 14));
        vegetables.addProduct(new Product("Огурцы", 900, 14));
        vegetables.addProduct(new Product("Морковь", 380, 32));
        categories.add(vegetables);

        Category meat = new Category("Мясо");
        meat.addProduct(new Product("Курица", 1280, 90));
        meat.addProduct(new Product("Говядина", 1900, 180));
        categories.add(meat);

        Category cereals = new Category("Крупы");
        cereals.addProduct(new Product("Гречка", 600, 730));
        cereals.addProduct(new Product("Рис", 420, 550));
        cereals.addProduct(new Product("Овсянка", 380, 120));
        categories.add(cereals);

        Comparator<Category> categoryByPriceComparator = new Comparator<Category>() {
            @Override
            public int compare(Category c1, Category c2) {
                return Double.compare(c1.getProductsSum(), c2.getProductsSum());
            }
        };

        Comparator<Category> categoryByAverageExpiryDaysComparator = new Comparator<Category>() {
            @Override
            public int compare(Category c1, Category c2) {
                return Double.compare(c1.averageExpiryDays(), c2.averageExpiryDays());
            }
        };

        System.out.println("By price");
        System.out.println();
        categories.sort(categoryByPriceComparator);
        for (Category category : categories) {
            System.out.println(category.name() + " " + category.getProductsSum());
        }
        System.out.println();
        System.out.println("By AverageExpiryDays");
        categories.sort(categoryByAverageExpiryDaysComparator);
        for (Category category : categories) {
            System.out.println(category.name() + " " + category.averageExpiryDays());
        }

    }
}

record Product(String name, double price, int expiringDays) {
}

record Category(String name, List<Product> products) {
    public Category(String name) {
        this(name, new ArrayList<>());
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // TODO: реализовать метод для получения сумму всех товаров категорий
    public double getProductsSum() {
        double sum =0;
        for (Product product : products) {
            sum += product.price();
        }
        return sum;
    }

    // TODO: реализовать метод для получения среднего количество дней годности
    public double averageExpiryDays() {
        double arg = 0;
        for (Product product : products) {
            arg += product.expiringDays();
        }
        return arg/products.size();
    }
}


