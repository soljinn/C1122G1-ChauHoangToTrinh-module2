package ss12.exercise.ArrayList.Controller;

import ss12.exercise.ArrayList.Service.IProductService;
import ss12.exercise.ArrayList.Service.iplm.ProductServiceIplm;

import java.util.Scanner;

public class ProductManager {
    public static void menuProduct(){
        IProductService iProductService = new ProductServiceIplm();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Product Management:\n"+
                    "1. Add management\n"+
                    "2. Edit management\n"+
                    "3. Remove management\n"+
                    "4. Display management\n"+
                    "5. Search management\n"+
                    "6. Sort management\n"+
                    "7. Exit");
            System.out.println("Enter selection: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                   iProductService.add();
                   break;
                case 2:
                    iProductService.edit();
                    break;
                case 3:
                    iProductService.remove();
                    break;
                case 4:
                    iProductService.display();
                    break;
                case 5:
                    iProductService.search();
                    break;
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(1);
            }
        }while (true);
    }
}
