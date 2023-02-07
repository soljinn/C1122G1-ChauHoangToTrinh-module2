package ss17.controller;

import ss17.service.IProductService;
import ss17.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void menuProductManage(){
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        do {
            System.out.println("Product Manager \n" +
                    "1. Add Product \n" +
                    "2. Display Product \n" +
                    "3. Search Product \n" +
                    "4. Exit");
            int choice = 0;
            try {
                System.out.println("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Enter number please!");
            }
            switch (choice){
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.search();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Your selection is incorrect, please re-enter ");
            }
        } while (true);
    }
}
