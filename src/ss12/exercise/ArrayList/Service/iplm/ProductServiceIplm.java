package ss12.exercise.ArrayList.Service.iplm;

import ss12.exercise.ArrayList.Model.Product;
import ss12.exercise.ArrayList.Service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceIplm implements IProductService {
    private static  Scanner scanner = new Scanner(System.in);
    private static  List<Product> productList = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Enter product id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        int price = Integer.parseInt(scanner.nextLine());
        productList.add(new Product(id, name, price));
        System.out.println("Added new!");
    }

    @Override
    public void edit() {
        System.out.println("Enter the product id to edit: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean isExit = false;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idEdit) {
                System.out.println("Products you need to edit: " + productList.get(i));
                System.out.println("Do you want to fix?\n" +
                        "1. Yes.\n" +
                        "2. No.");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    System.out.println("Enter a new name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter new price: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    productList.set(i, new Product(productList.get(i).getId(), name, price));
                    System.out.println("Editing is successful!");
                }
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found!");
        }
    }

    @Override
    public void remove() {
        System.out.println("Enter the id to delete: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExit = false;
        for (Product product : productList) {
            if (product.getId() == idRemove) {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    productList.remove(product);
                    System.out.println("Delete successfully!");
                }
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found!");
        }
    }

    @Override
    public void display() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.println("Enter the name of the product you are looking for: ");
        String nameSearch = scanner.nextLine();
        boolean isExit = false;
        for (Product product : productList) {
            if (product.getName().contains(nameSearch)) {
                System.out.println(product);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Not found!");
        }
    }

    @Override
    public void sort() {
        int choice;
        do {
            System.out.println("Arrange\n" +
                    "1. Ascending.\n" +
                    "2. Decrease.");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice != 1 && choice != 2) {
                System.out.println("Retype!");
            }
        } while (choice != 1 && choice != 2);
        PriceComparatorDiscount priceComparatorDiscount = new PriceComparatorDiscount();
        PriceComparatorReduction priceComparatorReduction = new PriceComparatorReduction();
        if (choice == 1) {
            productList.sort(priceComparatorDiscount);
            System.out.println("Sort products by increasing price!");
        } else {
            productList.sort(priceComparatorReduction);
            System.out.println("Sort products by discount!");
        }
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
