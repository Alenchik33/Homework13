package ru.netology.shop;

public class Product {
    protected int id;
    protected String title;
    protected int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && price == product.price && title.equals(product.title);
    }

    public int getId() {
        return id;
    }
}
