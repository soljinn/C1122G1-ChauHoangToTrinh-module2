package casestudy1.furama_resort.controllers;

import casestudy1.furama_resort.services.IEmployeeService;
import casestudy1.furama_resort.services.IFacilityService;
import casestudy1.furama_resort.services.impl.EmployeeServiceImpl;
import casestudy1.furama_resort.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class Facility {
    Scanner scanner = new Scanner(System.in);
    IFacilityService iFacilityService = new FacilityServiceImpl();
    int choice = 0;
    public void displayFacilityController(){
        do {
            try {
                System.out.println("Facility Management\n" +
                        "1.Display list facility\n"+
                        "2.Add new facility\n" +
                        "3.Display list facility maintenance\n" +
                        "4.Return main menu");
                System.out.println("Please enter options!");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        iFacilityService.displayFacility();
                        break;
                    case 2:
                        iFacilityService.addFacility();
                        break;
                    case 3:
                        iFacilityService.displayFacilityMaintenance();
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
