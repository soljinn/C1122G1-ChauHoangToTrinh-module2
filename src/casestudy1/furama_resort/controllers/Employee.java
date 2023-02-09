package casestudy1.furama_resort.controllers;

import casestudy1.furama_resort.services.IEmployeeService;
import casestudy1.furama_resort.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    IEmployeeService iEmployeeService = new EmployeeServiceImpl();
    int choice = 0;
    public void displayEmployeeController(){
        do {
            try {
                System.out.println("Employee Management\n" +
                        "1.Display list employees\n"+
                        "2.Add new employee\n" +
                        "3.Delete employee\n" +
                        "4.Edit employee\n" +
                        "5.Return main menu");
                System.out.println("Please enter options!");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        iEmployeeService.displayEmployee();
                        break;
                    case 2:
                        iEmployeeService.addEmployee();
                        break;
                    case 3:
                        iEmployeeService.deleteEmployee();
                        break;
                    case 4:
                        iEmployeeService.editEmployee();
                        break;
                    case 5:
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
