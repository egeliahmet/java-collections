package com.ahmeteg;

import com.ahmeteg.model.Category;
import com.ahmeteg.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleData {
    private static  final  List<Product> products= Arrays.asList(
            new Product(Category.FOOD,"oranges",new BigDecimal(1.49)),
            new Product(Category.FOOD,"Grauda Cheese",new BigDecimal(2.49)),
            new Product(Category.UTENSILS,"Plates",new BigDecimal(3.49)),
            new Product(Category.CLEANING,"Detergent",new BigDecimal(1.49)),
            new Product(Category.OFFICE,"Pencils",new BigDecimal(5.49)),
            new Product(Category.FOOD,"Rice",new BigDecimal(4.49)),
            new Product(Category.OFFICE,"NoteBook",new BigDecimal(1.65)),
            new Product(Category.FOOD,"cucumber",new BigDecimal(7.49)),
            new Product(Category.OFFICE,"printer",new BigDecimal(1.78)),
            new Product(Category.FOOD,"Penat butter",new BigDecimal(1.55)),
            new Product(Category.FOOD,"Tea",new BigDecimal(3.65)),
            new Product(Category.UTENSILS,"Spoons",new BigDecimal(6.76)),
            new Product(Category.CLEANING,"Dish brush",new BigDecimal(3.54)),
            new Product(Category.FOOD,"Bread",new BigDecimal(1.49))     );

    public static List<Product> getProducts() {
        return products;
    }
}
