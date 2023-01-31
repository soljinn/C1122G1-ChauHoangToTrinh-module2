package ss12.exercise.ArrayList.Service.iplm;

import ss12.exercise.ArrayList.Model.Product;

import java.util.Comparator;

public class PriceComparatorDiscount implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
