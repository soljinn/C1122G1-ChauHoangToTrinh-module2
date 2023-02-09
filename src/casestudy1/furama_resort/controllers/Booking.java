package casestudy1.furama_resort.controllers;

import casestudy1.furama_resort.services.IBookingService;
import casestudy1.furama_resort.services.IFacilityService;
import casestudy1.furama_resort.services.impl.BookingServiceImpl;
import casestudy1.furama_resort.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class Booking {
    Scanner scanner = new Scanner(System.in);
    IBookingService iBookingService = new BookingServiceImpl();
    int choice = 0;
    public void displayBookingController(){
        do {
            try {
                System.out.println("Booking Management\n" +
                        "1.Add new booking\n"+
                        "2.Display list booking\n" +
                        "3.Return main menu");
                System.out.println("Please enter options!");
                choice = scanner.nextInt();
            } catch (NumberFormatException e){
                System.out.println("Please enter number!");
            }
        } while (true);
    }
}
