package com.ahmeteg.model;

import java.math.BigDecimal;

public class Product {
    private final  Category category;
    private final String name;
    private final BigDecimal price;


    public Product(Category category,String name, BigDecimal price) {
        this.category=category;
        this.name = name;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
