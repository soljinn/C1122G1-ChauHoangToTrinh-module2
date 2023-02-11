package casestudy1.furama_resort.controllers;

import casestudy1.furama_resort.services.IEmployeeService;
import casestudy1.furama_resort.services.IFacilityService;
import casestudy1.furama_resort.services.impl.EmployeeServiceImpl;
import casestudy1.furama_resort.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class Facility {
    Scanner scanner = new Scanner(System.in);
    IFacilityService iFacilityService = new FacilityServiceImpl();
    public void displayFacilityController(){
        int choice;
        do {
            try {
                System.out.println("Facility Management\n" +
                        "1.Display list facility\n"+
                        "2.Add new facility\n" +
                        "3.Display list facility maintenance\n" +
                        "4.Return main menu");
                System.out.println("Please enter options!");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        iFacilityService.displayFacility();
                        break;
                    case 2:
                        addFacility();
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
    private void addFacility(){
        System.out.println("1. Add villa\n" +
                "2. Add room\n" +
                "3. Back\n" +
                "4. Return menu.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                iFacilityService.addVilla();
                break;
            case 2:
                iFacilityService.addRoom();
                break;
            case 3:
                System.exit(0);
                break;
            case 4:
                return;
            default:

                System.err.println("Your selection has no please re-enter!");
        }
    }
}
