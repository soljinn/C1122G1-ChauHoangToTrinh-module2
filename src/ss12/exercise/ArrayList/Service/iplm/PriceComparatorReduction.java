package ss12.exercise.ArrayList.Service.iplm;

import ss12.exercise.ArrayList.Model.Product;

import java.util.Comparator;

public class PriceComparatorReduction implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
