package casestudy1.furama_resort.controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        EmployeeController employee = new EmployeeController();
        CustomerController customer = new CustomerController();
        FacilityController facility = new FacilityController();
        BookingController booking = new BookingController();
        PromotionController promotion = new PromotionController();
        int choice = 0;
        do {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    employee.displayEmployeeController();
                    break;
                case 2:
                    customer.displayCustomerManager();
                    break;
                case 3:
                    facility.displayFacilityController();
                    break;
                case 4:
                    booking.displayBookingController();
                    break;
                case 5:

            }
        } while (true);
    }
}
