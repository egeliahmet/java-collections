import com.ahmeteg.ExampleData;
import com.ahmeteg.model.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("ok" );

        List<Product>products=ExampleData.getProducts();
        products.forEach(System.out::println);
        Comparator<Product> compare=new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        };

        Collections.sort(products, compare);


    }

}
