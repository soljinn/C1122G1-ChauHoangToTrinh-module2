package casestudy1.furama_resort.controllers;

import casestudy1.furama_resort.services.ICustomerService;
import casestudy1.furama_resort.services.impl.CustomerServiceImpl;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    ICustomerService iCustomerService = new CustomerServiceImpl();
    int choice =0;
    public void displayCustomerManager(){
        do {
            try {
                System.out.println("Customer Management\n" +
                        "1. Display list customer.\n" +
                        "2. Add new customer.\n" +
                        "3. Edit customer.\n" +
                        "4. Return main menu.");
                System.out.println("Please enter your selection!");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        iCustomerService.displayCustomer();
                        break;
                    case 2:
                        iCustomerService.addCustomer();
                        break;
                    case 3:
                        iCustomerService.editCustomer();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Your selection is not available, please re-enter!");
                }
            } catch (NumberFormatException e){
                System.out.println("Please enter number!");
            }
        } while (true);
    }
}
