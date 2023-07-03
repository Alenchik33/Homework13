package ru.netology.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void test() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "cola", 50);
        Product product2 = new Product(2, "fanta", 40);
        repo.add(product1);
        repo.add(product2);


        Assertions.assertThrows(NotFoundException.class, () ->
            repo.remove(3)
        );
    }

    @Test
    public void test_2() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(4, "bread", 15);
        Product product2 = new Product(5, "milk", 25);

        repo.add(product1);
        repo.add(product2);

        repo.remove(4);
        Product[] actual = repo.findAll();
        Product[] expected = {product2};
        Assertions.assertArrayEquals(actual, expected);
    }
}
