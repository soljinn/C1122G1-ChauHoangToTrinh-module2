package ss17.product_manager.service;

import ss17.product_manager.exception.DuplicateIDException;
import ss17.product_manager.model.ProductManage;
import ss17.product_manager.utils.ReadWriteFile;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    static final Scanner scanner = new Scanner(System.in);
    private static final String FILE_PATH = "D:\\Trinh\\CodeGym\\module2\\src\\ss17\\product_manager\\data\\product.dat";

    @Override
    public void add() {
        List<ProductManage> productManageList = ReadWriteFile.readFile(FILE_PATH);
        int id;
        while (true) {
            try {
                System.out.println("Enter id: ");
                id = Integer.parseInt(scanner.nextLine());
                for (ProductManage product : productManageList) {
                    if (product.getId() == id) {
                        throw new DuplicateIDException("Duplicate id please re-enter!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter number!");
            } catch (DuplicateIDException e) {
                e.getMessage();
            }
        }
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the company: ");
        String manufacturer = scanner.nextLine();
        int price;
        while (true) {
            try {
                System.out.println("Enter price product: ");
                price = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter number: ");
            }
        }
        productManageList.add(new ProductManage(id, name, manufacturer, price));
        ReadWriteFile.writeProductFile(FILE_PATH, productManageList);
        System.out.println("More successful products!");
    }

    @Override
    public void display() {
        List<ProductManage> productList = ReadWriteFile.readFile(FILE_PATH);
        if (!productList.isEmpty()) {
            System.out.println("List of products: ");
            for (ProductManage product : productList) {
                System.out.println(product);
            }
        } else {
            System.out.println("No product exists!");
        }
    }

    @Override
    public void search() {
        List<ProductManage> productList = ReadWriteFile.readFile(FILE_PATH);
        System.out.println("Enter the name of the product you want to search for: ");
        String nameFind = scanner.nextLine();
        boolean isExit = false;
        for (ProductManage product : productList) {
            if (product.getName().toLowerCase().contains(nameFind.toLowerCase())) {
                System.out.println(product);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("No products found!");
        }
    }
}
